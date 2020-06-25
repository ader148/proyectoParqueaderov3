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
public class Tarifa {
    
    private int id_tarifa;
    private String tipo_tarifa;
    private int tipo_vehiculo;
    private int valor;

    public Tarifa(int id_tarifa, String tipo_tarifa, int tipo_vehiculo, int valor) {
        this.id_tarifa = id_tarifa;
        this.tipo_tarifa = tipo_tarifa;
        this.tipo_vehiculo = tipo_vehiculo;
        this.valor = valor;
    }
    
    
    public Tarifa() {
        this.id_tarifa = 0;
        this.tipo_tarifa = "";
        this.tipo_vehiculo = 0;
        this.valor = 0;
    }

    public int getId_tarifa() {
        return id_tarifa;
    }

    public void setId_tarifa(int id_tarifa) {
        this.id_tarifa = id_tarifa;
    }

    public String getTipo_tarifa() {
        return tipo_tarifa;
    }

    public void setTipo_tarifa(String tipo_tarifa) {
        this.tipo_tarifa = tipo_tarifa;
    }

    public int getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(int tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
    
    
}
