/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.acceso.ItarifaDAO;
import com.unicauca.parqueadero.acceso.TarfifaDAOimplJPA;
import com.unicauca.parqueadero.acceso.VehiculoDAOImpJPA;

/**
 *
 * @author alvarodanieleraso
 */
public class GestorTarifa {
    
    
    ItarifaDAO tarifas;

    public GestorTarifa() {
        tarifas = new TarfifaDAOimplJPA();
    }
    
    public com.unicauca.parqueadero.acceso.entidades.Tarifa find(int id_tarifa) {
        return tarifas.findTarifa(id_tarifa);
    }
    
}
