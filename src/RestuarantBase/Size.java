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
public class Size extends Measurement{
    
    String name;
    
    public Size(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return this.name + "";
    }
    
}
