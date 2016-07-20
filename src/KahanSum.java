
/**
 * Created by jesseluo on 7/19/16.
 */
public class KahanSum {

    private double sum;
    private double error;

    public KahanSum() {
        this.sum = 0.0;
        this.error = 0.0;
    }

    //reset the sum to 0
    public void reset() {
        this.sum = 0.0;
        this.error = 0.0;
    }

    //add one value to the sum
    public void add(double value) {
        double compensated_value = value - this.error;
        double added = this.sum + compensated_value;
        this.error = (added - this.sum) - compensated_value;
        this.sum = added;
    }

    //return the current value of the sum
    public double get_sum() {
        return this.sum;
    }
}
