package calculator;

public class Model {
    private int value;

    public void addition(int firstNumber, int secondNumber) {
        value = firstNumber + secondNumber;
    }

    public void subtraction(int firstNumber, int secondNumber) {
        value = firstNumber - secondNumber;
    }

    public int getValue() {
        return value;
    }
}
