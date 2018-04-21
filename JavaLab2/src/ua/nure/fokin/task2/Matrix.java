package ua.nure.fokin.task2;

import java.util.Arrays;

public class Matrix {
    private int rows, cols;
    private double[][] ar;

    public Matrix(double[][] ar) {
        this.ar = ar;
    }

    // сложение с другой матрицей
    public void add(Matrix m) {
        if (m.ar.length != this.ar.length || m.ar[0].length != this.ar[0].length) return;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                ar[i][j] += m.ar[i][j];
            }
        }
    }

    // умножение на число
    public void mul(double x) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                ar[i][j] *= x;
            }
        }
    }

    // умножение на другую матрицу
    public void mul(Matrix m) {
        int currLength = ar.length;
        int mLength = m.ar[0].length;
        int o = m.ar.length;
        double[][] res = new double[currLength][mLength];

        for (int i = 0; i < currLength; i++) {
            for (int j = 0; j < mLength; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += ar[i][k] * m.ar[k][j];
                }
            }
        }
        this.ar = res;
    }

    // транспонирование
    public void transpose() {
        double[][] result = new double[ar[0].length][ar.length];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                result[j][i] = ar[i][j];
            }
        }
        ar = result;
    }

    // печать матрицы на экран (построчно, элементы выводит через пробел)
    public void print() {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix(new double[][]{
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0}
        });

        Matrix m2 = new Matrix(new double[][]{
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0}
        });

        System.out.println("~~~ m");
        m.print();

        System.out.println("~~~ m2");
        m2.print();

        System.out.println("~~~ transpose m");
        m.transpose();
        m.print();

        System.out.println("~~~ mul m on m2");
        m.mul(m2);
        m.print();

        System.out.println("~~~ mul m2 on 2");
        m2.mul(2);
        m2.print();
    }
}
