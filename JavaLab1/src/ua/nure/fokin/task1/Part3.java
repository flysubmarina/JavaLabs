package ua.nure.fokin.task1;

public class Part3 {
    public static boolean run(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x < 2) return false;
        double s = Math.sqrt(x);
        for (int i = 2; i <= s; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
