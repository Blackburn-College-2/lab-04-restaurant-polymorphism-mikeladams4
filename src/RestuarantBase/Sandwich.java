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
public class Sandwich implements Orderable {

    ArrayList<Orderable> contents = new ArrayList<>();
    Money price;

    /**
     *
     * @param basePrice - the base price of a sandwich (0, as I would assume
     * meats cost different prices)
     */
    public Sandwich(Money basePrice) {
        this.price = basePrice;
    }

    /**
     * adds a topping or meat to the sandwich and total price
     *
     * @param item - the item added to the sandwich
     */
    public void add(Orderable item) {
        this.contents.add(item);
        this.price = this.price.add(item.getPrice());
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
        String receipt = "Sandwich \t" + getPrice() + "\n";
        for (int i = 0; i < contents.size(); i++) {
            receipt = receipt + "\t" + contents.get(i).getReceiptItem() + "\n";
        }
        return receipt;
    }

}
