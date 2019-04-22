package chapter8.replacetypecodewithstateorstrategy;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-22 13:03
 */

public class Employee {
    private EmployeeType employeeType;

    private int monthlySalary;
    private int bonus;
    private int commission;

    Employee(int type) {
        setType(type);
    }

    int getType() {
        return employeeType.getTypeCode();
    }

    void setType(int type) {
        employeeType = EmployeeType.newType(type);
    }

    int payAmount() {
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
                default:
                    throw new RuntimeException("Incorrect Employee");
        }
    }
}
