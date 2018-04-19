package ua.nure.fokin.task1;

public class Part2 {
    public static int run(String[] args) {
        int x = Integer.parseInt(args[0]);
        int sum = 0;

        while (x != 0) {
            int d = x % 10;
            sum += d;
            x /= 10;
        }
        return sum;
    }
}
