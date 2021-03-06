package chapter8.changevaluetoreference;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-18 22:06
 */

public class Order {
    private Customer customer;

    public Order(String customerName) {
        customer = Customer.getNamed(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(String customerName) {
        customer = Customer.getNamed(customerName);
    }
}
