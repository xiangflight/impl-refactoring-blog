package chapter9.introducenullobject;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-23 20:21
 */

public class NullCustomer extends Customer {

    @Override
    public boolean isNull() {
        return true;
    }

}
