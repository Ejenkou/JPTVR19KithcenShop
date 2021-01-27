package Tools.Savers;


import entity.Customer;
import entity.History;
import entity.Item;
import interfaces.Retentive;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejenk
 */
public class PersistToDatabase implements Retentive {
    
    private  EntityManager em;
    private  EntityTransaction tx;
    
    public PersistToDatabase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTVR19KlishinKitchenPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
    }

    @Override
    public void saveCustomers(List<Customer> customers) {
        tx.begin();
        for(Customer c : customers){
            if(c.getId() == null){
                em.persist(c);
            }
        }
        tx.commit();
    }
    
    @Override
    public void saveItems(List<Item> items) {
        tx.begin();
        for(Item item : items){
            if(item.getId() == null){
                em.persist(item);
            }
            tx.commit();
        }

    }

    @Override
    public void saveHistories(List<History> histories, boolean update) {
        tx.begin();
        for(History h : histories){
            if(update){
                em.merge(h);
            }else{
                em.persist(h);
            }
        }
        tx.commit();
    }

    @Override
    public List<Customer> loadCustomers() {
               try{
            return em.createQuery("SELECT c FROM Customer c").getResultList();
        } catch (Exception e) {
            return new ArrayList<Customer>();
        }
    }
    

    @Override
    public List<Item> loadItems() {
        try{
            return em.createQuery("SELECT i FROM Item i").getResultList();
        } catch (Exception e) {
            return new ArrayList<Item>();
        }
    }

    @Override
    public List<History> loadHistories() {
       try{
            return em.createQuery("SELECT h FROM History h").getResultList();
        } catch (Exception e) {
            return new ArrayList<History>();
        }
    }
    

    
    
}
