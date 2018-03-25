/*
 * Gabriel hurtado
 * March 10th,2018
 * this program will allow customers to see the toal price of their meal aafter
 * entering the price of their meals, the final price will be babsed on taxes and tips.
 */
package restaurantbill;

import java.util.Scanner; 
public class RestaurantBill {

  
    public static void main(String[] args) {
        //Declaring variables and generating algorythm. 
        
        Scanner scanner =  new Scanner( System.in );
        double mealCost; 
        double totalCost; 
        double Tax;
        double tip; 
        double totalBill; 
        
       System.out.println( " Please enter the cost of the meal: " );
       
      mealCost = scanner.nextDouble();
      
        // Calculating the taxes and final price 
      
        Tax = mealCost * 0.13; 
        totalCost = mealCost + Tax;
        tip = 0.5 * totalCost; 
        totalBill = totalCost + tip;
        
        System.out.println(" Cost of meal: $" + mealCost);
        System.out.println( " Tax $" + Tax);
        System.out.println( " Tip: $" + tip);
        System.out.println( " Cost of your meal $" + totalBill);
        
    }
    
}
