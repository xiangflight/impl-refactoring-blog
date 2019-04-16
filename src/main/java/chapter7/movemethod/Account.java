package chapter7.movemethod;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-16 09:10
 */

public class Account {

    private AccountType type;
    private int daysOverdrawn;

    double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += type.overdraftCharge(daysOverdrawn);
        }
        return result;
    }

}
