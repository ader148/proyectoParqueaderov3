/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.service;


import com.unicauca.parqueadero.acceso.entidades.Tarifa;
import com.unicauca.parqueadero.negocio.GestorTarifa;
import com.unicauca.parqueadero.negocio.GestorVehiculo;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author alvarodanieleraso
 */
@Stateless 
@Path("tarifas")
public class TarifaREST {
    
    private GestorTarifa TarifaDB;
    
    public TarifaREST() {
        TarifaDB = new GestorTarifa();
    }
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Tarifa find(@PathParam("id") int id) {
        //System.out.println("esta es la placa a buscar");
        //System.out.println(placa);
        return TarifaDB.find(id);
    }
    
}
