package racingcar.constant;

public enum ErrorMessage {
    CAR_NAME_LENGTH_ERROR("자동차 이름은 5자 이하여야 합니다.");

    private final static String ANNOTATE_ERROR = "[ERROR] ";
    private final String errorMessage;

    ErrorMessage(String inputMessage) {
        this.errorMessage = inputMessage;
    }

    public String getErrorMessage() {
        return ANNOTATE_ERROR + errorMessage;
    }
}
