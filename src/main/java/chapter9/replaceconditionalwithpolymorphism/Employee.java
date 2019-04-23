package chapter9.replaceconditionalwithpolymorphism;

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

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getBonus() {
        return bonus;
    }

    public int getCommission() {
        return commission;
    }

    int payAmount() {
        return employeeType.payAmount(this);
    }
}
