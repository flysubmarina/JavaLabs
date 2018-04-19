package ua.nure.fokin.task1;

public class Test {
    private static boolean isLucky(int num){
        int f = num % 10;
        int s = (num / 10) % 10;
        int t = (num / 100) % 10;
        int l = (num / 1000) % 10;
        int fiv = (num / 10000) % 10;
        int six = (num / 100000) % 10;
        if(f + s + t == l + fiv + six) return true;
        return false;
    }
    public static int run(String[] args) {
        int count = 0;
        for (int i = 100000; i <1000000 ; i++) {
            if(isLucky(i)) count++;
        }
        return  count;
    }
}
