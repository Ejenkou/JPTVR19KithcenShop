/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class History implements Serializable{
    private Date giveOutDate;
    
    private Item item;
    private Customer customer;
    


    public History(Item item, Customer customer, Date giveOutDate, Date returnDate) {
        this.item = item;
        this.customer = customer;
        this.giveOutDate = giveOutDate;
        
    }

    public History() {}
    


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getGiveOutDate() {
        return giveOutDate;
    }

    public void setGiveOutDate(Date giveOutDate) {
        this.giveOutDate = giveOutDate;
    }

    @Override
    public String toString() {
        return "History{" 
                + "item=" + item.getName()
                + ", customer=" + customer.getLastname()
                + ", giveOutDate=" + giveOutDate
                + '}';
    }

    
    
}
