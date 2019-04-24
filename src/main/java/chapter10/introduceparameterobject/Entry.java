package chapter10.introduceparameterobject;

import java.util.Date;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-24 09:36
 */

public class Entry {
    private double value;
    private Date chargeDate;

    Entry(double value, Date chargeDate) {
        this.value = value;
        this.chargeDate = chargeDate;
    }

    double getValue() {
        return value;
    }

    public Date getDate() {
        return chargeDate;
    }
}
