package kirill.golubenko.necrecker.practic21.ModifiedVectors;

import kirill.golubenko.necrecker.practic21.Vectors.Vectors;

import java.io.*;
import java.util.Vector;

public class ModifiedVectors extends Vectors {

    void outputVector(Vector v, OutputStream out) throws IOException {
        ObjectOutputStream out2 = new ObjectOutputStream(out);
        out2.writeInt(v.size());
        for (int i = 0; i < v.size(); i++) {
            out2.writeDouble(12);
        }
    }

    Vector inputVector(InputStream in) throws IOException {
        Vector res = new Vector();
        int data = in.read();
        while (data != -1) {
            res.addElement(data);
            data = in.read();
        }
        return res;
    }

    void writeVector(Vector v, Writer out) throws IOException {
        out.write(v.size());
        out.write(' ');
        for (int i = 0; i < v.size(); i++) {
            out.write(String.valueOf(v.get(i)));
            out.write(' ');
        }
    }

    Vector readVector(Reader in) throws IOException {
        Vector res = new Vector();
        StreamTokenizer tk = new StreamTokenizer(in);
        while ((tk.nextToken()) != StreamTokenizer.TT_EOF) {
            res.addElement(tk.nval);
        }
        return res;
    }
}
