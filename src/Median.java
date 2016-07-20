import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jesseluo on 7/19/16.
 */
public class Median {

    private ArrayList<Double> median_arr;
    private int DEFAULT_SIZE = 10;

    public Median() {
        this.median_arr = new ArrayList<Double>();
    }

    public void reset() {
        this.median_arr = new ArrayList<Double>();
    }

    public void add(double value) {
        this.median_arr.add(value);
    }

    public double get_median() {
        double median;
        Collections.sort(this.median_arr);
        int length = this.median_arr.size();
        if (length % 2 == 1) {
            median = this.median_arr.get(length/2);
            return median;
        }
        median = this.median_arr.get(length/2) + this.median_arr.get(length/2 + 1);
        return 0.5 * median;
    }
}
