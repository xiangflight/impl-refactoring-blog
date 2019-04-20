package chapter8.duplicateobserverddata;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-19 22:08
 */

public class IntervalWindow extends Frame implements Observer {
    private static final String INTEGER_REGEX = "[0-9]*";

    private Interval subject;
    private TextField startField;
    private TextField endField;
    private TextField lengthField;

    IntervalWindow() {
        subject = new Interval();
        subject.addObserver(this);
        update(subject, null);
    }

    public void update(Observable o, Object arg) {
        endField.setText(subject.getEnd());
        startField.setText(subject.getStart());
        lengthField.setText(subject.getLength());
    }

    String getLength() {
        return subject.getLength();
    }

    void setLength(String text) {
        subject.setLength(text);
    }

    String getStart() {
        return subject.getStart();
    }

    void setStart(String text) {
        subject.setStart(text);
    }

    String getEnd() {
        return subject.getEnd();
    }

    void setEnd(String text) {
        subject.setEnd(text);
    }

    class SymFocus extends FocusAdapter {
        @Override
        public void focusLost(FocusEvent e) {
            Object object = e.getSource();
            if (object == startField) {
                startFieldFocusLost(e);
            } else if (object == endField) {
                endFieldFocusLost(e);
            } else if (object == lengthField) {
                lengthFieldFocusLost(e);
            }
        }

        private void lengthFieldFocusLost(FocusEvent e) {
            setLength(lengthField.getText());
            if (isNotInteger(getLength())) {
                setLength("0");
            }
            subject.calculateEnd();
        }

        private void endFieldFocusLost(FocusEvent e) {
            setEnd(endField.getText());
            if (isNotInteger(getEnd())) {
                setEnd("0");
            }
            subject.calculateLength();
        }

        private boolean isNotInteger(String text) {
            Pattern pattern = Pattern.compile(INTEGER_REGEX);
            Matcher isNum = pattern.matcher(text);
            return isNum.matches();
        }

        private void startFieldFocusLost(FocusEvent e) {
            setStart(startField.getText());
            if (isNotInteger(getStart())) {
                setStart("0");
            }
            subject.calculateLength();
        }
    }
}
