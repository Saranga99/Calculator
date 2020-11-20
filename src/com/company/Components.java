package com.company;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javax.swing.text.StyledEditorKit;
import java.awt.*;


public class Components {
    //all the useful components created in this class using static methods , for avoid code duplication
    //method for creating buttons
    public static Button creatingButton(String txtOnBtn, int x, int y, int prefHeight, int setPrefWidth) {
        Button btn = new Button(txtOnBtn);
        btn.setLayoutX(x);
        btn.setLayoutY(y);
        btn.setPrefHeight(prefHeight);
        btn.setPrefWidth(setPrefWidth);
        btn.setStyle("-fx-background-color:transparent;-fx-border-color:#66CDAA;-fx-text-fill:#f5f7f7;-fx-font-size:2em;-fx-border-radius:20;");
        return btn;
    }
    //creating label for get dark appearence in all windows
    public static Label creatingLabelForBackground() {
        Label lblBG = new Label();
        lblBG.setLayoutX(0);
        lblBG.setLayoutY(0);
        lblBG.setPrefHeight(500);
        lblBG.setPrefWidth(700);
        lblBG.setStyle("-fx-background-color: #000000;");
        lblBG.setOpacity(0.7);
        return lblBG;
    }
    //method for creating text fields
    public static TextField creatingTextField(int x, int y, int prefHeight, int PrefWidth) {
        TextField txtField = new TextField();
        txtField.setLayoutX(x);
        txtField.setLayoutY(y);
        txtField.setPrefWidth(PrefWidth);
        txtField.setPrefHeight(prefHeight);
        txtField.setStyle("-fx-background-color:transparent;-fx-border-color:#66CDAA;-fx-text-fill:#f5f7f7;-fx-font-size:2em;-fx-border-radius:20;");
        return txtField;
    }
    //method for information alert
    public static Alert information(String message) {
        Alert infoAlert = new Alert(Alert.AlertType.NONE);
        infoAlert.setAlertType(Alert.AlertType.INFORMATION);
        infoAlert.setContentText(message);
        infoAlert.showAndWait();
        return infoAlert;
    }
    //method for error alert and this will pop up with a sound
    public static Alert error(String message) {
        Toolkit.getDefaultToolkit().beep();
        Alert errorAlert = new Alert(Alert.AlertType.NONE);
        errorAlert.setAlertType(Alert.AlertType.ERROR);
        errorAlert.setContentText(message);
        errorAlert.showAndWait();
        return errorAlert;
    }


}
