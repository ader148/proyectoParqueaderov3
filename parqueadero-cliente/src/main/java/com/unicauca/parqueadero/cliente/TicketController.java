/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.cliente;

import com.unicauca.parqeuadero.transversal.Comunicacion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author alvarodanieleraso
 */
public class TicketController {
    
     NewJerseyClientTicket jerseyTicket = new NewJerseyClientTicket();
     
     Integer id_ticket_create=0;
     
       public Integer crearTicket(int Codigoo, String hora_entrada, String hora_salida){
        
        
        //para formatear la fecha recibida en string
        //string hora_entrada
        
           System.out.println("este es el codigo desde controlador ticket");
           System.out.println(Codigoo);
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");   
        Date date_hora_entrada;
        
        Date date_hora_salida;
        
        
         try {
             date_hora_entrada = formatter.parse(hora_entrada);
             
             date_hora_salida = formatter.parse(hora_salida);
             
              String rta = jerseyTicket.create_JSON(new Ticket(10,date_hora_entrada,date_hora_salida,Codigoo));
              //System.out.println("esta es la respuesta ");
              //System.out.println(rta);
              
              
               //decodificamos la respuesta
                JSONObject jsonObject = new JSONObject(rta);
                //System.out.println(jsonObject.getString("ok"));
                String respuesta = jsonObject.getString("id");
                //System.out.println(respuesta);
                
                respuesta =  (respuesta.trim());
                
                //casteamos el string a int 
                id_ticket_create = Integer.parseInt(respuesta);
                
               
                if(respuesta.equals("false")){
                   Comunicacion.mensajeError(jsonObject.getString("errores"), "Vehiculo");
                   return 0;
                }else{
                    return id_ticket_create;
                }
         } catch (ParseException ex) {
             Logger.getLogger(TicketController.class.getName()).log(Level.SEVERE, null, ex);
         }
           
       return id_ticket_create;
    }
       
       
       public Ticket findTicketById(){
           
           Ticket auxobj = new Ticket();
           
           Ticket auxobjw = jerseyTicket.find(Ticket.class, 49);
          
           //System.out.println("return");
           //System.out.println(auxobjw.getCodigo());
           
           
           //System.out.println(jerseyTicket.find(Ticket.class, 49).getHora_entrada().toString());
           
           //el id de ticket lo vamos a dejar fijo mientras se arregla el bug
           return auxobjw;
       }
    
}
