import java.io.*;
import java.util.ArrayList;


/**
 * Created by jesseluo on 7/20/16.
 */
public class Utils {
    public void write_data(ArrayList<Vector> vectors) {
        try {
            FileWriter file = new FileWriter(new File("vectors.txt"));
            for (Vector v: vectors) {
                for (int i = 0; i < v.getSize(); i += 1) {
                    file.write((char) v.get(i));
                }
                file.write("\n");
            }
            file.close();
        } catch (IOException ex) {
            System.out.println("File not found.");
        }
    }

    public void read_data(String fileName) {
        try {
            FileReader file = new FileReader(new File(fileName));
            
        } catch (FileNotFoundException ex) {

        }

    }

    public void vector_mean() {

    }

    public void vector_median() {

    }
}
