/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.acceso.entidades.Parqueadero;
import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public interface IparqueaderoDAO {
    
    public List<Parqueadero> getParqueaderos();
    
    public Parqueadero getParqueaderoByid(int id);
    
    public boolean addOcupados(String id_parqueadero);
    
    public boolean lessOcupados(String id_parqueadero);
    
    
    
}
