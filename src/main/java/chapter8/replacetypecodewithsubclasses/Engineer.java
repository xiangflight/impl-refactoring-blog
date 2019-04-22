package chapter8.replacetypecodewithsubclasses;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-22 09:13
 */

public class Engineer extends Employee {

    @Override
    public int getType() {
        return Employee.ENGINEER;
    }
}
