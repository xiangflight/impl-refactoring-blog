package chapter1;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-13 10:54
 */

public class RegularPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
