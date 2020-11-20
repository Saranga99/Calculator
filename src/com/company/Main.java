package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public static Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    public static Button btnAdd, btnMinus, btnMulti, btnDivide, btnEqual, btnPoint, btnClearEntry, btnClear;
    public static TextField calTxtField, memoryField;
    public static Label lblBG;
    int operation = -1;
    Float data = 0f;
    Button[] calButtons = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnMinus, btnMulti, btnDivide, btnEqual, btnPoint, btnClearEntry, btnClear};
    String[] textOnBtn = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "=", ".", "CE", "C"};
    Integer[][] point = {{80, 402}, {0, 147}, {80, 147}, {160, 147}, {0, 232}, {80, 232}, {160, 232}, {0, 317}
            , {80, 317}, {160, 317}, {240, 147}, {240, 232}, {240, 317}, {240, 402}, {320, 317}, {160, 402}, {320, 147}, {320, 232}};

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage calStage = new Stage();
        calStage.setTitle("Calculator");
        //adding images and give sizes and (x,y)
        Image image1 = new Image("pics/It's The Most Wonderful Time Of The Year_ Imgur Secret Santa Is Here!.jpg");
        ImageView homeBG = new ImageView();
        homeBG.setImage(image1);
        homeBG.setFitWidth(609);
        homeBG.setFitHeight(600);
        calTxtField = Components.creatingTextField(0, 0, 147, 400);
        memoryField = Components.creatingTextField(0, 0, 25, 200);
        lblBG = Components.creatingLabelForBackground();
        for (int i = 0; i < calButtons.length; i++) {
            calButtons[i] = Components.creatingButton(textOnBtn[i], point[i][0], point[i][1], 85, 80);
        }
        Pane calPane = new Pane();
        calPane.getChildren().add(homeBG);
        calPane.getChildren().add(lblBG);
        calPane.getChildren().add(calTxtField);
        calPane.getChildren().add(memoryField);
        for (int i = 0; i < calButtons.length; i++) {
            calPane.getChildren().add(calButtons[i]);
        }

        for (int i = 0; i < textOnBtn.length; i++) {
            int finalI = i;
            calButtons[i].setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (event.getSource() == calButtons[0]) {
                        calTxtField.setText(calTxtField.getText() + "0");
                    } else if (event.getSource() == calButtons[1]) {
                        calTxtField.setText(calTxtField.getText() + "1");
                    } else if (event.getSource() == calButtons[2]) {
                        calTxtField.setText(calTxtField.getText() + "2");
                    } else if (event.getSource() == calButtons[3]) {
                        calTxtField.setText(calTxtField.getText() + "3");
                    } else if (event.getSource() == calButtons[4]) {
                        calTxtField.setText(calTxtField.getText() + "4");
                    } else if (event.getSource() == calButtons[5]) {
                        calTxtField.setText(calTxtField.getText() + "5");
                    } else if (event.getSource() == calButtons[6]) {
                        calTxtField.setText(calTxtField.getText() + "6");
                    } else if (event.getSource() == calButtons[7]) {
                        calTxtField.setText(calTxtField.getText() + "7");
                    } else if (event.getSource() == calButtons[8]) {
                        calTxtField.setText(calTxtField.getText() + "8");
                    } else if (event.getSource() == calButtons[9]) {
                        calTxtField.setText(calTxtField.getText() + "9");
                    } else if (event.getSource() == calButtons[15]) {
                        calTxtField.setText(calTxtField.getText() + ".");
                    } else if (event.getSource() == calButtons[10]) {
                        data = Float.parseFloat(calTxtField.getText());
                        calTxtField.clear();
                        memoryField.setText(data + "+");
                        operation = 1; //Addition
                    } else if (event.getSource() == calButtons[11]) {
                        data = Float.parseFloat(calTxtField.getText());
                        calTxtField.clear();
                        memoryField.setText(data + "-");
                        operation = 2; //Subtraction
                    } else if (event.getSource() == calButtons[12]) {
                        data = Float.parseFloat(calTxtField.getText());
                        calTxtField.clear();
                        memoryField.setText(data + "*");
                        operation = 3; //Mul
                    } else if (event.getSource() == calButtons[13]) {
                        data = Float.parseFloat(calTxtField.getText());
                        calTxtField.clear();
                        memoryField.setText(data + "/");
                        operation = 4; //Div
                    } else if (calTxtField.getText() == "" && event.getSource() == calButtons[14]) {
                        operation = 5;
                    } else if (event.getSource() == calButtons[14]) {
                        Float secondOperand = Float.parseFloat(calTxtField.getText());
                        switch (operation) {
                            case 1: //Addition
                                Float ans = data + secondOperand;
                                calTxtField.setText(String.valueOf(ans));
                                memoryField.setText(String.valueOf(data) + "+" + String.valueOf(secondOperand));
                                break;
                            case 2: //Subtraction
                                ans = data - secondOperand;
                                calTxtField.setText(String.valueOf(ans));
                                memoryField.setText(String.valueOf(data) + "-" + String.valueOf(secondOperand));
                                break;
                            case 3: //Mul
                                ans = data * secondOperand;
                                calTxtField.setText(String.valueOf(ans));
                                memoryField.setText(String.valueOf(data) + "*" + String.valueOf(secondOperand));
                                break;
                            case 4: //Div
                                ans = 0f;
                                try {
                                    ans = data / secondOperand;
                                    memoryField.setText(String.valueOf(data) + "/" + String.valueOf(secondOperand));
                                } catch (Exception e) {
                                    calTxtField.setText("Error");
                                }
                                calTxtField.setText(String.valueOf(ans));
                                break;
                            case 5:
                                Components.error("ERRROR");
                                break;

                        }

                    } else if (event.getSource() == calButtons[16]) {
                        calTxtField.clear();
                    } else if (event.getSource() == calButtons[17]) {
                        calTxtField.clear();
                        memoryField.clear();
                    }
                }
            });
        }


        calStage.setScene(new Scene(calPane, 400, 487));
        calStage.show();
    }


}
