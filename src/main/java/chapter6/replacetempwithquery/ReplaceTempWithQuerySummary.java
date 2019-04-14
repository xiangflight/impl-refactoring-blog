package chapter6.replacetempwithquery;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-13 21:28
 */

public class ReplaceTempWithQuerySummary {

    private int quantity = 2;
    private double itemPrice = 2.5;

    public double replaceTempWithQuery() {
        if (basePrice() > 1000) {
            return basePrice() * 0.95;
        } else {
            return basePrice() * 0.98;
        }
    }

    double basePrice() {
        return quantity * itemPrice;
    }

}
