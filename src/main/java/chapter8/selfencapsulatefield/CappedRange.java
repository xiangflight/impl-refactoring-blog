package chapter8.selfencapsulatefield;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-18 21:55
 */

public class CappedRange extends IntRange {

    private int cap;

    CappedRange(int low, int high, int cap) {
        super(low, high);
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }

    @Override
    public int getHigh() {
        return Math.min(super.getHigh(), getCap());
    }
}
