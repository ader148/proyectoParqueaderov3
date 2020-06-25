/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.acceso.IUsuarioDAO;
import com.unicauca.parqueadero.acceso.UsuarioImplJPA;


/**
 *
 * @author alvarodanieleraso
 */
public class GestorUsuario {
    
    IUsuarioDAO Usuarios;
    
     public GestorUsuario() {
        Usuarios = new UsuarioImplJPA();
    }
     
    public Usuario findParqueaderoByid(int id){
        return Usuarios.findUserByID(id);
    }
    
    public Usuario findUserByEmail(String email){
        return Usuarios.findUserByEmail(email);
    }
    
}
