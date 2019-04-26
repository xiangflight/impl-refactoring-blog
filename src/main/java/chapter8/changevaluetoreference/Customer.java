package chapter8.changevaluetoreference;

import java.util.HashMap;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-18 22:08
 */

class Customer {
    private static HashMap<String, Customer> instances = new HashMap<String, Customer>();
    private final String name;

    private Customer(String name) {
        this.name = name;
        loadCustomers();
    }

    public static Customer getNamed(String name) {
        return instances.get(name);
    }

    static void loadCustomers() {
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }

    public String getName() {
        return name;
    }

    private void store() {
        if (instances.get(this.getName()) == null) {
            instances.put(this.getName(), this);
        }
    }
}
