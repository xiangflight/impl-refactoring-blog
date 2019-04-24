package chapter10.introduceparameterobject;

import java.util.Date;
import java.util.Vector;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-24 13:35
 */

public class Account {
    private Vector<Entry> entries = new Vector<>();

    double getFlowBetween(DateRange range) {
        double result = 0;
        for (Entry each: entries) {
            if (range.includes(each.getDate())) {
                result += each.getValue();
            }
        }
        return result;
    }
}
