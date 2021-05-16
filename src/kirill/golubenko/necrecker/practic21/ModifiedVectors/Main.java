package kirill.golubenko.necrecker.practic21.ModifiedVectors;

import kirill.golubenko.necrecker.practic21.Vectors.Vectors;

import java.io.IOException;
import java.util.Vector;

public class Main {
    public static void main(String[] argv) {
        double[] l = {1, 2, 3, 4, 5};
        ModifiedVectors k = new ModifiedVectors();
        k.set(l);
        Vector vec = new Vector();
        for (double f : l)
            vec.addElement(f);
        try {
            k.outputVector(vec, System.out);
        }
        catch (IOException e) {
            System.out.println("Something went wrong...");
        }

    }
}
