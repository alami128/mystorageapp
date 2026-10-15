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
            System.out.print("Food name (Burger, Pizza, Fries, Sandwich, Hotdog): ");
            String name = input.next();
            
            boolean validName = name.equalsIgnoreCase("Burger")
                    || name.equalsIgnoreCase("Pizza")
                    || name.equalsIgnoreCase("Fries")
                    || name.equalsIgnoreCase("Sandwich")
                    || name.equalsIgnoreCase("Hotdog");
            
            if (!validName) {
            
                System.out.println("Invalid food. Choose one of The 5 Foods " );
                continue ;
            }
     
                // Food weight : 
                
                System.out.print("Weight in grams: ");
                double weight = input.nextDouble();
                if ( weight <= 0 ){
                
                    System.out.println(" Please enter A weight Above 0 ");
                    continue ; 
              
                }
                
                // Best Before 
                
                System.out.print("Days until best before: ");
                int days = input.nextInt();
                if (days < 0 || days > 14) {
                    System.out.println("enter Days From 0 to 14 ") ; 
                    continue ; 
                          
                }
                
                java.time.LocalDate date = java.time.LocalDate.now().plusDays(days);
                
                storage.add(new FoodItem(name, weight, date));
                System.out.println("Added " + name);
                
   
                } else if (choice == 2) {
               System.out.println("1. Front door (newest)");
               System.out.println("2. Back door (oldest)");
               System.out.print("Which door: ");
               int door = input.nextInt();
                
               FoodItem removed = null;
        if (door == 1) {
            removed = storage.removeFront();
        } else if (door == 2) {
            removed = storage.removeBack();
        } else {
            System.out.println("Wrong door");
        }

        if (removed != null) {
            System.out.println("Removed " + removed.name);
        }
        
          } else if (choice == 3) {
        FoodItem top = storage.peek();
        if (top != null) {
            System.out.println("Top item: " + top.name);
        }
        
            
              } else if (choice == 4) {
        storage.display();

    } else if (choice == 5) {
        System.out.println("Goodbye");

    } else {
        System.out.println("Wrong choice, try 1 to 5");
                System.out.println("uuu");
    }
}
            
            }
}

        
