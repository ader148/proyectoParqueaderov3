/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.acceso.entidades.Tarifa;

/**
 *
 * @author alvarodanieleraso
 */
public interface ItarifaDAO {
    
    public Tarifa findTarifa(int id);
    
    public Tarifa getTarifaByTipoAndBytipoVheiculo(String tarifaTipo, int tipovehiculo);
    
}
