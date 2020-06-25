/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.acceso.controladores.VehiculoTicketJpaController;
import com.unicauca.parqueadero.acceso.entidades.VehiculoTicket;
import com.unicauca.parqueadero.negocio.Ticket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alvarodanieleraso
 */
public class VehiculoTicketImplJPA implements IvehiculoTicketDAO{
    
    VehiculoTicket aux = new VehiculoTicket(); //objeto auxiliar vehiculo
    
     VehiculoTicketJpaController cVehiculoTicket = new VehiculoTicketJpaController();

    @Override
    public VehiculoTicket find(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        VehiculoTicket objaux = new VehiculoTicket();
        
        //objaux = cVehiculoTicket.buscarTicketByidVehiculo();
        
        return objaux;
    }

    @Override
    public boolean create(VehiculoTicket vehTick) {
        
        com.unicauca.parqueadero.acceso.entidades.VehiculoTicket auxVehTic = new VehiculoTicket(10,vehTick.getVehiculoId(),vehTick.getTicketId());
        
        com.unicauca.parqueadero.acceso.entidades.VehiculoTicket vehTic = new com.unicauca.parqueadero.acceso.entidades.VehiculoTicket();
        vehTic.setId(auxVehTic.getId());
        vehTic.setTicketId(auxVehTic.getTicketId());
        vehTic.setVehiculoId(auxVehTic.getVehiculoId());
        vehTic.setCreatedAt(auxVehTic.getCreatedAt());
        
        try {
            //retornamos el id creado del ticket
           cVehiculoTicket.create(vehTic);
           return true;
            
        } catch (Exception e) {
            Logger.getLogger(VehiculoDAOImpJPA.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculoTicket findByPlaca(String placa) {
        //VehiculoTicket objaux = new VehiculoTicket();
        //System.out.println("hola desde jps find placa");
        //System.out.println(cVehiculoTicket.buscarTicketByidVehiculo(placa).getTicketId());
         return cVehiculoTicket.buscarTicketByidVehiculo(placa);
    }
    
}
