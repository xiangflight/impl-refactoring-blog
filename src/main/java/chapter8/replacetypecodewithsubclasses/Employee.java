package chapter8.replacetypecodewithsubclasses;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-22 09:10
 */

abstract class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private int type;

    Employee() {
    }

    private Employee(int type) {
        this.type = type;
    }

    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

    /**
     * 获取雇员类型
     *
     * @return 雇员类型
     */
    abstract int getType();
}
