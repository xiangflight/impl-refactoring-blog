package chapter1;

/**
 * 租赁
 *
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-12 23:31
 */

public class Rental {

    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public int getDayRented() {
        return dayRented;
    }

    public Movie getMovie() {
        return movie;
    }
}
