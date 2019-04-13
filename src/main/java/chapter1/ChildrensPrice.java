package chapter1;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-13 10:54
 */

public class ChildrensPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
