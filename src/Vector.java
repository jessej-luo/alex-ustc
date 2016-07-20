import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jesse luo on 7/20/16.
 */
public class Vector {

    private double[] vector;
    private int size;

    //Constructor for vector
    public Vector(int size) {
        this.vector = new double[size];
        this.size = size;
    }

    public Vector (double[] vector) {
        this.vector = vector;
    }

    //Set all vectors to same VALUE
    public void fill(double value) {
        for (int i=0; i < this.vector.length; i++) {
            this.vector[i] = value;
        }
    }

    //Returns value at index I
    public double get(int i) {
        return this.vector[i];
    }

    //Sets value at index I to VALUE
    public void set(int i, double value) {
        this.vector[i] = value;
    }

    //Adds this VECTOR to vector V
    public void add(Vector v) {
        for (int i = 0; i < this.vector.length; i++) {
            this.set(i, this.get(i) + v.get(i));
        }
    }

    //Subtracts vector V from this VECTOR
    public void sub(Vector v) {
        for (int i = 0; i < this.vector.length; i++) {
            this.set(i, this.get(i) - v.get(i));
        }
    }

    //Multiplies this VECTOR by K
    public void mul(int k) {
        for (int i = 0; i < this.vector.length; i++) {
            this.set(i, this.get(i) * k);
        }
    }

    //Add to this VECTOR by vector V times K
    public void inc_mul(int k, Vector v) {
        v.mul(k);
        System.out.println(v);
        this.add(v);
    }

    //Return dot product of this VECTOR and vector V
    public double dot(Vector v) {
        double dot = 0.0;
        for (int i = 0; i < this.vector.length; i++) {
            dot += this.get(i) * v.get(i);
        }
        return dot;
    }

    //Returns the squared norm of this VECTOR
    public double square_norm() {
        double sum = 0.0;
        for (int i = 0; i < this.vector.length; i++) {
            sum += this.get(i) * this.get(i);
        }
        return sum;
    }


    //Returns norm of this VECTOR
    public double norm() {
        return Math.sqrt(square_norm());
    }

    //Returns sum of all values of this VECTOR
    public double sum() {
        KahanSum sum = new KahanSum();
        for (int i = 0; i < this.vector.length; i++) {
            sum.add(this.get(i));
        }
        return sum.get_sum();
    }

    //Returns the minimum of all the values of this VECTOR
    public double min() {
        double minimum = this.get(0);
        for (int i = 1; i < this.vector.length; i += 1) {
            if (this.get(i) < minimum) {
                minimum = this.get(i);
            }
        }
        return minimum;
    }

    //Returns the maximum of all the values of this VECTOR
    public double max() {
        double maximum = this.get(0);
        for (int i = 1; i < this.vector.length; i += 1) {
            if (this.get(i) > maximum) {
                maximum = this.get(i);
            }
        }
        return maximum;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[ ");
        for (int i = 0; i < this.vector.length; i++) {
            s.append(this.get(i) + " ");
        }
        s.append("]");
        return s.toString();
    }
}
