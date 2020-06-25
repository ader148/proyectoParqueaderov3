/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.cliente;


import com.unicauca.parqueadero.cliente.VehiculoTicket;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author alvarodanieleraso
 */
public class VehiculoTicketController {
    
    NewJerseyClientVehiculoTicket jerseyVehiculoTicket = new NewJerseyClientVehiculoTicket();
    
    VehiculoTicket objvetic = new VehiculoTicket();
    
    public boolean crearTicketVehiculo(String Vehiculo_id, int Ticket_id){
        
        System.out.println("llego aca sin problemas");
        
        
        Date date = new Date();
        
        
        
        //String rta = jerseyVehiculoTicket.create_JSON(new com.unicauca.parqueadero.cliente.VehiculoTicket(10,Vehiculo_id,Ticket_id,date));
        
        objvetic.setTicket_id(Ticket_id);
        objvetic.setVehiculo_id(Vehiculo_id);
        objvetic.setCreated_at(date);
        
        jerseyVehiculoTicket.create_JSON(objvetic);
        
        
        //System.out.println("esta es la respuesta ticketVehiculo");
        //System.out.println(rta);
        
        //decodificamos la respuesta
        
        
        
        //JSONObject jsonObject = new JSONObject(rta);
        //System.out.println(jsonObject.getString("ok"));
        //String respuesta = jsonObject.getString("ok");
        //System.out.println(respuesta);
        //if(respuesta.equals("false")){
           //Comunicacion.mensajeError(jsonObject.getString("errores"), "Vehiculo");
       //    return false;
       // }else{
      //      return true;
       // }
       
       return true;
        
      
    }
    
    public VehiculoTicket BuscarVehiculoTicketPorPlaca(String placa){
        
        VehiculoTicket auxobj = new VehiculoTicket();
        
         //auxobj = jerseyVehiculoTicket.find(VehiculoTicket.class, placa);
        
        //System.out.println("resultadooooooo ooooooo");
        //System.out.println(auxobj.getTicket_id());
        //System.out.println(auxobj.getVehiculo_id());
        
        com.unicauca.parqueadero.cliente.VehiculoTicket ve = jerseyVehiculoTicket.find(com.unicauca.parqueadero.cliente.VehiculoTicket.class, placa);

        
        System.out.println("este essssss");
        System.out.println(ve.ticket_id);
        System.out.println(ve.getTicket_id());
        
        return auxobj;
    }
    
}
