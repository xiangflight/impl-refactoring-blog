package chapter6.splittemporaryvariable;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-14 17:28
 */

public class SplitTemporaryVariableSummary {

    private double height;

    private double width;

    void splitTemporaryVariableSummary() {
        final double perimeter = 2 * (height + width);
        System.out.println(perimeter);
        final double area = height * width;
        System.out.println(area);
    }

}
