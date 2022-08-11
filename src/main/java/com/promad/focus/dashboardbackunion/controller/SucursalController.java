package com.promad.focus.dashboardbackunion.controller;

import com.promad.focus.dashboardbackunion.dash.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.promad.focus.dashboardbackunion.service.SucursalService.SUCURSALES;

@RestController
@CrossOrigin("*")
@RequestMapping(value = {"/Dashboard"})
public class SucursalController {

    private static final Logger log = LoggerFactory.getLogger(SucursalController.class);

    @RequestMapping(value = {"/ConsultaEvento2/{fechaInicio}/{fechaFin}/{region}/{inmuebles}"}, method = {RequestMethod.GET, RequestMethod.OPTIONS})
    @ResponseBody
    public ResponseEntity<?> getDashboard(@PathVariable String fechaInicio, @PathVariable String fechaFin, @PathVariable String region, @PathVariable String inmuebles) {
        MsgResponse msgResponse;
        Map<String, Object> response = new HashMap<>();
        RestTemplate restTemplate = new RestTemplate();
        try {
            Map<String, String> params = setParams(fechaInicio, fechaFin, region, inmuebles);
            String URL = "/SIAE_CORE/Dashboard/ConsultaEvento/{fechaInicio}/{fechaFin}";

            msgResponse = restTemplate.getForObject(SUCURSALES.get(0).getUrl().concat(URL), MsgResponse.class, params);

            return new ResponseEntity<>(msgResponse, HttpStatus.OK);
        } catch (Exception e) {
            return errorDeAccesoADatos(response, e);
        }
    }

    @RequestMapping(value = {"/ConsultaEvento/{fechaInicio}/{fechaFin}/{region}/{inmuebles}"}, method = {RequestMethod.GET, RequestMethod.OPTIONS})
    @ResponseBody
    public ResponseEntity<?> getDashboard2(@PathVariable String fechaInicio, @PathVariable String fechaFin, @PathVariable String region, @PathVariable String inmuebles) {
        MsgResponse msgResponse = new MsgResponse();
        MsgResponseDetalle detalle = new MsgResponseDetalle();
        Map<String, Object> response = new HashMap<>();
        RestTemplate restTemplate = new RestTemplate();

        msgResponse.setGlobalRegionEvento(new ArrayList<>());
        msgResponse.setGlobalPrioridadEvento(new ArrayList<>());
        msgResponse.setGlobalDetalle(new GlobalPrioridadEventoDetalle());
        msgResponse.setEventoAnioMes(new ArrayList<>());
        msgResponse.setActivacionAlarma(new BodyActivacionAlarma());
        msgResponse.setEventosAnalitico(new BodyEventosAnalitico());
        msgResponse.getEventosAnalitico().setAnalitico(new ArrayList<>());

        Map<String, String> params = setParams(fechaInicio, fechaFin, region, inmuebles);
        String URLDASHBOARD = "/SIAE_CORE/Dashboard/ConsultaEvento/{fechaInicio}/{fechaFin}";
        String URLDETALLE = "/SIAE_CORE/Dashboard/ConsultaEvento/{fechaInicio}/{fechaFin}/{region}/{inmuebles}";

        for (int i = 0; i < SUCURSALES.size(); i++) {
            MsgResponse msgResponseSucursal;
            try {
                msgResponseSucursal = restTemplate.getForObject(SUCURSALES.get(i).getUrl().concat(URLDASHBOARD), MsgResponse.class, params);
                assert msgResponseSucursal != null;
                addSucursalResponse(msgResponseSucursal, msgResponse);
                log.info("Sucursal " + i + " estatus: " + msgResponseSucursal.getEstatus());
            } catch (Exception e) {
                log.info("Error de sucursal " + i + ": " + e.getMessage());
            }
        }

        if (!region.equals("0")) {
            int indice = -1;
            for (int i = 0; i < SUCURSALES.size(); i++) {
                System.out.println("SUCURSALES.get(i).getId() = " + SUCURSALES.get(i).getId());
                System.out.println("Integer.parseInt(region) = " + region);
                if (SUCURSALES.get(i).getNombre().equals(region)) indice = i;
                System.out.println("indice = " + indice);
            }
            if (indice != -1) {
                try {
                    detalle = restTemplate.getForObject(SUCURSALES.get(indice).getUrl().concat(URLDETALLE), MsgResponseDetalle.class, params);
                    msgResponse.setDetalle(detalle);
                } catch (Exception e) {
                    log.info("Error de sucursal Datelle " + region + ": " + e.getMessage());
                }
            } else {
                log.info("Region: " + region + " desconocida.");
            }
        }

        if (msgResponse.getGlobalPrioridadEvento().isEmpty() && msgResponse.getGlobalRegionEvento().isEmpty()){
            msgResponse.setEstatus("01");
            msgResponse.setMensaje("No existen registros");
        } else {
            msgResponse.setEstatus("00");
            msgResponse.setMensaje("Ok");
        }
        return new ResponseEntity<>(msgResponse, HttpStatus.OK);
    }

