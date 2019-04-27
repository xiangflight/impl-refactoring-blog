package chapter11.extractsuperclass;

import java.util.Vector;

/**
 * @author xiang.zhao@woqutech.com
 * @date 2019-04-27 16:30
 */

public class Department extends Party {
    private Vector<Employee> staff = new Vector<>();

    public Department(String name) {
        super(name);
    }
    @Override
    public int getAnnualCost() {
        int result = 0;
        for (Employee emp: getStaff()) {
            result += emp.getAnnualCost();
        }
        return result;
    }
    public int getHeadCount() {
        return staff.size();
    }
    public Vector<Employee> getStaff() {
        return staff;
    }
    public void addStaff(Employee emp) {
        staff.addElement(emp);
    }
}
