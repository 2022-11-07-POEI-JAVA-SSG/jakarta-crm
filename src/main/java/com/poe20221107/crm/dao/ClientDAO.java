package com.poe20221107.crm.dao;

import com.poe20221107.crm.dao.EntityManagerSingleton;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class ClientDAO {
    
    
    public static void create(Client o) {
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();


        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        entityManager.persist(o);

        tx.commit();
    }
    
    public static Client findById(Long id){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        return entityManager.find(Client.class, id);
    }
    
    public static void delete(Client o){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        
        entityManager.remove(o);
        
        tx.commit();
    }
    
    public static void update(Client o){
        
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        
        entityManager.merge(o);
        
        tx.commit();
    }
 
    public static List<Client> findAll(){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        Query query = entityManager.createQuery("SELECT c FROM Client c");

        return query.getResultList();
    }
    
    public static void deleteById(Long id){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        
        Query query = entityManager.createQuery("DELETE FROM Client c WHERE c.id= :id");
        query.setParameter("id", id);
        query.executeUpdate();
        
        tx.commit();
    }
}
