package chapter6.introduceexplainingvariable;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-14 16:58
 */

public class IntroduceExplainingVariableExample {

    private int quantity = 1000;
    private double itemPrice = 2.4;

    double price() {
        return basePrice() - quantityDiscount() + shipping();
    }

    private double basePrice() {
        return quantity * itemPrice;
    }

    private double quantityDiscount() {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private double shipping() {
        return Math.min(basePrice() * 0.1, 100.0);
    }

}
