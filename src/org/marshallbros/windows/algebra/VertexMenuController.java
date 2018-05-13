package org.marshallbros.windows.algebra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.marshallbros.cheatsheet.Algebra;
import org.marshallbros.cheatsheet.Point;
import org.marshallbros.windows.SceneSwitcher;

import javax.swing.*;
import java.io.IOException;

public class VertexMenuController {

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

        Point vertex = Algebra.findQuadraticVertex(a, b, c);
        JOptionPane.showMessageDialog(null, "Your vertex is: (" + vertex.x + ", " + vertex.y + ")");
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
            } catch (NumberFormatException e) {
                data = JOptionPane.showInputDialog("Enter a valid number for " + field + ":");
            }
        }
        return i;
    }
}
