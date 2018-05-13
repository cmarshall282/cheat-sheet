package org.marshallbros.windows;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.LoadException;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.io.IOException;

public class AlgebraMenuController {

    private ObservableList<String> algebraChoiceList = FXCollections.observableArrayList("None", "Quadratic Formula", "Find Vertex", "Distance Formula");

    @FXML
    ChoiceBox algebraChoice;

    @FXML
    Button goButton;

    @FXML
    private void initialize() {
        algebraChoice.setItems(algebraChoiceList);
        algebraChoice.setValue("None");
    }

    public void goPressed(ActionEvent event) throws IOException {
        Object input = algebraChoice.getValue();
        String choice = (String)input;
        String selectedFile = getSceneName(choice);

        new SceneSwitcher(selectedFile, event);
    }

    private String getSceneName(String input) {

        if(input.equals("Quadratic Formula")) return "QuadraticFormula.fxml";
        if(input.equals("Find Vertex")) return "VertexMenu.fxml";
        if(input.equals("Distance Formula")) return "DistanceFormula.fxml";
        return "No Choice Selected";
    }
}
