package chapter11.extractsuperclass;

/**
 * @author xiang.zhao@woqutech.com
 * @date 2019-04-27 16:31
 */

public abstract class Party {
    private String name;

    protected Party(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public int getAnnualCost();
}
