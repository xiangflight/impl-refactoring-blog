package chapter11.extractsubclass;

/**
 * @author xiang.zhao@woqutech.com
 * @date 2019-04-27 09:20
 */

public class JobItem {
    private int unitPrice;
    private int quantity;
    protected Employee employee;
    private boolean isLabor;

    public JobItem(int unitPrice, int quantity) {
        this(unitPrice, quantity, false);
    }

    protected JobItem(int unitPrice, int quantity, boolean isLabor) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.isLabor = isLabor;
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Employee getEmployee() {
        return employee;
    }

    public boolean isLabor() {
        return false;
    }
}
