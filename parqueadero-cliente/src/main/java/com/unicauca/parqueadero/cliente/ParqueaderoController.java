/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.cliente;

/**
 *
 * @author alvarodanieleraso
 */
public class ParqueaderoController {
    
     
     NewJerseyClientParqueadero jersey = new NewJerseyClientParqueadero();
     
     public Parqueadero  BuscarParqueaderoPorId(int idParqueadero){
     
         Parqueadero aunxParqueadero = new Parqueadero();
         
         String id_parq =  String.valueOf(idParqueadero);
         
         Parqueadero parq = jersey.find(Parqueadero.class, id_parq);
         //Parqueadero parq = jersey.find(Parqueadero.class, "1");
         
         return parq;
     }
     
     public void sumarOcupados(String id_parqueadero){
          jersey.edit_XML(Parqueadero.class, id_parqueadero);
     }
     
     
    
}
