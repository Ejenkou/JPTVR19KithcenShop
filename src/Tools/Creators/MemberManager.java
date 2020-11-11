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

    public static Item takeOnItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Scanner scanner = new Scanner(System.in);
    private CustomerManager customerManager = new CustomerManager();
    private ItemManager itemManager = new ItemManager();
    public Item takeOnItem(Item[] items, Customer[] customers) {
        System.out.println("Какой товар вы хотите преобрести?");
        itemManager.printListItems(items);
        
        
        
    
   
   }
} 


    


    



