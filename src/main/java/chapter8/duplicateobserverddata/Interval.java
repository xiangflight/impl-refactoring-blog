package chapter8.duplicateobserverddata;

import java.util.Observable;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-20 09:35
 */

class Interval extends Observable {
    private String end = "0";
    private String start = "0";
    private String length = "0";

    String getStart() {
        return start;
    }

    void setStart(String start) {
        this.start = start;
        setChanged();
        notifyObservers();
    }

    String getLength() {
        return length;
    }

    void setLength(String length) {
        this.length = length;
        setChanged();
        notifyObservers();
    }

    String getEnd() {
        return end;
    }

    void setEnd(String end) {
        this.end = end;
        setChanged();
        notifyObservers();
    }

    void calculateEnd() {
        try {
            int start = Integer.parseInt(getStart());
            int length = Integer.parseInt(getLength());
            int end = start + length;
            setEnd(String.valueOf(end));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Unexpected Number Format Error");
        }

    }

    void calculateLength() {
        try {
            int start = Integer.parseInt(getStart());
            int end = Integer.parseInt(getEnd());
            int length = end - start;
            setLength(String.valueOf(length));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Unexpected Number Format Error");
        }
    }
}
