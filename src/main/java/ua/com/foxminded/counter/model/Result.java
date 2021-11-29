package ua.com.foxminded.counter.model;

import java.util.List;
import java.util.Map;

public class Result {
    private String stringArgs;
    private Map<String, Integer> countUniqueSymbols;
    private List<String> ListSymbolsFromArgs;

    public Result() {
    }

    public Result(String stringArgs, Map<String, Integer> countUniqueSymbols, List<String> listSymbolsFromArgs) {
        this.stringArgs = stringArgs;
        this.countUniqueSymbols = countUniqueSymbols;
        ListSymbolsFromArgs = listSymbolsFromArgs;
    }

    public String getStringArgs() {
        return stringArgs;
    }

    public void setStringArgs(String stringArgs) {
        this.stringArgs = stringArgs;
    }

    public Map<String, Integer> getCountUniqueSymbols() {
        return countUniqueSymbols;
    }

    public void setCountUniqueSymbols(Map<String, Integer> countUniqueSymbols) {
        this.countUniqueSymbols = countUniqueSymbols;
    }

    public List<String> getListSymbolsFromArgs() {
        return ListSymbolsFromArgs;
    }

    public void setListSymbolsFromArgs(List<String> listSymbolsFromArgs) {
        ListSymbolsFromArgs = listSymbolsFromArgs;
    }

    @Override
    public String toString() {
        return "Result{" +
                "stringArgs='" + stringArgs + '\'' +
                ", countUniqueCharacters=" + countUniqueSymbols +
                ", ListSymbolsFromArgs=" + ListSymbolsFromArgs +
                '}';
    }
}
