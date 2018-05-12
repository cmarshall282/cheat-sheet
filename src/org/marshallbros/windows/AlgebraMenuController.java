package org.marshallbros.windows;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AlgebraMenuController {

    private ObservableList<String> algebraChoiceList = FXCollections.observableArrayList("None", "Quadratic Formula", "Find Vertex", "Change of Base", "Distance Formula");

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
        System.out.println(selectedFile);

        Parent choiceParent = FXMLLoader.load(getClass().getResource(selectedFile));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene choiceScene = new Scene(choiceParent);
        window.setScene(choiceScene);
        window.show();
    }

    private String getSceneName(String input) {

        if(input.equals("Quadratic Formula")) return "QuadraticFormula.fxml";
        if(input.equals("Find Vertex")) return "FindVertex.fxml";
        if(input.equals("Change of Base")) return "ChangeofBase.fxml";
        if(input.equals("Distance Formula")) return"DistanceFormula.fxml";
        return "No Choice Selected";
    }
}
