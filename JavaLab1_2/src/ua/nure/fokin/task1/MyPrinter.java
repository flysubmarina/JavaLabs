package ua.nure.fokin.task1;

public class MyPrinter {
    private Printer currentPrinter;

    public MyPrinter(Printer p) {
        currentPrinter = p;
    }

    public void print(Object msg) {
        currentPrinter.print(msg);
    }

    public void print07(int[] arr) {
        currentPrinter.print07(arr);
    }
}
