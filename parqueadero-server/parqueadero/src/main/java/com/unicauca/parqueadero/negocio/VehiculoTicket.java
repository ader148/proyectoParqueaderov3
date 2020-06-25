/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import java.util.Date;

/**
 *
 * @author alvarodanieleraso
 */
public class VehiculoTicket {
    
    Integer id;
    Integer vehiculo_id;
    Integer ticket_id;
    Date created_at;

    
    public VehiculoTicket(Integer id, Integer vehiculo_id, Integer ticket_id, Date created_at) {
        this.id = id;
        this.vehiculo_id = vehiculo_id;
        this.ticket_id = ticket_id;
        this.created_at = created_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVehiculo_id() {
        return vehiculo_id;
    }

    public void setVehiculo_id(Integer vehiculo_id) {
        this.vehiculo_id = vehiculo_id;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
    
    
        
}
