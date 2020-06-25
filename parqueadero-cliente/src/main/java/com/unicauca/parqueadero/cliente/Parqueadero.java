/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.cliente;

import java.util.Date;

/**
 *
 * @author alvarodanieleraso
 */
public class Parqueadero {
    
    //atributos de la clase
    private int id_paqueadero;
    private String nombre;
    private String direccion;
    private String telefonos;
    private int puestos_totales;
    private int puestos_ocupados;        

    public Parqueadero(int id_paqueadero, String nombre, String direccion, String telefonos, int puestos_totales, int puestos_ocupados) {
        this.id_paqueadero = id_paqueadero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.puestos_totales = puestos_totales;
        this.puestos_ocupados = puestos_ocupados;
    }
    
    public Parqueadero() {
        this.id_paqueadero = 0;
        this.nombre = "";
        this.direccion = "";
        this.telefonos = "";
        this.puestos_totales = 10;
        this.puestos_ocupados = 0;
    }

    public int getId_paqueadero() {
        return id_paqueadero;
    }

    public void setId_paqueadero(int id_paqueadero) {
        this.id_paqueadero = id_paqueadero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public int getPuestos_totales() {
        return puestos_totales;
    }

    public void setPuestos_totales(int puestos_totales) {
        this.puestos_totales = puestos_totales;
    }

    public int getPuestos_ocupados() {
        return puestos_ocupados;
    }

    public void setPuestos_ocupados(int puestos_ocupados) {
        this.puestos_ocupados = puestos_ocupados;
    }
    
    
    
    
    
    
    
}
