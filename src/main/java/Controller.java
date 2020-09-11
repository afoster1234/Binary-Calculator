import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class Controller extends MainMenu {
    //calculator
    @FXML Label calculator;
    @FXML Pane blocker;
    @FXML Label calculatorDecimal;
    @FXML Button Toggle;
    @FXML Button clear;
    @FXML Button equals;
    @FXML Button zero;
    @FXML Button one;
    //operators
    @FXML Button addition;
    @FXML Button subtraction;
    @FXML Button multiplication;
    @FXML Button division;
    @FXML Button squared;
    @FXML Button squareRoot;

    ArithmeticOperators arithmetic = new ArithmeticOperators();

    String numberFormat = "binary";
    String value1 = "";
    String value2 = "";
    String operator = "";

    public void zero(ActionEvent actionEvent) {
        display(calculator.getText() + "0");
    }

    public void clear(ActionEvent actionEvent) {
        display("");
        value1 = "";
        value2 = "";
        numberFormat = "binary";
        operator = "";
    }

    public void one(ActionEvent actionEvent) {
        display(calculator.getText() + "1");
    }

    public void addition(ActionEvent actionEvent) {
        value1 = calculator.getText();
        operator = "addition";
        display("");
    }

    public void subtraction(ActionEvent actionEvent) {
        value1 = calculator.getText();
        operator = "subtraction";
        display("");
    }

    public void squareRoot(ActionEvent actionEvent) {
        display(arithmetic.squareroot(calculator.getText()));
    }

    public void squared(ActionEvent actionEvent) {
        display(arithmetic.square(calculator.getText()));
    }

    public void multiplication(ActionEvent actionEvent) {
        value1 = calculator.getText();
        operator = "multiplication";
        display("");
    }

    public void division(ActionEvent actionEvent) {
        value1 = calculator.getText();
        operator = "division";
        display("");
    }

    public void equals(ActionEvent actionEvent) throws Exception {
        if (value1.equals("")) {
            return;
        }
        value2 = calculator.getText();
        switch (operator) {
            case "addition":
                display(arithmetic.addition(value1, value2));
                break;
            case "subtraction":
                display(arithmetic.subtraction(value1, value2));
                break;
            case "multiplication":
                display(arithmetic.multiplication(value1, value2));
                break;
            case "division":
                display(arithmetic.division(value1, value2));
                break;
            default:
                throw new Exception();
        }

    }

    public void display(String text){
        calculator.setText(text);
        calculatorDecimal.setText(String.valueOf(Convertor.toDecimal(text)));
    }

    public void Toggle(ActionEvent actionEvent) {
        if (numberFormat.equals("decimal")) {
            calculatorDecimal.setVisible(false);
            numberFormat = "binary";
        }
        else if(numberFormat.equals("binary")){
            calculatorDecimal.setVisible(true);
            numberFormat = "decimal";
        }
    }
}

