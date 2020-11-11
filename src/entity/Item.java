/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Item implements Serializable{
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
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    
     public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", firm=" + firm + ", price=" + price + ", number=" + isbn + '}';
    }
    
}
