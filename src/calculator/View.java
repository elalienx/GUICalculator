package calculator;

import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame {
    private final JTextField inputOne = new JTextField(10);
    private final JButton buttonAddition = new JButton("+");
    private final JButton buttonSubtract = new JButton("-");
    private final JTextField inputTwo = new JTextField(10);
    private final JLabel labelEqualSign = new JLabel("=");
    private final JTextField inputResult = new JTextField(10);

    public View(){
        JPanel panel = new JPanel();

        panel.add(inputOne);
        panel.add(buttonAddition);
        panel.add(buttonSubtract);
        panel.add(inputTwo);
        panel.add(labelEqualSign);
        panel.add(inputResult);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640, 100);
        this.add(panel);
    }

    public int getInputOne(){
        return Integer.parseInt(inputOne.getText());
    }

    public int getInputTwo(){
        return Integer.parseInt(inputTwo.getText());
    }

    public int getResult() {
        return Integer.parseInt(inputResult.getText());
    }

    public void setResult(int result){
        inputResult.setText(Integer.toString(result));
    }

    public void additionListener(ActionListener listener){
        buttonAddition.addActionListener(listener);
    }

    public void subtractListener(ActionListener listener) {
        buttonSubtract.addActionListener(listener);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
