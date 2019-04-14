package chapter6.inlinemethod;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-13 21:00
 */

public class InlineMethodSummary {

    private int numberOflateDeliveries;

    int getRating() {
        return (numberOflateDeliveries > 5) ? 2: 1;
    }

}
