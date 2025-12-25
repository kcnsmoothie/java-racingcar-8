package racingcar.constant;

public enum ReusableString {
    DELIMETER(",");

    private final String stringValue;

    ReusableString(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
