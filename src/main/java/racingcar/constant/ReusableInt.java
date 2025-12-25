package racingcar.constant;

public enum ReusableInt {
    CAR_NAME_LENGTH(5);

    private final int intValue;

    ReusableInt(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }
}
