package chapter1;

import java.util.Vector;

/**
 * 顾客
 *
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-12 23:32
 */

public class Customer {

    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return null;
    }
}
