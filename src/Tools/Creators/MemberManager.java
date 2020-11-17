/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools.Creators;

import entity.Customer;
import entity.History;
import entity.Item;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class MemberManager {
    private Scanner scanner = new Scanner(System.in);
    private CustomerManager customerManager = new CustomerManager();
    private ItemManager itemManager = new ItemManager();
    public History takeOnItem(Item[] items, Customer[] customers) {
        History history = new History();
        System.out.println("Какой товар вы хотите преобрести?");
        itemManager.printListItems(items);
        return history;
        
        
        
    
   
  }
}


    


    