    private void addSucursalResponse(MsgResponse msgResponseSucursal, MsgResponse msgResponse) {
        List<GlobalRegionEvento> globalRegionEventoList = new ArrayList<>(msgResponseSucursal.getGlobalRegionEvento());
        globalRegionEventoList.forEach(msgResponse::addGlobalRegionEvento);
        List<GlobalPrioridadEvento> globalPrioridadEventoList = new ArrayList<>(msgResponseSucursal.getGlobalPrioridadEvento());
        globalPrioridadEventoList.forEach(msgResponse::addGlobalPrioridadEvento);
        addGlobalEventoDetalle(msgResponseSucursal, msgResponse);
        msgResponse.addTotalEventosNacional(msgResponseSucursal.getTotalEventosNacional());
        List<BodyEventoAnioMes> bodyEventoAnioMesList = new ArrayList<>(msgResponseSucursal.getEventoAnioMes());
        bodyEventoAnioMesList.forEach(msgResponse::addEventoAnioMes);
        addActivacionAlarma(msgResponseSucursal, msgResponse);
        BodyEventosAnalitico bodyEventosAnalitico = msgResponseSucursal.getEventosAnalitico();
        addEventosAnalitico(bodyEventosAnalitico, msgResponse);
    }

    private void addEventosAnalitico(BodyEventosAnalitico bodyEventosAnalitico, MsgResponse msgResponse) {
        bodyEventosAnalitico.getAnalitico().forEach(e -> {
            msgResponse.getEventosAnalitico().getAnalitico().add(e);
        });
        msgResponse.getEventosAnalitico().addTotal(bodyEventosAnalitico.getTotal());
    }

    private void addActivacionAlarma(MsgResponse msgResponseSucursal, MsgResponse msgResponse) {
        BodyActivacionAlarma activacion = msgResponseSucursal.getActivacionAlarma();
        msgResponse.getActivacionAlarma().addActivacionFalsa(activacion.getActivacionFalsa());
        msgResponse.getActivacionAlarma().addDescartadas(activacion.getDescartadas());
        msgResponse.getActivacionAlarma().addConvertidoAEvento(activacion.getConvertidoAEvento());
        msgResponse.getActivacionAlarma().addSinAtender(activacion.getSinAtender());
        msgResponse.getActivacionAlarma().addTotal(activacion.getTotal());
    }

    private void addGlobalEventoDetalle(MsgResponse msgResponseSucursal, MsgResponse msgResponse) {
        GlobalPrioridadEventoDetalle prioridad = msgResponseSucursal.getGlobalDetalle();
        msgResponse.getGlobalDetalle().addPrioridadAltaAten(prioridad.getPrioridadAltaAten());
        msgResponse.getGlobalDetalle().addPrioridadAltaCan(prioridad.getPrioridadAltaCan());
        msgResponse.getGlobalDetalle().addPrioridadAltaPen(prioridad.getPrioridadAltaPen());
        msgResponse.getGlobalDetalle().addPrioridadMediaAten(prioridad.getPrioridadMediaAten());
        msgResponse.getGlobalDetalle().addPrioridadMediaCan(prioridad.getPrioridadMediaCan());
        msgResponse.getGlobalDetalle().addPrioridadMediaPen(prioridad.getPrioridadMediaPen());
        msgResponse.getGlobalDetalle().addPrioridadBajaAten(prioridad.getPrioridadBajaAten());
        msgResponse.getGlobalDetalle().addPrioridadBajaCan(prioridad.getPrioridadBajaCan());
        msgResponse.getGlobalDetalle().addPrioridadBajaPen(prioridad.getPrioridadBajaPen());
        msgResponse.getGlobalDetalle().addTotalEventoAten(prioridad.getTotalEventoAten());
        msgResponse.getGlobalDetalle().addTotalEventoCan(prioridad.getTotalEventoCan());
        msgResponse.getGlobalDetalle().addTotalEventoPen(prioridad.getTotalEventoPen());
    }

    private Map<String, String> setParams(String fechaInicio, String fechaFin, String region, String inmuebles) {
        Map<String, String> params = new HashMap<>();
        params.put("fechaInicio", fechaInicio);
        params.put("fechaFin", fechaFin);
        params.put("region", region);

        // Dummy validation for getting "data" from MANZANILLO
        if (inmuebles.equals("52")) inmuebles = "102";

        params.put("inmuebles", inmuebles);
        return params;
    }

    private ResponseEntity<Map<String, Object>> errorDeSolicitud(Map<String, Object> response, Exception e) {
        response.put("mensaje", "Solicitud erronea");
        response.put("error", e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    private ResponseEntity<Map<String, Object>> errorDeAccesoADatos(Map<String, Object> response, Exception e) {
        response.put("mensaje", "Error de acceso a datos");
        response.put("error", e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
