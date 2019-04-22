package chapter8.replacesubclasswithfields;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-22 21:01
 */

class Person {
    private final boolean isMale;
    private final char code;

    protected Person(boolean isMale, char code) {
        this.isMale = isMale;
        this.code = code;
    }

    static Person createMale() {
        return new Person(true, 'M');
    }

    static Person createFemale() {
        return new Person(false, 'F');
    }

    boolean isMale() {
        return isMale;
    }

    char getCode() {
        return code;
    }
}
