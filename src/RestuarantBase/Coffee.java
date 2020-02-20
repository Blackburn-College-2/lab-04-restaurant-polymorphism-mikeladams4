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

    public Coffee(String name, Size size, Money basePrice) {
        super(name, basePrice);
        this.size = size;
    }

    @Override
    public String toString() {
        return this.size + " " + this.getName() + " " + this.getPrice();
    }

    @Override
    public Money getPrice() {
        return super.getBasePrice();
    }

    @Override
    public String getReceiptItem() {
        return this.size + " " + this.getName() + " " + this.getPrice() + "\n";
    }

}
