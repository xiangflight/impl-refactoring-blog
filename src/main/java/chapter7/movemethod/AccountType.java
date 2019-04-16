package chapter7.movemethod;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-16 09:10
 */

public class AccountType {

    boolean isPremium() {
        return false;
    }

    double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}
