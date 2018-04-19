package ua.nure.fokin.task1;

public class Part1 {
    public static int run(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        while (x != y) {
            if (x > y) {
                int tmp = x;
                x = y;
                y = tmp;
            }
            y = y - x;
        }
        return x;
    }
}
