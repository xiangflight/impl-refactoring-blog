package chapter7.extractclass;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-16 21:52
 */

public class Person {
    private String name;
    private TelephoneNumber telephoneNumber = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }
}
