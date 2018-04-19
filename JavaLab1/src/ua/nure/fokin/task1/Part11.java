package ua.nure.fokin.task1;

public class Part11 {
    private static int getSum(String s){
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                res+= Character.getNumericValue(s.charAt(i));
            }
        }
        return res;
    }
    public static int run(String[] args) {
        int result = 0;
        for (int i = 1; i < args.length; i++) {
            result += getSum(args[i]);
        }
        return result;
    }
}
