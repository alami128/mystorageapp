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
    
    public void add(FoodItem item) {
        if (isFull()) {
            System.out.println("Storage is full");
            return;
        }
        slots[count] = item;
        count = count + 1;
    }

    public FoodItem removeFront() {
    if (isEmpty()) {
        System.out.println("Storage is empty");
        return null;
    }
    
    
    FoodItem removed = slots[count - 1];
    slots[count - 1] = null;
    count = count - 1;
    return removed;
    
}
    public FoodItem removeBack()
    {
     if(isEmpty()){
         System.out.println("storage is empty ");
        return null ;      
     }
    FoodItem removed = slots[0];
    for (int i =0 ; i<count -1 ; i++ ){
    slots[i] = slots[i+1]; 
    
    
    }
       slots[count - 1] = null ;
       count = count -1 ; 
       return removed ; 
    
    }
    
    public FoodItem peek() {
    if (isEmpty()) {
        System.out.println("Storage is empty");
        return null;
    }
    return slots[count - 1];
}
    
    public void display() {
    if (isEmpty()) {
        System.out.println("Storage is empty");
        return;
    }
    for (int i = 0; i < count; i++) {
        System.out.println(i + ": " + slots[i].name + " | " + slots[i].weight + " g | best before " + slots[i].bestBefore);
    }
}
    
}
