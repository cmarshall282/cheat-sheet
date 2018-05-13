package org.marshallbros.windows;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javax.swing.*;
import java.io.IOException;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.marshallbros.cheatsheet.Algebra;
import org.marshallbros.cheatsheet.Point;

public class DistanceFormulaController {
    @FXML
    private TextField firstX;

    @FXML
    TextField firstY;

    @FXML
    TextField secondX;

    @FXML
    TextField secondY;

    @FXML
    Button goButton;

    @FXML
    Button backButton;

    public void goButtonPressed(ActionEvent event) {
        String firstXString = firstX.getText();
        String firstYString = firstY.getText();
        String secondXString = secondX.getText();
        String secondYString = secondY.getText();

        Point point1 = new Point();
        Point point2 = new Point();

        point1.x = parseData(firstXString, "first x");
        point1.y = parseData(firstYString, "first y");
        point2.x = parseData(secondXString, "second x");
        point2.y = parseData(secondYString, "second y");

        double distance = Algebra.distanceFormula(point1, point2);

        JOptionPane.showMessageDialog(null,"The distance between your points is " + distance + ".");
    }

    public void backButtonPressed(ActionEvent event) throws IOException {
        new SceneSwitcher("AlgebraMenu.fxml", event);

    }

    private double parseData(String data, String field) {
        double i;

        while(true) {
            try {
                i = Double.parseDouble(data);
                break;
            } catch(NumberFormatException e) {
                data = JOptionPane.showInputDialog("Enter a value for the " + field + ":");
            }
        }

        return i;
    }
}
