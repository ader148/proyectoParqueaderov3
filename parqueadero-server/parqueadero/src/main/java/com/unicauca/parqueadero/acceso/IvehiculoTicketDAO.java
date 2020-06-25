/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.acceso.entidades.VehiculoTicket;

/**
 *
 * @author alvarodanieleraso
 */
public interface IvehiculoTicketDAO {
    
    public  VehiculoTicket findByPlaca(String placa);

    public  VehiculoTicket find(int id);
    
    public boolean create(VehiculoTicket vehTick);
    
}
