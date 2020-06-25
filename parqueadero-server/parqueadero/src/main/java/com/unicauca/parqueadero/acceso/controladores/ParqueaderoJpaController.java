/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso.controladores;

import com.unicauca.parqueadero.acceso.controladores.exceptions.NonexistentEntityException;
import com.unicauca.parqueadero.acceso.entidades.Parqueadero;
import com.unicauca.parqueadero.acceso.entidades.Usuario;
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
public class ParqueaderoJpaController implements Serializable {

    public ParqueaderoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("com.unicauca.parqueadero_parqueadero_war_1.0-SNAPSHOTPU");
        //this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Parqueadero parqueadero) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(parqueadero);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public boolean sumarOcupados(String idParqueadero){
        
        //Usuario usuarioobj = new Usuario();
        
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        //try {
            int afectados =  em.createNativeQuery("update parqueadero set puestos_ocupados=puestos_ocupados+1 where id_parqueadero=1").executeUpdate();
            //System.out.println("los afecados fueron ");
            //System.out.println(afectados);
            
            em.getTransaction().commit();
       // } finally {
            em.close();
      //  }
        
        return true;
    }
    
       public boolean restarOcupados(String idParqueadero){
        
        //Usuario usuarioobj = new Usuario();
        
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        //try {
            int afectados =  em.createNativeQuery("update parqueadero set puestos_ocupados=puestos_ocupados-1 where id_parqueadero=1").executeUpdate();
            //System.out.println("los afecados fueron ");
            //System.out.println(afectados);
            
            em.getTransaction().commit();
       // } finally {
            em.close();
      //  }
        
        return true;
    }

    public void edit(Parqueadero parqueadero) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            parqueadero = em.merge(parqueadero);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = parqueadero.getIdParqueadero();
                if (findParqueadero(id) == null) {
                    throw new NonexistentEntityException("The parqueadero with id " + id + " no longer exists.");
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
            Parqueadero parqueadero;
            try {
                parqueadero = em.getReference(Parqueadero.class, id);
                parqueadero.getIdParqueadero();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The parqueadero with id " + id + " no longer exists.", enfe);
            }
            em.remove(parqueadero);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Parqueadero> findParqueaderoEntities() {
        return findParqueaderoEntities(true, -1, -1);
    }

    public List<Parqueadero> findParqueaderoEntities(int maxResults, int firstResult) {
        return findParqueaderoEntities(false, maxResults, firstResult);
    }

    private List<Parqueadero> findParqueaderoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Parqueadero.class));
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

    public Parqueadero findParqueadero(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Parqueadero.class, id);
        } finally {
            em.close();
        }
    }

    public int getParqueaderoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Parqueadero> rt = cq.from(Parqueadero.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
