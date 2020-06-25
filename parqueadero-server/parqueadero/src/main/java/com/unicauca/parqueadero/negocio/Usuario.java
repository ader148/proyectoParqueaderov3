/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

/**
 *
 * @author alvarodanieleraso
 */
public class Usuario {
    
    private int id_usuario;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String Direccion;           
    private int role_id;
    private String email;
    private String password;           
    private int parqueadero_id;

    public Usuario(int id_usuario, String nombres, String apellidos, String telefono, String Direccion, int role_id, String email, String password, int parqueadero_id) {
        this.id_usuario = id_usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.Direccion = Direccion;
        this.role_id = role_id;
        this.email = email;
        this.password = password;
        this.parqueadero_id = parqueadero_id;
    }
    
    public Usuario() {
        this.id_usuario = 0;
        this.nombres = "";
        this.apellidos = "";
        this.telefono = "";
        this.Direccion = "";
        this.role_id = 0;
        this.email = "";
        this.password = "";
        this.parqueadero_id = 0;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getParqueadero_id() {
        return parqueadero_id;
    }

    public void setParqueadero_id(int parqueadero_id) {
        this.parqueadero_id = parqueadero_id;
    }
    
    
    
    
}
