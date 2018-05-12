package org.marshallbros.windows;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.marshallbros.cheatsheet.Algebra;

import javax.swing.*;

public class QuadraticFormulaController {
    @FXML
    TextField aField;

    @FXML
    TextField bField;

    @FXML
    TextField cField;

    @FXML
    Button goButton;

    public void buttonPressed(ActionEvent event) {
        String aString = aField.getText();
        String bString = bField.getText();
        String cString = cField.getText();

        double a = parseData(aString, "a");
        double b = parseData(bString, "b");
        double c = parseData(cString, "c");

        double[] answers = Algebra.quadraticFormula(a, b, c);
        String output = answers[0] + " and " + answers[1];

        JOptionPane.showMessageDialog(null, "Your roots are: " + output);
    }

    private double parseData(String data, String field) {
        double i;
        while(true) {
            try {
                i = Double.parseDouble(data);
                break;
            } catch(NumberFormatException e) {
                data = JOptionPane.showInputDialog("Please enter a valid number for " + field + ": ");
            }
        }
        return i;
    }
}
