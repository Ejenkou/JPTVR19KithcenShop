
import entity.Customer;
import entity.History;
import entity.Item;
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
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
    }
        
        
        
    
    

    @Override
    public void saveCustomer(Customer customer) {
        tx.begin();
        em.persist(customer);
        tx.commit();
    }

    @Override
    public void saveItem(Item item) {
        tx.begin();
        em.persist(item);
        tx.commit();
    }

    @Override
    public void saveHistory(History history, boolean update) {
        tx.begin();
        if(update){
            em.merge(history);
        }else{
            em.persist(history);
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
    

    @Override
    public void freeResources() {
       if(em != null) em.close();
    }
    
}
