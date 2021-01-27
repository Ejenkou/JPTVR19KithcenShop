/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools.Creators;

import entity.Item;
import java.util.List;
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
      System.out.print("Введите цену: ");
      double price = scanner.nextDouble();
      item.setPrice(price);
      scanner.nextLine();
      System.out.print("Введите серийный номер товара:");
      item.setIsbn(scanner.nextLine());
      System.out.println("Создан Товар: "+ item.getName());
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

    public void printListItems(List<Item> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
 

