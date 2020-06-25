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
public class VehiculoTicket {
    
    Integer id;
    String vehiculo_id;
    Integer ticket_id;
    Date created_at;

  
    public VehiculoTicket() {
        
        System.out.println("entro 333");
        
        Date date = new Date();
       
        this.id = 0;
        this.vehiculo_id = "000-000";
        this.ticket_id = 0;
       this.created_at = date;
        
        
    }
    
    public VehiculoTicket(Integer id, String vehiculo_id, Integer ticket_id, Date created_at) {
        
        System.out.println("entro 111");
        
        
        this.id = id;
        this.vehiculo_id = vehiculo_id;
        this.ticket_id = ticket_id;
       this.created_at = created_at;
    }
    
    public VehiculoTicket(Integer id, String vehiculo_id, Integer ticket_id) {
        
        System.out.println("entro 222");
        
        Date date = new Date(2020, 07, 13, 12, 00, 0);
        
        this.id = id;
        this.vehiculo_id = vehiculo_id;
        this.ticket_id = ticket_id;
       this.created_at = date;
    }

  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehiculo_id() {
        return vehiculo_id;
    }

    public void setVehiculo_id(String vehiculo_id) {
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
