package racingcar.constant;

public enum ReusableConstant {
    DELIMETER(",");

    private final String stringValue;

    ReusableConstant(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
