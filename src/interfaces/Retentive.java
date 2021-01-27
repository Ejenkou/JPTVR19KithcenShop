package interfaces;


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
    public void saveCustomers(List<Customer> customers);
    public void saveItems(List<Item> items);
    public void saveHistories(List<History> histories,boolean update);
    public List<Customer> loadCustomers();
    public List<Item> loadItems();
    public List<History> loadHistories();
  
    
}




