package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public static Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    public static Button btnAdd, btnMinus, btnMulti, btnDivide, btnEqual, btnPoint;
    public static TextField calTxtField;

    Button[] calButtons = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnMinus, btnMulti, btnDivide, btnEqual, btnPoint};
    String[] textOnBtn = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "=", "."};
    Integer[][] point = {{80, 402}, {0, 147}, {80, 147}, {160, 147}, {0, 232}, {80, 232}, {160, 232}, {0, 317}
            , {80, 317}, {160, 317}, {240, 147}, {240, 232}, {240, 317}, {240, 402}, {320, 317}, {160, 402}};


    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage calStage = new Stage();
        calStage.setTitle("Calculator");

        calTxtField = Components.creatingTextField("", 0, 0, 147, 400);
        for (int i = 0; i < calButtons.length; i++) {
            calButtons[i] = Components.creatingButton(textOnBtn[i], point[i][0], point[i][1], 85, 80);
        }


        Pane calPane = new Pane();
        calPane.getChildren().add(calTxtField);
        for (int i = 0; i < calButtons.length; i++) {
            calPane.getChildren().add(calButtons[i]);
        }


        calStage.setScene(new Scene(calPane, 400, 609));
        calStage.show();

    }


}
