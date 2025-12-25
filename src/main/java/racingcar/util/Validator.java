package racingcar.util;

import static racingcar.constant.ErrorMessage.CAR_NAME_LENGTH_ERROR;

public class Validator {
    public static void validateCarNameLength(String inputValue) {
        if (inputValue.length() > 5){
            throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR.getErrorMessage());
        }
    }
}