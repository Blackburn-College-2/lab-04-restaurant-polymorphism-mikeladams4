/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestuarantBase;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;

/**
 *
 * @author adams
 */
public class Syrup implements Orderable {

    String flavor;
    Money price;

    /**
     *
     * @param flavor - flavor of syrup
     * @param price - price of syrup
     */
    public Syrup(String flavor, Money price) {
        this.flavor = flavor;
        this.price = price;
    }

    /**
     * Gives the flavor of syrup
     *
     * @return
     */
    @Override
    public String toString() {
        return this.flavor;
    }

    /**
     * Provides the price
     *
     * @return
     */
    @Override
    public Money getPrice() {
        return price;
    }

    /**
     * Provides correctly formatted string to receipt
     *
     * @return
     */
    @Override
    public String getReceiptItem() {
        return this.flavor + "\t " + this.price;
    }

}
