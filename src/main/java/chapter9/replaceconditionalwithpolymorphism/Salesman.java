package chapter9.replaceconditionalwithpolymorphism;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-22 13:09
 */

class Salesman extends EmployeeType {
    @Override
    int getTypeCode() {
        return SALESMAN;
    }

    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}
