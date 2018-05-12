package org.marshallbros.windows;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectorMenuController {
    public void algebraPressed(ActionEvent event) throws IOException {
        Parent algebraMenuParent = FXMLLoader.load(getClass().getResource("AlgebraMenu.fxml"));

        Scene algebraMenuScene = new Scene(algebraMenuParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(algebraMenuScene);
        window.show();
    }

    public void geometryPressed(ActionEvent event) throws IOException {
        Parent geometryMenuParent = FXMLLoader.load(getClass().getResource("GeometryMenu.fxml"));

        Scene geometryMenuScene = new Scene(geometryMenuParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(geometryMenuScene);
        window.show();
    }

    public void trigPressed(ActionEvent event) throws IOException {
        Parent trigMenuParent = FXMLLoader.load(getClass().getResource("TrigMenu.fxml"));

        Scene trigMenuScene = new Scene(trigMenuParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(trigMenuScene);
        window.show();
    }

    public void backMenuPressed(ActionEvent event) throws IOException {
       Parent backMenuParent = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

       Scene backMenuScene = new Scene(backMenuParent);
       Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(backMenuScene);
       window.show();
    }
}
