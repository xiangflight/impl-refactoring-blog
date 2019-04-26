package chapter8.replacetypecodewithclass;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-20 10:55
 */

public class Person {
    private BloodGroup bloodGroup;

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
