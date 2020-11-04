/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools.Savers;

import entity.Item;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



/**
 *
 * @author pupil
 */
public class ItemSaver {
    public void saveItems(Item[] items) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos= new FileOutputStream("items");
            oos= new ObjectOutputStream(fos);
            oos.writeObject(items);
            oos.flush();
        }catch (FileNotFoundException ex){
            System.out.println("Не найден файл");
        }catch (IOException ex){
            System.out.println("ошибка ввода/вывода");
        }
    }

    public Item[] loadItems() {
        Item[] items= new Item[10];
        
        return items;
        
    }

}


