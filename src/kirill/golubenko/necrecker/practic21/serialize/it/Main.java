package kirill.golubenko.necrecker.practic21.serialize.it;

import java.io.*;

public class Main {
    public static void main(String[] argv) throws IOException, ClassNotFoundException {
        double[] l = {1, 2, 3, 4, 5};
        SerializedArrayVector k = new SerializedArrayVector();
        k.set(l);
        System.out.println("Original ArrayVector: ");
        System.out.println(k.toString());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("arrayVector.out"));
        objectOutputStream.writeObject(k);

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("arrayVector.out"));
        SerializedArrayVector restoredK = (SerializedArrayVector)
                objectInputStream.readObject();
        System.out.println("Restored ArrayVector: ");
        System.out.println(k.toString());
    }
}