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
        
        FoodItem test = new FoodItem("newfood",140 ,java.time.LocalDate.now().plusDays(5));
        System.out.println("Foof name : " + test.name);
        System.out.println("Food weight : " + test.weight);
        System.out.println("Food Date : " + test.bestBefore);
        System.out.println("Food Placed Date : " + test.timePlaced);
        
    }
    
}
