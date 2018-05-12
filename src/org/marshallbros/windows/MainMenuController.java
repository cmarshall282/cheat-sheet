package org.marshallbros.windows;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    public void startPressed(ActionEvent event) throws IOException {
        Parent selectorMenuParent = FXMLLoader.load(getClass().getResource("SelectorMenu.fxml"));

        Scene SelectorMenuScene = new Scene(selectorMenuParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(SelectorMenuScene);
        window.show();
    }

    public void quitPressed(ActionEvent event) {
        System.exit(0);
    }
}
