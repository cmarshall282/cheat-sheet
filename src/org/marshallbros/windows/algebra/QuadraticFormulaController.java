package org.marshallbros.windows.algebra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.marshallbros.cheatsheet.Algebra;
import org.marshallbros.windows.SceneSwitcher;

import javax.swing.*;
import java.io.IOException;

public class QuadraticFormulaController {
    @FXML
    TextField aField;

    @FXML
    TextField bField;

    @FXML
    TextField cField;

    @FXML
    Button goButton;

    @FXML
    Button backButton;

    public void goButtonPressed(ActionEvent event) {
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

    public void backButtonPressed(ActionEvent event) throws IOException {
        new SceneSwitcher("algebra/AlgebraMenu.fxml", event);
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
