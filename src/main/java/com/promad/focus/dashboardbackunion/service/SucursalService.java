package com.promad.focus.dashboardbackunion.service;

import com.promad.focus.dashboardbackunion.dao.Sucursal;

import java.util.ArrayList;
import java.util.List;

public class SucursalService {

    public static final List<Sucursal> SUCURSALES = new ArrayList<>();

    public static void addSucursal(Sucursal sucursal) {
        SUCURSALES.add(sucursal);
    }

    public static List<Sucursal> getSucursales() {
        return SUCURSALES;
    }
}
