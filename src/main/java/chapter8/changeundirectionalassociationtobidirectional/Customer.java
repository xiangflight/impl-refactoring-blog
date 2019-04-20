package chapter8.changeundirectionalassociationtobidirectional;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-20 10:03
 */

class Customer {
    private Set<Order> orders = new HashSet<>();

    /**
     * should only be used by Order when modifying the association
     *
     * @return orders
     */
    Set<Order> friendOrders() {
        return orders;
    }

    void addOrder(Order order) {
        order.setCustomer(this);
    }
}
