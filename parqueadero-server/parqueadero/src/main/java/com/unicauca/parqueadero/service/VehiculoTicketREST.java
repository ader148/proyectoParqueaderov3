/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.service;

import com.unicauca.parqueadero.acceso.entidades.VehiculoTicket;
import com.unicauca.parqueadero.negocio.GestorTicketVehiculo;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;



/**
 *
 * @author alvarodanieleraso
 */
@Stateless 
@Path("vehiculoTicket")
public class VehiculoTicketREST {
    
    
    private GestorTicketVehiculo TicketVehiculoDB;
    
    public VehiculoTicketREST() {
        TicketVehiculoDB = new GestorTicketVehiculo();
    }
    
   /*
    @GET
    @Path("{id_ticket_vehiculo}")
    @Produces({MediaType.APPLICATION_JSON})
    public VehiculoTicket find(@PathParam("id_ticket_vehiculo") int id_ticket_vehiculo) {
        return TicketVehiculoDB.find(id_ticket_vehiculo);
    }*/
    
    //metodo que busca por placa de vehiculo
    @GET
    @Path("{id_vehiculo}")
    @Produces({MediaType.APPLICATION_JSON})
    public VehiculoTicket find(@PathParam("id_vehiculo") String id_vehiculo) {
        
        return TicketVehiculoDB.findByplaca(id_vehiculo);
    }
    
    
    /*
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String create(com.unicauca.parqueadero.acceso.entidades.VehiculoTicket veht) {
        
         System.out.println("esta es la informacion recibida REST");
         System.out.println(veht.getTicketId());
         System.out.println(veht.getVehiculoId());
         
        if (TicketVehiculoDB.create(veht)) {
            return "{\"ok\":\"true\", \"mensaje\":\"Ticket_Vehiculo creado\",\"errores\":\"\"}";
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo crear el Ticket_Vehiculo\",\"errores\":\"id ya existe\"}";
        }
    }*/
    
     @POST
     @Consumes(MediaType.APPLICATION_JSON)
      public String create(String jsonn) {
      
          com.unicauca.parqueadero.acceso.entidades.VehiculoTicket veht = new VehiculoTicket();
          
          JSONObject jsonObject = new JSONObject(jsonn);
       
         String vehiculo_id = jsonObject.getString("vehiculo_id");
         Integer ticket_id = jsonObject.getInt("ticket_id");
        
        veht.setTicketId(ticket_id);
        veht.setVehiculoId(vehiculo_id);
        
        
        if (TicketVehiculoDB.create(veht)) {
            return "{\"ok\":\"true\", \"mensaje\":\"Ticket_Vehiculo creado\",\"errores\":\"\"}";
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo crear el Ticket_Vehiculo\",\"errores\":\"id ya existe\"}";
        }
      
      }
    
}
