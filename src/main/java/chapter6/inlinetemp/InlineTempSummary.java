package chapter6.inlinetemp;

import chapter6.extractmethod.Order;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-13 21:13
 */

public class InlineTempSummary {

    boolean inlineTemp() {
        Order anOrder = new Order();

        return (anOrder.basePrice() > 1000);
    }

}
