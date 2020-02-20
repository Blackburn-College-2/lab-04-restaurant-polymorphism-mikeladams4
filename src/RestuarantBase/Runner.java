/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestuarantBase;

import edu.blackburn.cs.cs212.restaurantbase.Measurement;
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Size large = new Size("Large");
        Size medium = new Size("Medium");
        Size small = new Size("Small");
        Money moneyLarge = new Money(12.99);
        Money moneyMedium = new Money(8.99);
        Money moneySmall = new Money(6.99);
        Receipt mike = new Receipt();
        Coffee latte = new Coffee("Latte", large, moneyLarge);
        Coffee mocha = new Coffee("Mocha", small, moneySmall);
        Coffee black = new Coffee("Black Coffe", large, moneyLarge);
        Coffee irish = new Coffee("Irish Coffe", medium, moneyMedium);
        Coffee flat = new Coffee("Flat", large, moneyLarge);
        mike.add(latte);
        mike.add(mocha);
        mike.add(black);
        mike.add(irish);
        mike.add(flat);
        System.out.println(mike.prepare());
        
        
        
    }
    
}
