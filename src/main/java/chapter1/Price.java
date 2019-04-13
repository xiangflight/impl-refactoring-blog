package chapter1;

/**
 * 影片类型
 *
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-13 10:53
 */

public abstract class Price {

    /**
     * 获取影片类型
     *
     * @return 影片类型
     */
    abstract int getPriceCode();

    /**
     * 计算租赁影片的总金额
     *
     * @param daysRented 租赁天数
     * @return 总金额
     */
    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}
