package chapter6.extractmethod;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-13 18:50
 */

public class ExtractMethodExample {

    private Vector<Order> orders = new Vector<Order>();

    private String name;

    void printOwing(double previousAmount) {
        printBanner();
        double outstanding = getOutstanding(previousAmount * 1.2);
        printDetails(outstanding);
    }

    /**
     * 返回局部变量
     *
     * @return 返回在被提炼代码中修改后的局部变量
     */
    private double getOutstanding(double initialValue) {
        double result = initialValue;
        for (Order each: orders) {
            result += each.getAmount();
        }
        return result;
    }

    /**
     *
     * @param outstanding 传入的参数，在源代码段中是只读的
     */
    private void printDetails(double outstanding) {
        System.out.println("name:" + name);
        System.out.println("amount" + outstanding);
    }

    private void printBanner() {
        System.out.println("*************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("*************************");
    }

}
