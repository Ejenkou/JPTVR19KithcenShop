/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagerUI;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class UI {
 
    /**
     *
     */
    public void getManagerUI(){
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
                    
                    break;
                case "2":
                    System.out.println("--- Список товаров ---");
                    
                    break;
                case "3":
                    System.out.println("--- Добавить покупателя ---");
                    break;
                case "4":
                    System.out.println("--- Список покупателей ---");
                    
                    break;
                case "5":
                    System.out.println("--- Купить товар ---");
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
        }while(repeat);
}
}

