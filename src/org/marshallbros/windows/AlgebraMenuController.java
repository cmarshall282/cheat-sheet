package org.marshallbros.windows;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class AlgebraMenuController {

    ObservableList<String> algebraChoiceList = FXCollections.observableArrayList("None", "Quadratic Formula", "Find Vertex", "Change of Base", "Distance Formula");

    @FXML
    ChoiceBox algebraChoice;

    @FXML
    private void initialize() {
        algebraChoice.setItems(algebraChoiceList);
        algebraChoice.setValue("None");
    }
}
