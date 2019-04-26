package chapter10.replaceexceptionwithtest;

/**
 * @author xiang.zhao@woqutech.com
 * @date 2019-04-26 21:48
 */

public class Assert {

    static void shouldNeverReachHere(String message) {
        throw new RuntimeException(message);
    }

}
