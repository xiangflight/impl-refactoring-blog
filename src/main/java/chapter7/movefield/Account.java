package chapter7.movefield;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-16 21:31
 */

public class Account {

    private AccountType type;

    double interestForAmountDays(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    public double getInterestRate() {
        return type.getInterestRate();
    }

    public void setInterestRate(double interestRate) {
        type.setInterestRate(interestRate);
    }
}
