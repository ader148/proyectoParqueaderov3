/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.acceso.IparqueaderoDAO;
import com.unicauca.parqueadero.acceso.ParqueaderoImplJPA;
import java.util.List;


/**
 *
 * @author alvarodanieleraso
 */
public class GestorParqueadero {
    
    IparqueaderoDAO parqueaderos;
    
    public GestorParqueadero() {
        parqueaderos = new ParqueaderoImplJPA();
    }
    
    public com.unicauca.parqueadero.acceso.entidades.Parqueadero findParqueaderoByid(int id){
        return parqueaderos.getParqueaderoByid(id);
    }
    
    public List<com.unicauca.parqueadero.acceso.entidades.Parqueadero>  getParqueaderos(){
        return parqueaderos.getParqueaderos();
    }
    
    public boolean sumarOcupados(String id_parqueadero){
    
       boolean respuesta = parqueaderos.addOcupados(id_parqueadero); 
       return true;
    }
    
      public boolean restarOcupados(String id_parqueadero){
    
       boolean respuesta = parqueaderos.lessOcupados(id_parqueadero); 
       return true;
    }
    
}
