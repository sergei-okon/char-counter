package ua.com.foxminded.counter;

import ua.com.foxminded.counter.math.Counter;
import ua.com.foxminded.counter.model.Result;
import ua.com.foxminded.counter.text.Formatter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stringArgs = "";
        System.out.print("Input string: ");

        if (in.hasNextLine()) {
            stringArgs = in.nextLine();
        }

        if (stringArgs.equals("/exit")) {
            System.out.print("You entered \"/exit\". Application terminated\n");
            System.out.println("=================================================================================");
            System.exit(0);
        }

        Counter counter = new Counter();
        Result result = counter.countUniqueSymbols(stringArgs);

        Formatter formatter = new Formatter();
        StringBuilder output = formatter.format(result);

        System.out.print(output.toString());
    }
}



