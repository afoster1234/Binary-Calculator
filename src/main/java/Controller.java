import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class Controller extends MainMenu {
    //calculator
    @FXML Label calculator;
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
    String value1;
    String value2;
    String operator = "";

    public void zero(ActionEvent actionEvent) {
        calculator.setText(calculator.getText() + "0");
    }

    public void clear(ActionEvent actionEvent) {
        calculator.setText("");
        value1 = "";
        value2 = "";
        numberFormat = "binary";
        operator = "";
    }

    public void one(ActionEvent actionEvent) {
        calculator.setText(calculator.getText() + "1");
    }

    public void addition(ActionEvent actionEvent) {
        value1 = calculator.getText();
        operator = "addition";
        calculator.setText("");
    }

    public void subtraction(ActionEvent actionEvent) {
        value1 = calculator.getText();
        operator = "subtraction";
        calculator.setText("");
    }

    public void squareRoot(ActionEvent actionEvent) {
        arithmetic.squareroot(calculator.getText());
    }

    public void squared(ActionEvent actionEvent) {
        arithmetic.square(calculator.getText());
    }

    public void multiplication(ActionEvent actionEvent) {
        value1 = calculator.getText();
        operator = "multiplication";
        calculator.setText("");
    }

    public void division(ActionEvent actionEvent) {
        value1 = calculator.getText();
        operator = "division";
        calculator.setText("");
    }

    public void equals(ActionEvent actionEvent) throws Exception {
        if (value1.equals("")) {
            return;
        }
        value2 = calculator.getText();
        switch (operator) {
            case "addition":
                calculator.setText(arithmetic.addition(value1, value2));
                break;
            case "subtraction":
                calculator.setText(arithmetic.subtraction(value1, value2));
                break;
            case "multiplication":
                calculator.setText(arithmetic.multiplication(value1, value2));
                break;
            case "division":
                calculator.setText(arithmetic.division(value1, value2));
                break;
            default:
                throw new Exception();
        }

    }

    public void Toggle(ActionEvent actionEvent) {
        if (numberFormat.equals("decimal")) {
            Convertor.toBinary(Integer.parseInt(calculator.getText()));
            numberFormat = "binary";
        }
        else if(numberFormat.equals("binary")){
            Convertor.toDecimal(calculator.getText());
            numberFormat = "decimal";
        }
    }
}

