package org.marshallbros.windows;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.io.IOException;


public class GeometryMenuController {
    private ObservableList<String> geometryChoiceList = FXCollections.observableArrayList("None", "3D Shapes", "2D Shapes", "Miscellaneous");

    @FXML
    ChoiceBox geometryChoice;

    @FXML
    Button goButton;

    @FXML
    public void initialize() {
        geometryChoice.setItems(geometryChoiceList);
        geometryChoice.setValue("None");
    }

    public void goPressed(ActionEvent event) throws IOException {
        String choice = (String)geometryChoice.getValue();
        String selectedFile = getSceneName(choice);

        new SceneSwitcher(selectedFile, event);
    }

    public String getSceneName(String input) {
        if(input.equals("3D Shapes")) return "Shapes3D.fxml";
        if(input.equals("2D Shapes")) return "Shapes2D.fxml";
        if(input.equals("Miscellaneous")) return "MiscGeometry.fxml";
        return "No Choice Selected";
    }
}
