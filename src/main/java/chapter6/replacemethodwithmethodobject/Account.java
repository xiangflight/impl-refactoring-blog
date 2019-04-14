package chapter6.replacemethodwithmethodobject;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-14 21:08
 */

public class Account {

    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    int delta() {
        return 0;
    }

}
