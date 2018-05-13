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
        new SceneSwitcher("SelectorMenu.fxml", event);
    }

    public void quitPressed(ActionEvent event) {
        System.exit(0);
    }
}
