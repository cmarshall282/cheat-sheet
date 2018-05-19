package org.marshallbros.windows.geometry;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import org.marshallbros.windows.SceneSwitcher;

import java.io.IOException;

public class Shapes3DController {

    private ObservableList<String> choice3DList = FXCollections.observableArrayList("None", "Regular N-Gon Prism", "Triangular Prism", "Rectangular Prism", "Regular N-Gon Pyramid", "Triangular Pyramid", "Rectangular Pyramid", "Sphere", "Cylinder", "Cone");

    @FXML
    private ChoiceBox choice3D;

    @FXML
    Button goButton;

    @FXML
    Button backButton;

    @FXML
    private void initialize() {
        choice3D.setItems(choice3DList);
        choice3D.setValue("None");
    }

    public void goButtonPressed(ActionEvent event) throws IOException {
        String choice = (String)choice3D.getValue();
        String selectedFile = getSceneName(choice);

        new SceneSwitcher(selectedFile, event);
    }

    public void backButtonPressed(ActionEvent event) throws IOException {
        new SceneSwitcher("geometry/GeometryMenu.fxml", event);
    }

    private String getSceneName(String str) {
        if(str.equals("Regular N-Gon Prism")) return "geometry/RegNGonPrism.fxml";
        if(str.equals("TriangularPrism")) return "geometry/TriangularPrism.fxml";
        if(str.equals("Rectangular Prism")) return "geometry/RectangularPrism.fxml";
        if(str.equals("Regular N-Gon Pyramid")) return "geometry/RegNGonPyramid.fxml";
        if(str.equals("Triangular Pyramid")) return "geometry/TriangularPyramid.fxml";
        if(str.equals("Rectangular Pyramid")) return "geometry/RectangularPyramid.fxml";
        if(str.equals("Sphere")) return "geometry/Sphere.fxml";
        if(str.equals("Cylinder")) return "geometry/Cylinder.fxml";
        if(str.equals("Cone")) return "geometry/Cone.fxml";
        return "No Choice Selected";
    }
}
