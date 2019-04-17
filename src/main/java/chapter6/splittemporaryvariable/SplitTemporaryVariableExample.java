package chapter6.splittemporaryvariable;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-14 17:28
 */

public class SplitTemporaryVariableExample {

    private double primaryForce = 100.0;
    private double secondaryForce = 200.0;
    private double mass = 88;
    private int delay = 1;

    double getDistanceTravelled(int time) {
        if (time - delay > 0) {
            return secondaryResult(time);
        } else {
            return primaryResult(time);
        }
    }

    private double primaryAcc() {
        return primaryForce / mass;
    }

    private double secondaryAcc() {
        return (primaryForce + secondaryForce) / mass;
    }

    private double primaryResult(int time) {
        return 0.5 * primaryAcc() *
                Math.min(time, delay) * Math.min(time, delay);
    }

    private double secondaryResult(int time) {
        return primaryResult(time) + primaryVel() * (time - delay) +
                0.5 * secondaryAcc() * (time - delay) * (time - delay);
    }

    private double primaryVel() {
        return primaryAcc() * delay;
    }

}
