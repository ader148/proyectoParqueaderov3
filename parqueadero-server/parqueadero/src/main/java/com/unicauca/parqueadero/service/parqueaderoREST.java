/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.service;

import com.unicauca.parqueadero.acceso.entidades.Parqueadero;
import com.unicauca.parqueadero.negocio.GestorParqueadero;
import com.unicauca.parqueadero.negocio.GestorTarifa;
import com.unicauca.parqueadero.negocio.Vehiculo;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alvarodanieleraso
 */
@Stateless 
@Path("parqueaderos")
public class parqueaderoREST {
    
    private GestorParqueadero parqueaderoDB;
    
    public parqueaderoREST() {
        parqueaderoDB = new GestorParqueadero();
    }
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Parqueadero find(@PathParam("id") int id) {
        return parqueaderoDB.findParqueaderoByid(id);
    }
    
    
    //servicio rest para traer todos los parqueaderos
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Parqueadero> parqueaderofindAll() {
        return parqueaderoDB.getParqueaderos();
    }
    
    
    /*
    metodo para sumar puestos ocupados recibe el id del parqueadero
    */
    @PUT
    @Path("{id_parqueadero}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String edit(@PathParam("id_parqueadero") String id_parqueadero, Parqueadero parq) {
        if (parqueaderoDB.sumarOcupados(id_parqueadero)) {
            return "{\"ok\":\"true\", \"mensaje\":\"puestos ocupados modificados \",\"errores\":\"\"}"; 
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo modificar los puestos ocupados\",\"errores\":\"parqueadero no existe\"}";
        }
    }
    
    @PUT
    @Path("/parqueaderoLessOcupados/{id_parqueadero}")
     @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editLessOcupados(@PathParam("id_parqueadero") String id_parqueadero, Parqueadero parq) {
        if (parqueaderoDB.restarOcupados(id_parqueadero)) {
            return "{\"ok\":\"true\", \"mensaje\":\"puestos ocupados modificados \",\"errores\":\"\"}"; 
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo modificar los puestos ocupados\",\"errores\":\"parqueadero no existe\"}";
        }
    }
    
    
    
    
    
    
}
