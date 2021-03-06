/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestuarantBase;

import edu.blackburn.cs.cs212.restaurantbase.MenuItem;
import edu.blackburn.cs.cs212.restaurantbase.Money;

/**
 *
 * @author mikel.adams
 */
public class Coffee extends MenuItem {

    Size size;

    /**
     *
     * @param name - name of coffee
     * @param size - size of coffee
     * @param basePrice - price of coffee
     */
    public Coffee(String name, Size size, Money basePrice) {
        super(name, basePrice);
        this.size = size;
    }

    /**
     * Provides String similar to what is on receipt, size name and price
     *
     * @return
     */
    @Override
    public String toString() {
        return this.size + " " + this.getName() + " " + this.getPrice();
    }

    /**
     * Provides the price
     *
     * @return
     */
    @Override
    public Money getPrice() {
        return super.getBasePrice();
    }

    /**
     * Provides correctly formatted string to receipt
     *
     * @return
     */
    @Override
    public String getReceiptItem() {
        return this.size + "\t" + this.getName() + "\t" + this.getPrice() + "\n";
    }

}
