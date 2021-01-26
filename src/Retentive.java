
import entity.Customer;
import entity.History;
import entity.Item;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejenk
 */
public interface Retentive {
    public void saveCustomer(Customer customer);
    public void saveItem(Item item);
    public void saveHistory(History history,boolean update);
    public List<Customer> loadCustomers();
    public List<Item> loadItems();
    public List<History> loadHistories();
    public void freeResources();
    
}




