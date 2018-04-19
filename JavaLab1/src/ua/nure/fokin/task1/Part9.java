package ua.nure.fokin.task1;

public class Part9 {
    public static int[][][][][] run(String[] args) {
        int[][][][][] arr = new int[2][2][2][2][2];
        arr[0][0][0][0][0] = 1;
        for (int i = 0; i < 31; i++) {
            int val = i + 1;
            int first = val % 2;
            int second = (val >> 1) % 2;
            int third = (val >> 2) % 2;
            int fourth = (val >> 3) % 2;
            int fifth = (val >> 4) % 2;
            arr[fifth][fourth][third][second][first] = ++val;
        }
        return arr;
    }
}
