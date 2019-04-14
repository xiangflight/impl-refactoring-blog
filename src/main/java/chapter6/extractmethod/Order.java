package chapter6.extractmethod;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-13 18:53
 */

public class Order {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public double basePrice() {
        return 0.0;
    }
}
