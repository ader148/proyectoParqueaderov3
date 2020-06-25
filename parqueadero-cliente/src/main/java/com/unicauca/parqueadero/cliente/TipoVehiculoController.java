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
public class TipoVehiculoController {
    
    
    
    //NewJerseyClient jersey = new NewJerseyClient();
    NewJerseyClientTipoVehiculo jerseytipVehi = new NewJerseyClientTipoVehiculo();
    
    
    
     public boolean getTipoVehiculo(){
        
         // BUSCANDO UN ESTUDIANTE
        //TipoVehiculo est = jersey.find(TipoVehiculo.class,"2");
        
       // TipoVehiculo listTvehiculo = jerseytipVehi.TipovehiculofindAll();
        
        //System.out.println(est.getTipo());
        
        TipoVehiculo est = jerseytipVehi.TipovehiculofindAll(TipoVehiculo.class);
        
         //System.out.println("hola xxxxxxxxx");
         //System.out.println(est.getTipo());
                 
        
        return true;
    }
     
    
}
