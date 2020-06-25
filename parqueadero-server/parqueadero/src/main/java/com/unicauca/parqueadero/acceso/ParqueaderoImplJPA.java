/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import static com.unicauca.parqueadero.acceso.VehiculoDAOImpJPA.listaVehiculos;
import com.unicauca.parqueadero.acceso.controladores.ParqueaderoJpaController;
import com.unicauca.parqueadero.acceso.entidades.Parqueadero;
import com.unicauca.parqueadero.acceso.entidades.Tarifa;
import com.unicauca.parqueadero.negocio.Vehiculo;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author alvarodanieleraso
 */
public class ParqueaderoImplJPA implements IparqueaderoDAO{
    
    
    ParqueaderoJpaController cParqueadero = new ParqueaderoJpaController();
    
    static ArrayList<Parqueadero> listaparqueadero = new ArrayList();
    
    Parqueadero aux = new Parqueadero(); //objeto auxiliar parqueadero
    
    private List<Parqueadero> lista;
    
     
    
    public ParqueaderoImplJPA() {
        lista = new ArrayList(); 
    }
    

    @Override
    public List<Parqueadero> getParqueaderos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<com.unicauca.parqueadero.acceso.entidades.Parqueadero> listParqueaderos = cParqueadero.findParqueaderoEntities();
        
        
        //limpiamos la lista antes de llenarla para borrar lo que tenia asigando anteriormente
        listaparqueadero.clear();
        
        for (int i = 0; i < listParqueaderos.size(); i++) {
            System.out.println(""+listParqueaderos.get(i).getNombre());
            
            //se asignan valores a los atributos del nuevo objeto
            aux.setDireccion(listParqueaderos.get(i).getDireccion());
            aux.setIdParqueadero(listParqueaderos.get(i).getIdParqueadero());
            aux.setNombre(listParqueaderos.get(i).getNombre());
            aux.setPuestosOcupados(listParqueaderos.get(i).getPuestosOcupados());
            aux.setPuestosTotales(listParqueaderos.get(i).getPuestosTotales());
            aux.setTelefonos(listParqueaderos.get(i).getTelefonos());
            
            //se añade el objeto al final del array
            listaparqueadero.add(aux);
            
        }
        //return listaparqueadero;
        return listParqueaderos;
    }

    @Override
    public Parqueadero getParqueaderoByid(int id) {
        
        Parqueadero Parqq = new Parqueadero();
        
        com.unicauca.parqueadero.acceso.entidades.Parqueadero objParqueadero = new com.unicauca.parqueadero.acceso.entidades.Parqueadero();
        
        objParqueadero = cParqueadero.findParqueadero(id);
        
        Parqq.setDireccion(objParqueadero.getDireccion());
        Parqq.setIdParqueadero(objParqueadero.getIdParqueadero());
        Parqq.setNombre(objParqueadero.getNombre());
        Parqq.setPuestosOcupados(objParqueadero.getPuestosOcupados());
        Parqq.setPuestosTotales(objParqueadero.getPuestosTotales());
        Parqq.setTelefonos(objParqueadero.getTelefonos());
        
        return Parqq;
        
    }

    @Override
    public boolean addOcupados(String idParqueadero) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        cParqueadero.sumarOcupados(idParqueadero);
        return true;
    }

    @Override
    public boolean lessOcupados(String idParqueadero) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        cParqueadero.restarOcupados(idParqueadero);
        return true;
    }
    
}
