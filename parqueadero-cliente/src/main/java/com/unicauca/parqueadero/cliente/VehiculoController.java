/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.cliente;

import com.unicauca.parqeuadero.transversal.Comunicacion;
import org.json.JSONObject;



/**
 *
 * @author alvarodanieleraso
 */
public class VehiculoController {
    
    
    
    NewJerseyClient jersey = new NewJerseyClient();
    
    public boolean crearVehiculo(String placa, String modelo, int tipoVehiculo, String marca, String color){
        
        
        String rta = jersey.create_JSON(new Vehiculo(placa,modelo,tipoVehiculo,marca,color));
        System.out.println("esta es la respuesta ");
        System.out.println(rta);
        
        //decodificamos la respuesta
        
        
        
        JSONObject jsonObject = new JSONObject(rta);
        //System.out.println(jsonObject.getString("ok"));
        String respuesta = jsonObject.getString("ok");
        System.out.println(respuesta);
        if(respuesta.equals("false")){
           Comunicacion.mensajeError(jsonObject.getString("errores"), "Vehiculo");
           return false;
        }else{
            return true;
        }
    }
    
    public Vehiculo buscarVehiculoPorPlaca(String placaa){
        
        //creamos el objeto vehiculo para ser llenado
        Vehiculo aunxVehiculo = new Vehiculo();
        
        //llamamos al metodo buscar vehiculo
        Vehiculo vehh = jersey.find(Vehiculo.class,placaa);
        //jersey.find(Vehiculo.class,"ABB-123");
       
        //System.out.println("este es el vehiculo encontrado");
        //System.out.println(vehh.getMarca());
        //System.out.println(vehh.getColor());
        //System.out.println(vehh.getPlaca());
        
        return vehh;
    }
   
}
