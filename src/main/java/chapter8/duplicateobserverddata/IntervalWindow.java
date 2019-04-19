package chapter8.duplicateobserverddata;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-19 22:08
 */

public class IntervalWindow extends Frame {
    private TextField startField;
    private TextField endField;
    private TextField lengthField;

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
            if (isNotInteger(lengthField.getText())) {
                lengthField.setText("0");
            }
            calculateEnd();
        }

        private void calculateEnd() {
            try {

            }

        }

        private void endFieldFocusLost(FocusEvent e) {
            if (isNotInteger(endField.getText())) {
                endField.setText("0");
            }
            calculateLength();
        }

        private void calculateLength() {

        }

        private void startFieldFocusLost(FocusEvent e) {
            if (isNotInteger(startField.getText())) {
                startField.setText("0");
            }
            calculateLength();
        }
    }

}
