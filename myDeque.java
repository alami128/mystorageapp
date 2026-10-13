/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mystorageapp;

/**
 *
 * @author simo
 */
public class myDeque {
    
    
    FoodItem[] slots = new FoodItem[8];
    int count = 0;
      public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == 8;
    }
    
    

}
