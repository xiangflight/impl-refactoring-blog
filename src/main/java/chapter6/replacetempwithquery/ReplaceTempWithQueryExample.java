package chapter6.replacetempwithquery;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-13 21:36
 */

public class ReplaceTempWithQueryExample {

    private int quantity = 2;
    private int itemPrice = 2;

    double getPrice() {
        return basePrice() * discountFactor();
    }

    private int basePrice() {
        return quantity * itemPrice;
    }

    private double discountFactor() {
        if (basePrice() > 1000) {
            return 0.95;
        } else {
            return 0.98;
        }
    }

}
