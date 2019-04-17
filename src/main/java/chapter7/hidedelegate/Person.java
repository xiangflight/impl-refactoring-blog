package chapter7.hidedelegate;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-17 22:06
 */

class Person {
    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        return department.getManager();
    }
}
