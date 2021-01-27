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
import java.util.List;
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
        System.out.println("Список товаров:");
        itemManager.printListItems(items);
        System.out.println("Какой товар вы хотите преобрести?");
        int numberItem;
        numberItem = scanner.nextInt();
        scanner.nextLine();
        Item item = items[numberItem-1];
        if (customer.getWallet() >= item.getPrice()){
            Double wallet = (double)customer.getWallet()/100;
            Integer newPrice = (int)((wallet-item.getPrice())*100);
            customer.setWallet(newPrice);
            Calendar calendar = new GregorianCalendar();
            history.setGiveOutDate(calendar.getTime());
            history.setCustomer(customer);
            history.setItem(item);
            System.out.printf("Товар \"%s\" куплен пользователем %s %s%n"
                    ,history.getItem().getName()
                    ,history.getCustomer().getFirstname()
                    ,history.getCustomer().getLastname()
            );
            return history;
        }else{
            System.out.println("Не хватает средств, пополните баланс.");
            return null;
        }
        
       
        
    }
    
     public void addingBalance(Customer customer) {
         //Баланс покупателя
        System.out.println();
        System.out.println("Желаете ли Вы пополнить баланс?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        String choice = scanner.nextLine();
        if (choice.equals("2")) {
            System.out.println();
            return;
        }
        if (choice.equals("1")) {
            System.out.print("Введите сумму, которую желаете пополнить: ");
            int newCash = scanner.nextInt();
            customer.setWallet(customer.getWallet()+ newCash);
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

    public History takeOnItem(List<Item> items, List<Customer> customers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addHistoryToArray(History history, List<History> histories) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        
        
        
    
   
  

    
    


    


    



