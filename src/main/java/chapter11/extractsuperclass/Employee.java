package chapter11.extractsuperclass;

/**
 * @author xiang.zhao@woqutech.com
 * @date 2019-04-27 16:29
 */

public class Employee extends Party {

    private String id;
    private int annualCost;

    public Employee(String name, String id, int annualCost) {
        super(name);
        this.id = id;
        this.annualCost = annualCost;
    }
    @Override
    public int getAnnualCost() {
        return annualCost;
    }
    public String getId() {
        return id;
    }
}
