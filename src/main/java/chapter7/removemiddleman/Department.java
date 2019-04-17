package chapter7.removemiddleman;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-17 22:06
 */

class Department {
    private String chargeCode;
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }
}
