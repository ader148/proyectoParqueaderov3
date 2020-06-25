/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.service;


import com.unicauca.parqueadero.negocio.GestorTicket;
import com.unicauca.parqueadero.negocio.Ticket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
@Path("ticket")
public class TicketREST {
    
    private GestorTicket TicketDB;
    
    public TicketREST() {
        TicketDB = new GestorTicket();
    }
    
    
    
    
    /*@GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<com.unicauca.parqueadero.negocio.Ticket> ticketsfinAll() {
        System.out.println("entro aca todos los tickets");
        return TicketDB.getTickets();
    }*/

    
    
    @GET
    @Path("{id_ticket}")
    @Produces({MediaType.APPLICATION_JSON})
    public Ticket find(@PathParam("id_ticket") int id_ticket) {
        return TicketDB.find(id_ticket);
    }
    
    /*
    @GET
    @Path("{id_ticket}/{placa}")
    @Produces({MediaType.APPLICATION_JSON})
    public com.unicauca.parqueadero.negocio.Ticket find(
            @PathParam("id_ticket") int id_ticket,
            @PathParam("placa") String placa
            ){
        System.out.println("buscara id y placa");
        
        System.out.println("estos son los parametors de busqueda");
        System.out.println(id_ticket);
        System.out.println(placa);
        
        return TicketDB.find(id_ticket);
    }*/
    
    @POST
    //@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    //public String create(com.unicauca.parqueadero.negocio.Ticket tic) {
    public String create(String jsonn) {
        
        com.unicauca.parqueadero.negocio.Ticket ticc= new com.unicauca.parqueadero.negocio.Ticket();
        
       JSONObject jsonObject = new JSONObject(jsonn);
       
       Integer codigoPOST= jsonObject.getInt("codigo");
       
        System.out.println("este es el codigo que llego");
        System.out.println(codigoPOST);
       
       String fechaPOST = jsonObject.getString("hora_entrada");
       
       String fechaSalida = jsonObject.getString("hora_salida");
       
       
       
       ticc.setCodigo(codigoPOST);
       
        try {
            
            //verificar para asignar bien la fecha
            //SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
            //Date date = formatter.parse(fechaPOST);
            
            
            SimpleDateFormat sf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
            Date dt = sf.parse(sf.format(new Date()));
            
            Date dtSalida = new Date(0, 0, 0, 0, 0, 0);
            
            ticc.setHora_salida(dtSalida);
       
       ticc.setHora_entrada(dt);
       //ticc.setCodigo(codigoPOST);
       
        
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        
        //System.out.println("este es el objeto antes de ser creado");
        //System.out.println(ticc);
        
        //lamada para crear el objeto
        Integer resultado = TicketDB.create(ticc);
          
        if ( resultado== 0) {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo crear el ticket\",\"errores\":\"id ya existe\",\"id\":\"false\"   }";
        } else {
            return "{\"ok\":\"true\", \"mensaje\":\"Ticket creado\",\"errores\":\"\", \"id\":\" "+resultado+" \" }";
            
        }
    }

  /*  @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String edit(@PathParam("id") int id, Ticket tic) {
        if (TicketDB.edit(tic)) {
            return "{\"ok\":\"true\", \"mensaje\":\"ticket modificado \",\"errores\":\"\"}"; 
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo modificar el ticket\",\"errores\":\"id no existe\"}";
        }
    }*/
    
    
    
   /*@DELETE
    @Path("{id}")
    public String remove(@PathParam("id") int id) {
        if (TicketDB.remove(id)) {
            return "{\"ok\":\"true\", \"mensaje\":\"ticket borrado\",\"errores\":\"\"}";
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo borrar el ticket\",\"errores\":\"ticket no existe\"}"; }
    }*/


    
}
