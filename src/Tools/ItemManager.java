/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import entity.Item;
import java.util.Scanner;

/** Добавить товар
 *
 * @author pupil
 */
public class ItemManager {
    private Scanner scanner = new Scanner(System.in);
  public Item createItem(){
      Item item = new Item();
      System.out.println("--- Новый предмет --- ");
      System.out.print("Введите название предмета: ");
      item.setName(scanner.nextLine());
      System.out.print("Введите название фирмы: ");
      item.setFirm(scanner.nextLine());
      System.out.print("Введите желаемую цену:  ");
      item.setPrice(scanner.nextInt());
      System.out.print("Введите ISBN товара");
      item.setIsbn(scanner.nextLine());
      System.out.println("Создана книга: "+ item.getName());
      return item;
}
   public void addItemToArray(Item item, Item[] items) {
        for (int i = 0; i < items.length; i++) {
            if(items[i] == null){
                items[i] = item;
                break;
            }
        }
    }

    public void printListItems(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            if(items[i] != null){
                System.out.println(i+1+". " + items[i].toString());
            }
        }   
    }
    
}
 

