package ua.com.foxminded.counter.math;

import com.jcabi.aspects.Cacheable;
import ua.com.foxminded.counter.model.Result;

import java.util.*;
import java.util.stream.Collectors;

public class Counter {

    @Cacheable(lifetime = 5)
    public Result countUniqueSymbols(String input) {
        Result result = new Result();
        List<Item> stagesList = createStage(input);

        Map<String, Integer> countUniqueSymbols = new LinkedHashMap<>(
                stagesList.stream().collect(
                        Collectors.groupingBy(
                                Item::getSymbol,
                                Collectors.summingInt(Item::getNumber))));

        result.setStringArgs(input);
        result.setCountUniqueSymbols(countUniqueSymbols);
        result.setListSymbolsFromArgs(createListSymbolsFromArgs(input));

        return result;
    }

    private List<Item> createStage(String input) {
        List<Item> item = new ArrayList<>();

        String[] keyForUniqSymbols = input.split("");

        for (String keyForUniqSymbol : keyForUniqSymbols) {
            item.add(new Item(keyForUniqSymbol, 1));
        }
        return item;
    }

    private List<String> createListSymbolsFromArgs(String input) {

        return new ArrayList<>(Arrays.asList(input.split("")));
    }
}
