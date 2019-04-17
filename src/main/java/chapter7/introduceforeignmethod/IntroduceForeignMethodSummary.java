package chapter7.introduceforeignmethod;

import java.util.Date;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-17 22:20
 */

public class IntroduceForeignMethodSummary {

    public static void main(String[] args) {
        Date previousEnd = new Date();
        Date newStart = nextDay(previousEnd);

    }

    private static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }



}
