package chapter8.changereferencetovalue;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-19 21:45
 */

public class Currency {
    private String code;

    public Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Currency)) {
            return false;
        }
        Currency other = (Currency) obj;
        return this.code.equals(other.code);
    }

    @Override
    public int hashCode() {
        return this.code.hashCode();
    }
}
