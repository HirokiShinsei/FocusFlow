package com.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL; // Add this import statement

public class FocusFlow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    Scene scene = new Scene(createOpenAccountPanel(), 600, 400);
    primaryStage.setScene(scene);
    primaryStage.setTitle("FocusFlow");

    URL cssResource = getClass().getResource("/com/gui/styles.css");

    // Ensure cssResource is not null before using it
    if (cssResource == null) {
        throw new RuntimeException("CSS resource not found: styles.css");
    }

    // Inside the start method
    scene.getStylesheets().add(cssResource.toExternalForm());

    primaryStage.show();
    }

    private StackPane createOpenAccountPanel() {
        Label titleLabel = new Label("Open Account");
        Label messageLabel = new Label("Welcome to FocusFlow, your ultimate time management and focus booster.");
        Button startButton = new Button("Start");

        startButton.setOnAction(event -> {
            // Switch to the next panel here
        });

        StackPane openAccountPane = new StackPane(titleLabel, messageLabel, startButton);
        openAccountPane.getStyleClass().addAll("vertical-stack", "open-account-pane");

        titleLabel.getStyleClass().add("title-label");
        messageLabel.getStyleClass().add("message-label");
        startButton.getStyleClass().add("start-button");

        return openAccountPane;
    }
}
