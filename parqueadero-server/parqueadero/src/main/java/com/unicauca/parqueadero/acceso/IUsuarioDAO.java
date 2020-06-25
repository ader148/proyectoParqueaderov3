/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.negocio.Usuario;

/**
 *
 * @author alvarodanieleraso
 */
public interface IUsuarioDAO {
    
    public Usuario findUserByID(int id);
    
    public Usuario findUserByEmail(String email);
    
}
