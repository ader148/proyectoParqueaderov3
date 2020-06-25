/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alvarodanieleraso
 */
@Entity
@Table(name = "parqueadero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parqueadero.findAll", query = "SELECT p FROM Parqueadero p"),
    @NamedQuery(name = "Parqueadero.findByIdParqueadero", query = "SELECT p FROM Parqueadero p WHERE p.idParqueadero = :idParqueadero"),
    @NamedQuery(name = "Parqueadero.findByNombre", query = "SELECT p FROM Parqueadero p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Parqueadero.findByDireccion", query = "SELECT p FROM Parqueadero p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Parqueadero.findByTelefonos", query = "SELECT p FROM Parqueadero p WHERE p.telefonos = :telefonos"),
    @NamedQuery(name = "Parqueadero.findByPuestosTotales", query = "SELECT p FROM Parqueadero p WHERE p.puestosTotales = :puestosTotales"),
    @NamedQuery(name = "Parqueadero.findByPuestosOcupados", query = "SELECT p FROM Parqueadero p WHERE p.puestosOcupados = :puestosOcupados")})
public class Parqueadero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_parqueadero")
    private Integer idParqueadero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "telefonos")
    private String telefonos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puestos_totales")
    private int puestosTotales;
    @Column(name = "puestos_ocupados")
    private Integer puestosOcupados;

    public Parqueadero() {
        this.idParqueadero = 0;
        this.nombre = "";
        this.direccion = "";
        this.telefonos = "";
        this.puestosTotales = 0;
    }

    public Parqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public Parqueadero(Integer idParqueadero, String nombre, String direccion, String telefonos, int puestosTotales) {
        this.idParqueadero = idParqueadero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.puestosTotales = puestosTotales;
    }

    public Integer getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
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

    public int getPuestosTotales() {
        return puestosTotales;
    }

    public void setPuestosTotales(int puestosTotales) {
        this.puestosTotales = puestosTotales;
    }

    public Integer getPuestosOcupados() {
        return puestosOcupados;
    }

    public void setPuestosOcupados(Integer puestosOcupados) {
        this.puestosOcupados = puestosOcupados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParqueadero != null ? idParqueadero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parqueadero)) {
            return false;
        }
        Parqueadero other = (Parqueadero) object;
        if ((this.idParqueadero == null && other.idParqueadero != null) || (this.idParqueadero != null && !this.idParqueadero.equals(other.idParqueadero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unicauca.parqueadero.acceso.entidades.Parqueadero[ idParqueadero=" + idParqueadero + " ]";
    }
    
}
