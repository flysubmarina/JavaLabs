package ua.nure.fokin.task1;

public class Demo {
    public static void main(String[] args) {
        MyPrinter p = new MyPrinter(new StdOutPrinter());
        p.print("Hello World!");
        int partNum = 0;
        if (args.length > 0) {
            partNum = Integer.parseInt(args[0]);
        } else
            p.print("No Parametrs");
        Object x;
        switch (partNum) {
            case 1:
                x = Part1.run(new String[]{args[1], args[2]});
                p.print(x);
                break;
            case 2:
                x = Part2.run(new String[]{args[1]});
                p.print(x);
                break;
            case 3:
                x = Part3.run(new String[]{args[1]});
                p.print(x);
                break;
            case 4:
                x = Part4.Run(new String[]{args[1]});
                p.print(x);
                break;
            case 5:
                x = Part5.run(new String[]{args[1]});
                p.print(x);
                break;
            case 6:
                x = Part6.run(new String[]{args[1]});
                p.print(x);
                break;
            case 7:
                int[] y = Part7.run(new String[]{args[1]});
                p.print07(y);
                break;
            case 8:
                x = Part8.run(new String[]{args[1], args[2]});
                p.print(x);
                break;
            case 9:
                x = Part9.run(new String[]{args[1]});
                p.print(x);
                break;
            case 10:
                x = Part10.run(new String[]{args[1]});
                p.print(x);
                break;
            case 11:
                x = Part11.run(args);
                p.print(x);
                break;
            case 12:
                x = Part12.run(args);
                p.print(x);
                break;
            case 20:
                x = Test.run(new String[]{args[1]});
                p.print(x);
                break;

            default:
                p.print("You havent choosen any part!!!");
                break;
        }


    }
}
