package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private final View view;
    private final Model model;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;

        this.view.additionListener(new AdditionListener());
        this.view.subtractListener(new SubtractListener());
    }

    // Refactor by extracting to another class.
    class AdditionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                int firstNumber = view.getInputOne();
                int secondNumber = view.getInputTwo();

                model.addition(firstNumber, secondNumber);
                view.setResult(model.getValue());
            }
            catch (NumberFormatException error) {
                view.displayErrorMessage("You need to enter 2 integers.");
            }
        }
    }

    class SubtractListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                int firstNumber = view.getInputOne();
                int secondNumber = view.getInputTwo();

                model.subtraction(firstNumber, secondNumber);
                view.setResult(model.getValue());
            }
            catch (NumberFormatException error) {
                view.displayErrorMessage("You need to enter 2 integers.");
            }
        }
    }
}
