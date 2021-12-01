package ua.com.foxminded.counter.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.com.foxminded.counter.model.Result;
import ua.com.foxminded.counter.text.Formatter;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CounterTest {
    Counter counter;
    Formatter formatter;

    @BeforeEach
    void setUp() {
        counter = new Counter();
        formatter = new Formatter();
    }

    @Test
    void format_shouldMadeObjectResult_whenArgsIsCorrect() {
        Map<String, Integer> countUniqueCharacters = Map.of(
                " ", 1, "!", 1, "r", 1, "d", 1,
                "e", 1, "w", 1, "h", 1, "l", 3, "o", 2);
        String input = "hello world!";
        List<String> ListSymbolsFromArgs = new ArrayList<>(Arrays.asList(input.split("")));

        Result expected = new Result("hello world!", countUniqueCharacters, ListSymbolsFromArgs);

        Result actual = counter.countUniqueSymbols("hello world!");

        assertEquals(expected.getStringArgs(), actual.getStringArgs());
        assertEquals(expected.getCountUniqueSymbols(), actual.getCountUniqueSymbols());
        assertEquals(expected.getListSymbolsFromArgs(), actual.getListSymbolsFromArgs());
    }
}