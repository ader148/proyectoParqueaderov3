package com.unicauca.parqueadero.acceso.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-23T19:00:12")
@StaticMetamodel(Parqueadero.class)
public class Parqueadero_ { 

    public static volatile SingularAttribute<Parqueadero, Integer> idParqueadero;
    public static volatile SingularAttribute<Parqueadero, Integer> puestosTotales;
    public static volatile SingularAttribute<Parqueadero, String> direccion;
    public static volatile SingularAttribute<Parqueadero, String> telefonos;
    public static volatile SingularAttribute<Parqueadero, String> nombre;
    public static volatile SingularAttribute<Parqueadero, Integer> puestosOcupados;

}