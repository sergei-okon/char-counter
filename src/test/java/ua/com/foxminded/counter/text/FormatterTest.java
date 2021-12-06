package ua.com.foxminded.counter.text;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.com.foxminded.counter.math.Counter;
import ua.com.foxminded.counter.model.Result;

import static org.junit.jupiter.api.Assertions.*;

class FormatterTest {
    Counter counter;
    Formatter formatter;

    @BeforeEach
    void setUp() {
        counter = new Counter();
        formatter = new Formatter();
    }

    @Test
    void format_shouldSuccess_whenArgsTwoWord() {
        Result result = counter.countUniqueSymbols("hello world!");
        StringBuilder output = formatter.format(result);

        String expected = "hello world!\n" +
                "\"h\"" + " - " + "1\n" +
                "\"e\"" + " - " + "1\n" +
                "\"l\"" + " - " + "3\n" +
                "\"o\"" + " - " + "2\n" +
                "\" \"" + " - " + "1\n" +
                "\"w\"" + " - " + "1\n" +
                "\"r\"" + " - " + "1\n" +
                "\"d\"" + " - " + "1\n" +
                "\"!\"" + " - " + "1\n";

        assertEquals(expected, output.toString());
    }
}