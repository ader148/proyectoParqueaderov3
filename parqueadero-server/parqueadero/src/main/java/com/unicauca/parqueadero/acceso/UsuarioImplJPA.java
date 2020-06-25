/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;


import com.unicauca.parqueadero.acceso.controladores.UsuarioJpaController;
import com.unicauca.parqueadero.negocio.Usuario;



/**
 *
 * @author alvarodanieleraso
 */
public class UsuarioImplJPA implements IUsuarioDAO{
    
    Usuario aux = new Usuario(); //objeto auxiliar vehiculo
    
    UsuarioJpaController cUsuario = new UsuarioJpaController();

    @Override
    public Usuario findUserByID(int id) {
        
        Usuario aunUser = new Usuario();
        
        com.unicauca.parqueadero.acceso.entidades.Usuario objUserent = new com.unicauca.parqueadero.acceso.entidades.Usuario();
        objUserent = cUsuario.findUsuario(id);
        
        aunUser.setId_usuario(objUserent.getIdUsuario());
        aunUser.setNombres(objUserent.getNombres());
        aunUser.setApellidos(objUserent.getApellidos());
        aunUser.setTelefono(objUserent.getTelefono());
        aunUser.setDireccion(objUserent.getDireccion());
        aunUser.setRole_id(objUserent.getRoleId());
        aunUser.setEmail(objUserent.getEmail());
        aunUser.setPassword(objUserent.getPassword());
        aunUser.setParqueadero_id(objUserent.getParqueaderoId());
        
        return aunUser;
        
    }

    @Override
    public Usuario findUserByEmail(String email) {
        
        Usuario userObj = new Usuario();
        
        com.unicauca.parqueadero.acceso.entidades.Usuario objUserent = new com.unicauca.parqueadero.acceso.entidades.Usuario();
        
        objUserent =  cUsuario.buscarUsuarioPorEmail(email);
        
        userObj.setId_usuario(objUserent.getIdUsuario());
        userObj.setNombres(objUserent.getNombres());
        userObj.setApellidos(objUserent.getApellidos());
        userObj.setTelefono(objUserent.getTelefono());
        userObj.setDireccion(objUserent.getDireccion());
        userObj.setRole_id(objUserent.getRoleId());
        userObj.setEmail(objUserent.getEmail());
        userObj.setPassword(objUserent.getPassword());
        userObj.setParqueadero_id(objUserent.getParqueaderoId());
        
        return  userObj;
    }
    
}
