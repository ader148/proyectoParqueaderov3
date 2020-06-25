/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.acceso.IvehiculoTicketDAO;
import com.unicauca.parqueadero.acceso.TipoVehiculoImplJPA;
import com.unicauca.parqueadero.acceso.VehiculoTicketImplJPA;

/**
 *
 * @author alvarodanieleraso
 */
public class GestorTicketVehiculo {
    
    IvehiculoTicketDAO iTickets;
    
    
    public GestorTicketVehiculo() {
        iTickets = new VehiculoTicketImplJPA();
    }
    
    public com.unicauca.parqueadero.acceso.entidades.VehiculoTicket find(int id_ticketVhe) {
        return iTickets.find(id_ticketVhe);
    }
    
    public com.unicauca.parqueadero.acceso.entidades.VehiculoTicket findByplaca(String placa) {
        return iTickets.findByPlaca(placa);
    }

    public Boolean create(com.unicauca.parqueadero.acceso.entidades.VehiculoTicket ticVeh) {
        System.out.println("este es el ticket vehiculo a guardar");
        System.out.println(ticVeh.getTicketId());
        System.out.println(ticVeh.getVehiculoId());
        
        iTickets.create(ticVeh);
        return true;
    }
    
    
    
}
