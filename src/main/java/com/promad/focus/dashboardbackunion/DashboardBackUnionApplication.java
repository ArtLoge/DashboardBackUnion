package com.promad.focus.dashboardbackunion;

import com.promad.focus.dashboardbackunion.dao.Inmueble;
import com.promad.focus.dashboardbackunion.dao.Sucursal;
import com.promad.focus.dashboardbackunion.service.SucursalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class DashboardBackUnionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DashboardBackUnionApplication.class, args);
    }

    @Override
    public void run(String... args) {
        SucursalService.SUCURSALES.add(new Sucursal("TORREON", "http://localhost:8080", 1,
                Arrays.asList(
                        new Inmueble("102", "PLANTA 1"),
                        new Inmueble("103", "PLANTA 2"))));
        SucursalService.SUCURSALES.add(new Sucursal("MANZANILLO", "http://localhost:8080", 2,
                Collections.singletonList(
                        new Inmueble("52", "PLANTA 2"))));
    }
}
