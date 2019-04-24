package chapter10.replaceparameterwithmethods;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-24 09:17
 */

public class ReplaceParameterWithMethodsExample {
    private int quantity;
    private int itemPrice;

    public double getPrice() {
        if (getDiscountLevel() == 2) {
            return getBasePrice() * 0.1;
        } else {
            return getBasePrice() * 0.05;
        }
    }

    private int getDiscountLevel() {
        if (quantity > 100) {
             return 2;
        } else {
             return 1;
        }
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }
}
