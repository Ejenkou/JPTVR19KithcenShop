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
        System.out.println("--- Список пользователей ---");
        customerManager.printListCustomers(customers);
        System.out.print("Выберите номер пользователя: ");
        int readerNumber = scanner.nextInt();
        scanner.nextLine();
        Customer customer = customers[readerNumber-1];
        history.setCustomer(customer);
        this.addingBalance(history);
        System.out.println("Какой товар вы хотите преобрести?");
        itemManager.printListItems(items);
        int number;
        number = scanner.nextInt();
        scanner.nextLine();
        Item item = items[number-1];
        history.setItem(item);
        Calendar calendar = new GregorianCalendar();
        history.setGiveOutDate(calendar.getTime());
        
        
        System.out.printf("Товар \"%s\" куплен пользователем %s %s%n"
                ,history.getItem().getName()
                ,history.getCustomer().getFirstname()
                ,history.getCustomer().getLastname()
        );
        return history;
        
    }
    
     public void addingBalance(History history, Customer customer) {
         //Баланс покупателя
         Wallet wallet = new Wallet();
         wallet = customer.getWallet();
        System.out.println();
        
        //System.out.println("Ваш баланс: " + wallet + " евро");
        
        System.out.println();
        System.out.println("Желаете ли Вы пополнить баланс?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        String choice = scanner.nextLine();
        if (choice.equals("2")) {
            System.out.println();
            
            //System.out.println("Ваш баланс: " + wallet + " евро");
            
            
        }
        if (choice.equals("1")) {
            
            System.out.print("Введите сумму, которую желаете пополнить: ");
            int userBalance = scanner.nextInt();
            
        
            
           
            

            //Добавить сумму к балансу wallet =  + userBalance;
            System.out.println();
            
            //System.out.println("Ваш баланс: " + wallet + " евро");
            
        }
    }

    
            
        
    

    

    private void printHistory(History history) {
        System.out.printf("Товар \"%s\" куплен пользователем %s %s%n"
                ,history.getItem().getName()
                ,history.getCustomer().getFirstname()
                ,history.getCustomer().getLastname()
        );

    }
    public void addHistoryToArray(History history, History[] histories) {
        for (int i = 0; i < histories.length; i++) {
            if (histories[i] == null) {
                histories[i] = history;
                break;
  
   }
        }
    }

    public void printListReadProducts(History[] histories) {
        for (int i = 0; i < histories.length; i++) {
            if(histories[i] != null && histories[i].getGiveOutDate()==null){
                System.out.printf("%d. Товар \"%s\" куплен пользователем %s %s%n"
                        ,i+1
                        ,histories[i].getItem().getName()
                        ,histories[i].getCustomer().getFirstname()
                        ,histories[i].getCustomer().getLastname()
                );
            }
        }
    }
}
        
        
        
    
   
  

    
    


    


    



