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

        String expected = """
                hello world!
                "h" - 1
                "e" - 1
                "l" - 3
                "o" - 2
                " " - 1
                "w" - 1
                "r" - 1
                "d" - 1
                "!" - 1
                """;

        assertEquals(expected, output.toString());
    }
}