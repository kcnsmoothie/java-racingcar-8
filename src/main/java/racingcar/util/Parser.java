package racingcar.util;

import static racingcar.constant.ReusableString.DELIMETER;

import java.util.Arrays;
import java.util.List;


public class Parser {
    public static List<String> parseByDelimeter(String string) {
        String[] stringArray = string.split(DELIMETER.getStringValue());

        List<String> stringList = Arrays.stream(stringArray)
                .map(String::trim)
                .toList();

        return stringList;
    }
}
