package chapter7.inlineclass;

import chapter7.extractclass.TelephoneNumber;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-16 21:52
 */

public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;
    private TelephoneNumber telephoneNumber = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return "(" + officeAreaCode + ") " + officeNumber;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
