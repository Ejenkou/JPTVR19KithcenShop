/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools.Creators;


import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerManager {
    private Scanner scanner = new Scanner(System.in);
    public Customer createCustomer() {
        Customer customer = new Customer();
        System.out.println("--- Добавление нового покупателя в базу данных ---");
        System.out.print("Введите имя: ");
        customer.setFirstname(scanner.nextLine());
        System.out.print("Введите Фамилию: ");
        customer.setLastname(scanner.nextLine());
        System.out.print("Введите телефон: ");
        customer.setPhone(scanner.nextLine());
        System.out.print("Введите ваш баланс: ");
        customer.setWallet(scanner.nextInt());
        this.printCustomer(customer);
        return customer;
    }

    public void addCustomerToArray(Customer customer, Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            if(customers[i] == null){
                customers[i] = customer;
                break;
            }
        }
    }

    public void printCustomer(Customer customer) {
        System.out.println("Имя покупателя: "
                +customer.getFirstname()
                +" "
                + customer.getLastname()
        );
        System.out.println(" Ваш баланс: " + customer.getWallet() + " евро");
    }

    public void printListCustomers(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            if(customers[i] != null){
                System.out.println(i+1+". " + customers[i].toString());
            }
        }
    }
    
}
