/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mystorageapp;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author simo
 */
public class FoodItem {
    String name ;
    double weight ;
    LocalDate bestBefore;
    LocalDateTime timePlaced;
    
public FoodItem(String name , double weight , LocalDate bestBefore)
{{
    this.name = name; 
    this.weight = weight;
    this.bestBefore = bestBefore; 
    this.timePlaced = LocalDateTime.now(); 
    
    
    
}}
    
}
