package org.marshallbros.windows.geometry;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import org.marshallbros.windows.SceneSwitcher;

import java.io.IOException;

public class Shapes2DController {
    private ObservableList<String> choice2DList = FXCollections.observableArrayList("None", "Regular Polygon", "Rectangle", "Trapezoid", "Triangle", "Circle");

    @FXML
    private ChoiceBox choice2D;

    @FXML
    private Button goButton;

    @FXML
    private  Button backButton;

    @FXML
    private void initialize() {
        choice2D.setItems(choice2DList);
        choice2D.setValue("None");
    }

    public void goButtonPressed(ActionEvent event) throws IOException {
        String choice = (String)choice2D.getValue();
        String selectedFile = getSceneName(choice);

        new SceneSwitcher(selectedFile, event);
    }

    public void backButtonPressed(ActionEvent event) throws IOException {
        new SceneSwitcher("geometry/GeometryMenu.fxml", event);

    }

    public String getSceneName(String input) {
        if(input.equals("Regular Polygon")) return "geometry/RegPolygon.fxml";
        if(input.equals("Rectangle")) return "geometry/Rectangle.fxml";
        if(input.equals("Trapezoid")) return "geometry/Trapezoid.fxml";
        if(input.equals("Triangle")) return "geometry/Triangle.fxml";
        if(input.equals("Circle")) return "geometry/Circle.fxml";

        return "No Choice Selected";
    }
}
