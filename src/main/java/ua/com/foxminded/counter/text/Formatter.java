package ua.com.foxminded.counter.text;

import ua.com.foxminded.counter.model.Result;

import java.util.ArrayList;
import java.util.List;

public class Formatter {

    public StringBuilder format(Result result) {
        StringBuilder output;
        output = new StringBuilder(result.getStringArgs() + "\n");

        List<String> outputTemp = new ArrayList<>();

        String temp;

        for (int i = 0; i < result.getListSymbolsFromArgs().size(); i++) {

            temp = "\"" + result.getListSymbolsFromArgs().get(i) + "\"" + " - " +
                    result.getCountUniqueSymbols().get(result.getListSymbolsFromArgs().get(i)) + "\n";

            if (!outputTemp.contains(temp))
                outputTemp.add(temp);
        }

        for (String string : outputTemp) {
            output.append(string);
        }

        return output;
    }
}
