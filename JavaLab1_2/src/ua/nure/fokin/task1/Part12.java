package ua.nure.fokin.task1;

public class Part12 {
    private static boolean isLatina(char c){
        return ((c >= 'a')&&(c <= 'z')) || ((c >= 'A')&&(c <= 'Z'));
    }
    private  static String getLatinaWord(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if(isLatina(word.charAt(i))){
                result += word.charAt(i);
            }
        }
        return result;
    }
    public static String run(String[] args) {
        String result = "";
        for (int i = 1; i <args.length ; i++) {
            result +=getLatinaWord(args[i]);
        }
        return result;
    }
}
