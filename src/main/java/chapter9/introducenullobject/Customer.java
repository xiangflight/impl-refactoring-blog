package chapter9.introducenullobject;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-23 20:18
 */

public class Customer implements Nullable {
    private String name;
    private String plan;
    private String paymentHistory;

    protected Customer() {}

    public String getName() {
        return name;
    }

    public String getPaymentHistory() {
        return paymentHistory;
    }

    public String getPlan() {
        return plan;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    static Customer newNull() {
        return new NullCustomer();
    }
}
