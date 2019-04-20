package chapter8.changeundirectionalassociationtobidirectional;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-20 10:03
 */

public class Order {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (customer != null) {
            customer.friendOrders().remove(this);
            this.customer = customer;
        }
        if (customer != null) {
            customer.friendOrders().add(this);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Order)) {
            return false;
        }
        Order other = (Order) obj;
        return other.customer.equals(this.customer);
    }

    @Override
    public int hashCode() {
        return customer.hashCode();
    }
}
