package chapter8.changevaluetoreference;

import java.util.Collection;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-19 07:37
 */

public class Main {
    private static int numberOfOrdersFor(Collection<Order> orders, String customer) {
        int result = 0;
        for (Order each : orders) {
            if (each.getCustomerName().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}
