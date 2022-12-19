package com.poe20221107.crm.dao;

import com.poe20221107.crm.dao.EntityManagerSingleton;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class OrderDAO {
    
    
    public static void create(Order o) {
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();


        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        entityManager.persist(o);

        tx.commit();
    }
    
    public static Order findById(Long id){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        return entityManager.find(Order.class, id);
    }
    
    public static void delete(Order o){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        
        entityManager.remove(o);
        
        tx.commit();
    }
    
    public static void update(Order o){
        
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        
        entityManager.merge(o);
        
        tx.commit();
    }
 
    public static List<Order> findAll(){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        Query query = entityManager.createQuery("SELECT o FROM Order o");

        return query.getResultList();
    }
    
    public static void deleteById(Long id){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        
        Query query = entityManager.createQuery("DELETE FROM Order o WHERE o.id= :id");
        query.setParameter("id", id);
        query.executeUpdate();
        
        tx.commit();
    }
}
