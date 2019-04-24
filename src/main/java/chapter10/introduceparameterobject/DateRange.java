package chapter10.introduceparameterobject;

import java.util.Date;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-24 13:40
 */

class DateRange {
    private final Date start;
    private final Date end;

    DateRange(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    private Date getStart() {
        return start;
    }

    private Date getEnd() {
        return end;
    }

    boolean includes(Date date) {
        return  (date.equals(getStart()) || date.equals(getEnd())
                || (date.after(getStart()) && date.before(getEnd())));
    }
}
