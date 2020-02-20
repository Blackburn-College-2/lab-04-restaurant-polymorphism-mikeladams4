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
public class Topping implements Orderable {

    String name;
    Money price;

    /**
     *
     * @param name - name of topping
     * @param price - price of topping
     */
    public Topping(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Provides the price
     *
     * @return
     */
    @Override
    public Money getPrice() {
        return this.price;
    }

    /**
     * Provides correctly formatted string to receipt
     *
     * @return
     */
    @Override
    public String getReceiptItem() {
        return this.name + "\t" + this.price;
    }

}
