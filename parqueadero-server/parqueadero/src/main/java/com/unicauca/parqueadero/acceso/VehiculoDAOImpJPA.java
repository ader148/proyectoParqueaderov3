/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.acceso.controladores.VehiculoJpaController;
import com.unicauca.parqueadero.negocio.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvarodanieleraso
 */
public class VehiculoDAOImpJPA implements IvehiculoDAO{
    
    VehiculoJpaController  cVhieculo = new VehiculoJpaController();
    
    static ArrayList<Vehiculo> listaVehiculos = new ArrayList();
    
    Vehiculo aux = new Vehiculo(); //objeto auxiliar vehiculo
    
    
    private List<Vehiculo> lista;
    
    public VehiculoDAOImpJPA() {
        lista = new ArrayList(); 
        //inicializar();
    }

    @Override
    public List<Vehiculo> getVehiculos() {
       
       List<com.unicauca.parqueadero.acceso.entidades.Vehiculo> listVehiculos= cVhieculo.findVehiculoEntities();
            
        for (int i = 0; i < listVehiculos.size(); i++) {
            System.out.println(""+listVehiculos.get(i).getPlaca());
            
            //se asignan valores a los atributos del nuevo objeto
            aux.setPlaca(listVehiculos.get(i).getPlaca());
            aux.setModelo(listVehiculos.get(i).getModelo());
            aux.setTipoVehiculo(listVehiculos.get(i).getTipoVehiculo());
            aux.setColor(listVehiculos.get(i).getColor());
            aux.setMarca(listVehiculos.get(i).getMarca());
            
             //se añade el objeto al final del array
            listaVehiculos.add(aux);
            
        }
        
       return listaVehiculos;
       
    }

    @Override
    public Vehiculo find(String placa) {
        Vehiculo vehh = new Vehiculo();
        
        com.unicauca.parqueadero.acceso.entidades.Vehiculo objVehiculoEnt = new com.unicauca.parqueadero.acceso.entidades.Vehiculo();
        
        
        //llamamos a buscar vehiculo
        //objVehiculoEnt = cVhieculo.findVehiculo("ABB-123");
        
        objVehiculoEnt = cVhieculo.findVehiculo(placa);
        
        if(objVehiculoEnt == null){
            //si no encuentra vehiculo dejamos el vehiculo vacio
            //System.out.println("problemas xxxxx");
            //objVehiculoEnt = new com.unicauca.parqueadero.acceso.entidades.Vehiculo();
        }else{
            
            vehh.setColor(objVehiculoEnt.getColor());
            vehh.setMarca(objVehiculoEnt.getMarca());
            vehh.setModelo(objVehiculoEnt.getModelo());
            vehh.setPlaca(objVehiculoEnt.getPlaca());
            vehh.setTipoVehiculo(objVehiculoEnt.getTipoVehiculo());
        }
        
        
        return vehh;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(Vehiculo veh) {
        
            com.unicauca.parqueadero.acceso.entidades.Vehiculo  auxEntidad = new com.unicauca.parqueadero.acceso.entidades.Vehiculo(veh.getPlaca(),veh.getModelo(),veh.getTipoVehiculo(),veh.getMarca(),veh.getColor());
          
        try {
            cVhieculo.create(auxEntidad);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(VehiculoDAOImpJPA.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    @Override
    public boolean edit(Vehiculo veh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
