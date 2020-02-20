/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestuarantBase;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import java.util.ArrayList;

/**
 *
 * @author adams
 */
public class FancyCoffee extends Coffee {

    ArrayList<Orderable> addOn = new ArrayList<>();
    Money price;

    /**
     *
     * @param name - name of coffee
     * @param size - size of coffee
     * @param basePrice - base price of coffee before adding orderables
     */
    public FancyCoffee(String name, Size size, Money basePrice) {
        super(name, size, basePrice);
        this.price = basePrice;
    }

    /**
     * adds a topping or other item to the coffee and total price
     *
     * @param item - the item added to the coffee
     */
    public void add(Orderable item) {
        this.addOn.add(item);
        this.price = this.price.add(item.getPrice());
    }

    /**
     * Provides String similar to what is on receipt, size name and price, also
     * with syrups (did not go back and fix as it was not used)
     *
     * @return
     */
    @Override
    public String toString() {
        return this.size + " " + this.getName() + " " + this.getPrice() + "\n" + "\t" + this.addOn.toString();
    }

    /**
     * Provides correctly formatted string to receipt
     *
     * @return
     */
    @Override
    public String getReceiptItem() {
        String receipt = this.size + "\t" + this.getName() + "\t" + this.price + "\n";
        for (int i = 0; i < addOn.size(); i++) {
            receipt = receipt + "\t" + addOn.get(i).getReceiptItem() + "\n";
        }
        return receipt;
    }
}
