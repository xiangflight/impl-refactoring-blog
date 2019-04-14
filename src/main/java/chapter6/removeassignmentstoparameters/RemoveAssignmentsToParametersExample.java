package chapter6.removeassignmentstoparameters;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-14 20:41
 */

public class RemoveAssignmentsToParametersExample {

    int discount(int inputVal, int quantity, int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) {
            result -= 2;
        }
        if (quantity > 100) {
            result -= 1;
        }
        if (yearToDate > 10000) {
            result -= 4;
        }
        return result;
    }
}
