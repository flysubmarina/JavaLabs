package ua.nure.fokin.task1;

import java.util.Arrays;

public class StdOutPrinter implements Printer {
    int hello;

    public void print(Object obj) {
        if (!(obj instanceof Object[])) {
            if (obj instanceof Integer) {
                System.out.print(obj);
            }
            if (obj instanceof String) {
                System.out.println(obj);
            }
            if (obj instanceof int[]) {

                for (int i : (int[]) obj) {
                    System.out.print(i + " ");
                }
                System.out.println("");
            }
            if (obj instanceof char[]) {
                for (char c : (char[]) obj) {
                    System.out.print(c + " ");
                }
                System.out.println("");
            }

        } else {
            if (obj instanceof char[][]) {
                for (char[] c : (char[][]) obj) {
                    for (char e : (char[]) c) {
                        System.out.print(e + " ");
                    }
                    System.out.print('\n');
                }
            } else if (obj instanceof String[][]) {
                for (String[] c : (String[][]) obj) {
                    for (String e : c) {
                        System.out.print(e + " ");
                    }
                    System.out.print('\n');
                }
            } else if (obj instanceof int[][][][][]) {
                for (int[][][][] f : (int[][][][][]) obj) {
                    for (int[][][] s : f) {
                        for (int[][] t : s) {
                            for (int[] val : t) {
                                for (int rval : val) {
                                    System.out.print(rval + " ");
                                }
                            }
                        }
                    }
                }
            } else
                System.out.println(Arrays.asList((Object[]) obj));
        }
    }

    public void print07(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                this.print(i);
            }
        }
    }
}

