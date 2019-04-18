package chapter8.changevaluetoreference;

import java.util.HashMap;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-18 22:08
 */

class Customer {
    private final String name;

    private Customer(String name) {
        this.name = name;
        loadCustomers();
    }

    public String getName() {
        return name;
    }

    public static Customer getNamed(String name) {
        return instances.get(name);
    }

    private static HashMap<String, Customer> instances = new HashMap<String, Customer>();

    static void loadCustomers() {
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }

    private void store() {
        if (instances.get(this.getName()) == null) {
            instances.put(this.getName(), this);
        }
    }
}
