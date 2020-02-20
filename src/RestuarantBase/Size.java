/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestuarantBase;

import edu.blackburn.cs.cs212.restaurantbase.Measurement;

/**
 *
 * @author mikel.adams
 */
public class Size extends Measurement {

    String name;

    /**
     *
     * @param name - name of the size
     */
    public Size(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the size
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the name of the size
     *
     * @return
     */
    @Override
    public String toString() {
        return this.name + "";
    }

}
