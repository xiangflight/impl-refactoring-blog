package chapter6.extractmethod;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-13 18:45
 */

public class ExtractMethodSummary {

    private String name;

    void printOwing(double amount) {
        printBanner();
        printDetails(amount);
    }

    private void printDetails(double amount) {
        System.out.println("name:" + name);
        System.out.println("amount" + amount);
    }


    private void printBanner() {

    }

}
