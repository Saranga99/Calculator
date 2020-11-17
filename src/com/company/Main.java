package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;


public class Main extends Application {
    public static Button btn1;

    Button[] calButtons = {btn1};
    String[] textOnBtn = {"1"};
    Integer[][] point = {{0, 0}};


    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage calStage = new Stage();
        calStage.setTitle("Calculator");
        for (int i = 0; i < calButtons.length; i++) {
            calButtons[i] = Components.creatingButton(textOnBtn[i], point[i][0], point[i][1], 90, 82);
        }


        Pane calPane = new Pane();
        for (int i = 0; i < calButtons.length; i++) {
            calPane.getChildren().add(calButtons[i]);
        }


        calStage.setScene(new Scene(calPane, 600, 400));
        calStage.show();

    }


}
