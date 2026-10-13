/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mystorageapp;

/**
 *
 * @author simo
 */
public class MystorageApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       java.util.Scanner input = new java.util.Scanner(System.in);
        myDeque storage = new myDeque();
        int choice = 0 ;
        
        while(choice != 5) {
        
            System.out.println();
            System.out.println("1 - Add Food ");
            System.out.println("2 - Remove Food ");
            System.out.println("3 - See Top Item ");
            System.out.println("4 - Show All ");
            System.out.println("5 - Exit ");
            System.out.println(" Choose : ");
        
            choice = input.nextInt() ;
            
            
            if ( choice == 1 ) {
                // Food Name :
                
                System.out.println("Food Name " );
                String name = input.next();
               
                // Food weight : 
                
                System.out.print("Weight in grams: ");
                double weight = input.nextDouble();
                
                // Best Before 
                
                System.out.print("Days until best before: ");
                int days = input.nextInt();
                
                java.time.LocalDate date = java.time.LocalDate.now().plusDays(days);
                
                storage.add(new FoodItem(name, weight, date));
   
                
                
            
            
            
            
            }
        
        
        
        
        
        
        
        
        }
        
        
    }
    
}
