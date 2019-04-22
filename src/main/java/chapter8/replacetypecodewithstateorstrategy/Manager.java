package chapter8.replacetypecodewithstateorstrategy;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-22 13:10
 */

public class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return MANAGER;
    }
}
