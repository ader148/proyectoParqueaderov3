/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.service;

import com.unicauca.parqueadero.negocio.GestorUsuario;
import com.unicauca.parqueadero.negocio.Usuario;
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
@Path("usuarios")
public class UsuarioREST {
    
    private GestorUsuario usuarioDB;
    
    public UsuarioREST() {
       usuarioDB = new GestorUsuario();
    }
    
    /*
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Usuario find(@PathParam("id") int id) {
        return usuarioDB.findParqueaderoByid(id);
    }*/
    
    
    @GET
    @Path("{email}")
    @Produces({MediaType.APPLICATION_JSON})
    public Usuario find(@PathParam("email") String email) {
        return usuarioDB.findUserByEmail(email);
    }
    
}
