/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.acceso.controladores.TarifaJpaController;
import com.unicauca.parqueadero.acceso.entidades.Tarifa;

/**
 *
 * @author alvarodanieleraso
 */
public class TarfifaDAOimplJPA implements ItarifaDAO{
    
    Tarifa aux = new Tarifa(); //objeto auxiliar vehiculo
    
    TarifaJpaController cTarifa = new TarifaJpaController();

    @Override
    public Tarifa findTarifa(int id) {
        
        Tarifa tarr = new Tarifa();
        
        com.unicauca.parqueadero.acceso.entidades.Tarifa objTarifaent = new com.unicauca.parqueadero.acceso.entidades.Tarifa();
        objTarifaent = cTarifa.findTarifa(id);
        
        
        tarr.setIdTarifa(objTarifaent.getIdTarifa());
        tarr.setTipoTarifa(objTarifaent.getTipoTarifa());
        tarr.setTipoVehiculo(objTarifaent.getTipoVehiculo());
        tarr.setValor(objTarifaent.getValor());
        
        return tarr;
        
    }

    @Override
    public Tarifa getTarifaByTipoAndBytipoVheiculo(String tarifaTipo, int tipovehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
