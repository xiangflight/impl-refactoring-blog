package chapter1;

import java.util.Enumeration;
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
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each: rentals) {
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    each.getCharge() + "\n";
        }
        // add footer lines
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
        for (Rental each: rentals) {
            result += each.getMovie().getTitle() + ": " + each.getCharge() + "<BR>\n";
        }
        result += "<P>You owe <EM>" + getTotalCharge() + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                    getTotalFrequentRenterPoints() +
                    "<EM> frequent renter points<P>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental each: rentals) {
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        for (Rental each: rentals) {
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
