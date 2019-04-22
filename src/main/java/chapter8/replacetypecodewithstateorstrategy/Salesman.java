package chapter8.replacetypecodewithstateorstrategy;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-22 13:09
 */

public class Salesman extends EmployeeType {
    @Override
    int getTypeCode() {
        return SALESMAN;
    }
}
