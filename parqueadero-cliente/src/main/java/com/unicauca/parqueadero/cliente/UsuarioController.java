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
public class UsuarioController {
    
    NewJerseyClientUsuario jersey = new NewJerseyClientUsuario();
    
       
    public Usuario buscarUsuarioPorEmail(String email){
        
        //creamos el objeto vehiculo para ser llenado
        Usuario aunxVehiculo = new Usuario();
        
        //llamamos al metodo buscar vehiculo
        Usuario uss = jersey.find(Usuario.class, email);
        //jersey.find(Vehiculo.class,"ABB-123");
       
        //System.out.println("este es el vehiculo encontrado");
        //System.out.println(vehh.getMarca());
        //System.out.println(vehh.getColor());
        //System.out.println(vehh.getPlaca());
        
        return uss;
    }
    
}
