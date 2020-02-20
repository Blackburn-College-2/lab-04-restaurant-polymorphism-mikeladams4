package RestuarantBase;

import edu.blackburn.cs.cs212.restaurantbase.Measurement;
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;

/**
 *
 * @author adams
 */
public class Runner {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Money moneyLarge = new Money(4.99);           //Standard pricing instead of making a new money with every drink ordered
        Money moneyMedium = new Money(3.99);
        Money moneySmall = new Money(1.99);
        Money topping = new Money(.75);
        Money condiment = new Money(.25);
        Money syrup = new Money(.85);

        Size large = new Size("Large");               //Standard sizes
        Size medium = new Size("Medium");
        Size small = new Size("Small");

        Syrup chocolate = new Syrup("Chocolate", syrup);
        Syrup sugar = new Syrup("Sugar", syrup);
        Syrup caramel = new Syrup("Caramel", syrup);

        Receipt mike = new Receipt();
        Coffee latte = new Coffee("Latte", large, moneyLarge);
        Coffee mocha = new Coffee("Mocha", small, moneySmall);
        Coffee black = new Coffee("Black Coffee", large, moneyLarge);
        Coffee irish = new Coffee("Irish Coffee", medium, moneyMedium);
        Coffee flat = new Coffee("Flat", large, moneyLarge);
        mike.add(latte);
        mike.add(mocha);
        mike.add(black);
        mike.add(irish);
        mike.add(flat);
        System.out.println(mike.prepare());
        System.out.println(mike.getTotalString());

        FancyCoffee fLatte = new FancyCoffee("Latte", large, moneyLarge);
        fLatte.add(chocolate);
        fLatte.add(caramel);
        fLatte.add(sugar);
        mike.add(fLatte);
        System.out.println(mike.prepare());
        System.out.println(mike.getTotalString());

        Sandwich sandwich = new Sandwich(new Money(0));
        sandwich.add(new Meat("Chicken", new Money(3.50)));
        sandwich.add(new Topping("Lettuce", topping));
        sandwich.add(new Topping("Cheese", topping));
        sandwich.add(new Topping("Pickles", topping));
        sandwich.add(new Topping("Mayo", condiment));
        mike.add(sandwich);
        System.out.println(mike.prepare());
        System.out.println(mike.getTotalString());
    }
}
