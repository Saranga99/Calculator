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
        btn.setStyle("-fx-background-color:#000000; -fx-border-color:#F0F8FF;-fx-text-fill:#f5f7f7;-fx-font-size:2em;-fx-border-radius:20");
        return btn;
    }

    //method for creating labels
    public static Label creatingLabel(String txtOnLbl, Double x, Double y, Double prefHeight, Double PrefWidth) {
        Label lbl = new Label(txtOnLbl);
        lbl.setLayoutX(x);
        lbl.setLayoutY(y);
        lbl.setPrefHeight(prefHeight);
        lbl.setPrefWidth(PrefWidth);
        lbl.setStyle("-fx-text-fill:#ffffff");
        lbl.setStyle("-fx-background-color:transparent;-fx-text-fill:#f5f7f7;-fx-font-size:1em;-fx-font-weight: Bold;");
        return lbl;

    }

    //creating label for get dark appearence in all windows
    public static Label creatingLabelForBackground() {
        Label lblBG = new Label();
        lblBG.setLayoutX(0);
        lblBG.setLayoutY(0);
        lblBG.setPrefHeight(500);
        lblBG.setPrefWidth(700);
        lblBG.setStyle("-fx-background-color: #000000;");
        lblBG.setOpacity(0.81);
        return lblBG;
    }

    //method for creating text fields
    public static TextField creatingTextField(String promptTxt, int x, int y, int prefHeight, int PrefWidth) {
        TextField txtField = new TextField();
        txtField.setPromptText(promptTxt);
        txtField.setLayoutX(x);
        txtField.setLayoutY(y);
        txtField.setPrefWidth(PrefWidth);
        txtField.setPrefHeight(prefHeight);
        txtField.setStyle("-fx-background-color:#000000; -fx-border-color:#F0F8FF;-fx-text-fill:#f5f7f7;-fx-font-size:2em;-fx-border-radius:20");
        return txtField;
    }

    //method for create back button, back button appears in most of the windows and this will avoid code duplication
    public static Button createBtnBack() {
        Image imageBack = new Image("Pics/back.png");
        ImageView backPng = new ImageView();
        backPng.setImage(imageBack);
        backPng.setFitWidth(30);
        backPng.setFitHeight(30);

        Button btnBack = new Button();
        btnBack.setLayoutX(0);
        btnBack.setLayoutY(0);
        btnBack.setPrefHeight(20);
        btnBack.setPrefWidth(30);
        btnBack.setGraphic(backPng);
        btnBack.setStyle("-fx-background-color:transparent; -fx-background-radius:100;");
        btnBack.setOpacity(0.81);
        return btnBack;
    }

    //method for create close button, close button appears in all windows and this will avoid code duplication
    public static Button createBtnClose() {
        Image imageClose = new Image("Pics/Close.png");
        ImageView closePng = new ImageView();
        closePng.setImage(imageClose);
        closePng.setFitWidth(30);
        closePng.setFitHeight(29);

        Button btnClose = new Button();
        btnClose.setLayoutX(560);
        btnClose.setLayoutY(0);
        btnClose.setPrefHeight(19);
        btnClose.setPrefWidth(30);
        btnClose.setGraphic(closePng);
        btnClose.setStyle("-fx-background-color:transparent; -fx-background-radius:100;");
        btnClose.setOpacity(0.81);
        return btnClose;
    }

    //method for creating help button
    public static Button createBtnHelp() {
        Image imageHelp = new Image("Pics/help.png");
        ImageView helpPng = new ImageView();
        helpPng.setImage(imageHelp);
        helpPng.setFitWidth(40);
        helpPng.setFitHeight(40);

        Button btnClose = new Button();
        btnClose.setLayoutX(2);
        btnClose.setLayoutY(350);
        btnClose.setPrefHeight(19);
        btnClose.setPrefWidth(30);
        btnClose.setGraphic(helpPng);
        btnClose.setStyle("-fx-background-color:transparent; -fx-background-radius:100;");
        btnClose.setOpacity(0.81);
        return btnClose;
    }

    //method for keyboard keys, all keyboard keys wii created in this method
    public static Button btnForKeyBoard(String txtOnBtn, Double x, Double y, Double prefHeight, Double setPrefWidth) {
        Button key = new Button(txtOnBtn);
        key.setLayoutX(x);
        key.setLayoutY(y);
        key.setPrefHeight(prefHeight);
        key.setPrefWidth(setPrefWidth);
        key.setStyle("-fx-background-color:transparent;-fx-border-color:#66CDAA;-fx-text-fill:#f5f7f7;-fx-font-size:2em;-fx-border-radius:20;");
        return key;

    }

    //method for keyboard, this method can be called with (x,y) values


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

    //if input values are less than 0 this will popup with a sound
    public static Alert errorInput() {
        Toolkit.getDefaultToolkit().beep();
        Alert errorAlert = new Alert(Alert.AlertType.NONE);
        errorAlert.setAlertType(Alert.AlertType.ERROR);
        errorAlert.setContentText("Please make sure not to  enter (-) values as inputs");
        errorAlert.showAndWait();
        return errorAlert;
    }


}
