/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alvarodanieleraso
 */
@Entity
@Table(name = "vehiculo_ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VehiculoTicket.findAll", query = "SELECT v FROM VehiculoTicket v"),
    @NamedQuery(name = "VehiculoTicket.findById", query = "SELECT v FROM VehiculoTicket v WHERE v.id = :id"),
    @NamedQuery(name = "VehiculoTicket.findByVehiculoId", query = "SELECT v FROM VehiculoTicket v WHERE v.vehiculoId = :vehiculoId"),
    @NamedQuery(name = "VehiculoTicket.findByTicketId", query = "SELECT v FROM VehiculoTicket v WHERE v.ticketId = :ticketId"),
    @NamedQuery(name = "VehiculoTicket.findByCreatedAt", query = "SELECT v FROM VehiculoTicket v WHERE v.createdAt = :createdAt")})
public class VehiculoTicket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vehiculo_id")
    private String vehiculoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ticket_id")
    private int ticketId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public VehiculoTicket() {
    }

    public VehiculoTicket(Integer id) {
        this.id = id;
    }

    public VehiculoTicket(Integer id, String vehiculoId, int ticketId) {
        this.id = id;
        this.vehiculoId = vehiculoId;
        this.ticketId = ticketId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(String vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VehiculoTicket)) {
            return false;
        }
        VehiculoTicket other = (VehiculoTicket) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unicauca.parqueadero.acceso.entidades.VehiculoTicket[ id=" + id + " ]";
    }
    
}
