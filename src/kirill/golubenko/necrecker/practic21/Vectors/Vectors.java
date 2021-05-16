package kirill.golubenko.necrecker.practic21.Vectors;

import java.util.Arrays;

public class Vectors {

    private double[] mas;

    public void set(double... elements) {
        mas = new double[elements.length];
        mas = elements;
    }

    public double[] get() {
        return mas;
    }

    public Vectors clone() {
        Vectors res = new Vectors();
        res.set(mas.clone());
        return res;
    }

    public int getSize() {
        return mas.length;
    }

    public void set(int index, double value) {
        if (index < 0) {
            return;
        }
        else if (index < mas.length) {
            mas[index] = value;
        } else {
            mas = Arrays.copyOf(mas, index + 1);
            mas[index] = value;
        }
    }

    public double get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= mas.length)
            throw new ArrayIndexOutOfBoundsException();
        return mas[index];
    }

    public double getMax() {
        double max = mas[0];
        for (double value : mas) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double getMin() {
        double min = mas[0];
        for (double value : mas) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public void sortAscending() {
        Arrays.sort(mas);
    }

    public void mult(double factor) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] *= factor;
        }
    }

    public Vectors sum(Vectors anotherVector) {
        int size = Math.min(mas.length, anotherVector.getSize());
        for (int i = 0; i < size; i++){
            mas[i] += anotherVector.get(i);
        }
        return this;
    }

    public double scalarMult(Vectors anotherVector) {
        int size = Math.min(mas.length, anotherVector.getSize());
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += mas[i] * anotherVector.get(i);
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < mas.length; i++) {
            s.append(mas[i]);
            s.append(' ');
        }
        return s.toString();
    }

    public double getNorm() {
        return Math.sqrt(scalarMult(this));
    }
}

