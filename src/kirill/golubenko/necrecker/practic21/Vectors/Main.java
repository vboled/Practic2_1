package kirill.golubenko.necrecker.practic21.Vectors;

public class Main {

    public static void main(String[] argv) {
        double[] l = {1, 2, 3, 4, 5};
        double[] l1 = {4, 6, 8, 10, 12};
        Vectors k = new Vectors();
        Vectors k1 = new Vectors();

        System.out.println("First Vectors: ");
        k.set(l);
        System.out.println(k.toString());

        System.out.println("Second Vectors: ");
        k1.set(l1);
        System.out.println(k1.toString());

        System.out.println("First Vectors * 2: ");
        k.mult(2);
        System.out.println(k.toString());

        System.out.println("Second Vectors * (-2): ");
        k1.mult(-2);
        System.out.println(k1.toString());

        System.out.println("Second Vectors * First Vectors: ");
        System.out.println(k1.scalarMult(k1));
    }
}
