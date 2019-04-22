package chapter9.removecontrolflag;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-22 23:27
 */

public class RemoveControlFlag {

    void checkSecurity(String[] people) {
        String found = "";
        for (int i = 0; i < people.length; i++) {
            if ("".equals(found)) {
                if (people[i].equals("Don")) {
                    sendAlert();
                    found = "Don";
                }
                if (people[i].equals("John")) {
                    sendAlert();
                    found = "John";
                }
            }
        }
        someLaterCode(found);
    }

    private void someLaterCode(String found) {

    }

    private void sendAlert() {

    }
}
