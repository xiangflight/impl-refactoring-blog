package chapter8.replacetypecodewithsubclasses;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-22 09:16
 */

public class Manager extends Employee {

    @Override
    public int getType() {
        return Employee.MANAGER;
    }
}
