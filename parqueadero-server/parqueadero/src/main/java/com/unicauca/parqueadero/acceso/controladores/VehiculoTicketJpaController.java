/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso.controladores;

import com.unicauca.parqueadero.acceso.controladores.exceptions.NonexistentEntityException;
import com.unicauca.parqueadero.acceso.entidades.VehiculoTicket;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author alvarodanieleraso
 */
public class VehiculoTicketJpaController implements Serializable {

    public VehiculoTicketJpaController() {
        //this.emf = emf;
        this.emf = Persistence.createEntityManagerFactory("com.unicauca.parqueadero_parqueadero_war_1.0-SNAPSHOTPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(VehiculoTicket vehiculoTicket) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(vehiculoTicket);
            em.getTransaction().commit();
                    
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(VehiculoTicket vehiculoTicket) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            vehiculoTicket = em.merge(vehiculoTicket);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = vehiculoTicket.getId();
                if (findVehiculoTicket(id) == null) {
                    throw new NonexistentEntityException("The vehiculoTicket with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            VehiculoTicket vehiculoTicket;
            try {
                vehiculoTicket = em.getReference(VehiculoTicket.class, id);
                vehiculoTicket.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The vehiculoTicket with id " + id + " no longer exists.", enfe);
            }
            em.remove(vehiculoTicket);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<VehiculoTicket> findVehiculoTicketEntities() {
        return findVehiculoTicketEntities(true, -1, -1);
    }

    public List<VehiculoTicket> findVehiculoTicketEntities(int maxResults, int firstResult) {
        return findVehiculoTicketEntities(false, maxResults, firstResult);
    }

    private List<VehiculoTicket> findVehiculoTicketEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(VehiculoTicket.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public VehiculoTicket findVehiculoTicket(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(VehiculoTicket.class, id);
        } finally {
            em.close();
        }
    }
    
    //agregamos metodo para buscar el ticket por la placa del vehiculo
    //public List<VehiculoTicket> buscarTicketByidVehiculo(){
    public VehiculoTicket buscarTicketByidVehiculo(String placa){
        VehiculoTicket vehitick = new VehiculoTicket();
        EntityManager em = getEntityManager();
        
        try {
            return (VehiculoTicket) em.createNativeQuery("SELECT * FROM vehiculo_ticket WHERE vehiculo_id = '"+placa+"' LIMIT 1", VehiculoTicket.class).getSingleResult();
             
        } finally {
            em.close();
        }
    }

    public int getVehiculoTicketCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<VehiculoTicket> rt = cq.from(VehiculoTicket.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
