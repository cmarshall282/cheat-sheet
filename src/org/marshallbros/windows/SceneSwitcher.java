package org.marshallbros.windows;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {
    Parent root;
    Scene scene;
    Stage window;

    public SceneSwitcher(String fileName, ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource(fileName));
        scene = new Scene(root);
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
