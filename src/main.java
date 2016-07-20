
/**
 * Created by jesseluo on 7/20/16.
 */
public class main {
    public static void main(String [] args) {
        Vector v = new Vector(4);
        double[] arr2 = {3.0, 1.0, 2.0, 4.0};
        Vector k = new Vector(arr2);
        double[] arr = {3.0, 5.0, 6.0, 7.0};
        Vector c = new Vector(arr);
        c.add(k);
        System.out.println("norm" + c.norm());
        System.out.println("sq norm" + c.square_norm());
        c.inc_mul(5, k);
        System.out.println("inc mul" + c);
        System.out.println("max" + c.max());
        System.out.println("min" + c.min());
        System.out.println("dot" + c.dot(k));
        c.mul(5);
        System.out.println("mul" + c.toString());
    }
}
