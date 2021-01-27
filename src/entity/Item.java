/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */
@Entity
public class Item implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String firm;
    private Integer price;
    private String isbn;
public Item () {
    
}
public Item(String name, String firm, Integer price, String isbn) {
        this.name = name;
        this.firm = firm;
        this.price = price;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getFirm() {
        return firm;
    }
    public void setFirm(String firm) {
        this.firm = firm;
    }
    public double getPrice() {
        double dPrice = price;
        return dPrice / 100;
    }
    public void setPrice(double price) {
        this.price = (int)(price * 100);
    }
    
     public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", firm=" + firm + ", price=" + getPrice() + ", number=" + isbn + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
