package chapter6.replacemethodwithmethodobject;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-14 21:11
 */

class Gamma {

    private final Account account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    Gamma(Account source, int inputVal, int quantity, int yearToDate) {
        this.account = source;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute() {
        importantValue1 = (inputVal * quantity) + account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
        if (yearToDate - importantValue1 > 100) {
            importantValue2 -= 20;
        }
        importantValue3 = importantValue2 * 7;
        // and so on
        return importantValue3 - 2 * importantValue1;
    }
}
