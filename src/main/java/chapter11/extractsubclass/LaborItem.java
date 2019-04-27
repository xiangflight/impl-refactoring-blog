package chapter11.extractsubclass;

/**
 * @author xiang.zhao@woqutech.com
 * @date 2019-04-27 09:24
 */

public class LaborItem extends JobItem {
    private Employee employee;

    public LaborItem(int quantity, Employee employee) {
        super(0, quantity, true);
        this.employee = employee;
    }

    @Override
    public Employee getEmployee() {
        return employee;
    }

    @Override
    public boolean isLabor() {
        return true;
    }

    @Override
    public int getUnitPrice() {
        return employee.getRate();
    }
}
