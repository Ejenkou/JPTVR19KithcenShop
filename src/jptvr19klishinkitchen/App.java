/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19klishinkitchen;

import Tools.Creators.CustomerManager;
import Tools.Creators.ItemManager;
import Tools.Creators.MemberManager;
import Tools.Savers.CustomerSaver;
import Tools.Savers.HistorySaver;
import Tools.Savers.ItemSaver;
import entity.Customer;
import entity.History;
import entity.Item;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
     private Item[] items = new Item[10];
     private History[] histories = new History[10];
     private Customer[] customers = new Customer[10];
     
     private ItemSaver itemSaver = new ItemSaver();
     private ItemManager itemManager = new ItemManager();
     private CustomerManager customerManager = new CustomerManager();
     private CustomerSaver customerSaver = new CustomerSaver();
     private MemberManager memberManager = new MemberManager();
     private HistorySaver historySaver = new HistorySaver();
     private Retentive saver = new PersistToDatabase();
     
     public App(){
         this.items = saver.loadItems();
         this.customers = saver.loadCustomers();
         this.histories = saver.loadHistories();
     }
     
     void run() { 
        boolean repeat = true;
        
        do{
            System.out.println("Задачи: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить Товар ");
            System.out.println("2. Список товаров");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список покупателей");
            System.out.println("5. Купить товар");
            System.out.print("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("--- конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- Добавить товар ---");
                    Item item = itemManager.createItem();
                    if (item != null){
                        items.add(item);
                    }
                    
                    break;
                case "2":
                    System.out.println("--- Список товаров ---");
                    itemManager.printListItems(items);
                    
                    break;
                case "3":
                    System.out.println("--- Добавить покупателя ---");
                    Customer customer = customerManager.createCustomer();
                    customerManager.addCustomerToArray(customer,customers);
                    customerSaver.saveCustomers(customers);
                    break;
                case "4":
                    System.out.println("--- Список покупателей ---");
                    customerManager.printListCustomers(customers);
                    
                    break;
                case "5":
                    System.out.println("--- Купить товар ---");
                    History history = memberManager.takeOnItem(items, customers);
                    if (history == null) {
                        break;
                    }
                    memberManager.addHistoryToArray(history,histories);
                    historySaver.saveHistories(histories);

                    System.out.println();
                    
                    
                    
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
        }       while(repeat);
}



     
     
    

    
}
