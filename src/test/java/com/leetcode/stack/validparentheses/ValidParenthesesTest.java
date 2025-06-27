package com.leetcode.stack.validparentheses;

import com.leetcode.stack.validparentheses.ValidParentheses;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void isValid(String input, boolean expectedResult) {
        ValidParentheses validParentheses = new ValidParentheses();
        assertEquals(expectedResult, validParentheses.isValid(input));
    }

    static Stream<Object> testCases() {
        return Stream.of(
                 new Object[]{"()", true },
                 new Object[]{"()[]{}", true },
                 new Object[]{"(]", false },
                 new Object[]{"([])", true }
        );
    }
}
