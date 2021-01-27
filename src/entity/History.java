/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pupil
 */
@Entity
public class History implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date giveOutDate;
    @OneToOne
    private Item item;
    @OneToOne
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
}
