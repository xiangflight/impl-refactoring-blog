package chapter9.introducenullobject;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-23 20:18
 */

public class Site {
    private Customer customer;

    public Customer getCustomer() {
        return customer == null ? Customer.newNull() : customer;
    }
}
