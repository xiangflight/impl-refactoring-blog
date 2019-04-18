package chapter8.selfencapsulatefield;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-18 21:45
 */

public class SelfEncapsulateFieldSummary {
    private int low, high;

    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }
}
