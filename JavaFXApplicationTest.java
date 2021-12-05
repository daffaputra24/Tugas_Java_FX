/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author didik
 */
public class JavaFXApplicationTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnOK = new Button();
        
        TextField tf = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();
        PasswordField tf5 = new PasswordField();
        PasswordField tf6 = new PasswordField();
        Label labelInput = new Label("First Name: ");
        Label labelInput2 = new Label("Last Name: ");
        Label labelInput3 = new Label("E-mail Address: ");
        Label labelInput4 = new Label("Contact No: ");
        Label labelInput5 = new Label("Password: ");
        Label labelInput6 = new Label("Confirm Password: ");

        
        btnOK.setText("Register");
        
        btnOK.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                tf.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                tf6.setText("");
            }
        });
        
        
        
        
        HBox panel1 = new HBox();
        HBox panel11 = new HBox();
        HBox panel12 = new HBox();
        HBox panel13 = new HBox();
        HBox panel14 = new HBox();
        HBox panel15 = new HBox();
        TilePane panel2 = new TilePane();
        
        panel1.getChildren().add(labelInput);
        panel1.getChildren().add(tf);
        
        panel11.getChildren().add(labelInput2);
        panel11.getChildren().add(tf2);
        
        panel12.getChildren().add(labelInput3);
        panel12.getChildren().add(tf3);
        
        panel13.getChildren().add(labelInput4);
        panel13.getChildren().add(tf4);
        
        panel14.getChildren().add(labelInput5);
        panel14.getChildren().add(tf5);
        
        panel15.getChildren().add(labelInput6);
        panel15.getChildren().add(tf6);
        
        
        panel2.getChildren().add(btnOK);
        
        VBox rooot = new VBox();
        rooot.getChildren().add(panel1);
        rooot.getChildren().add(panel11);
        rooot.getChildren().add(panel12);
        rooot.getChildren().add(panel13);
        rooot.getChildren().add(panel14);
        rooot.getChildren().add(panel15);
        rooot.getChildren().add(panel2);

        
        panel1.setLayoutX(10);
        panel1.setLayoutY(10);
        
        panel11.setLayoutX(10);
        panel11.setLayoutY(10);
        
        panel12.setLayoutX(10);
        panel12.setLayoutY(10);
        
        panel13.setLayoutX(10);
        panel13.setLayoutY(10);
        
        panel14.setLayoutX(10);
        panel14.setLayoutY(10);
        
        panel15.setLayoutX(10);
        panel15.setLayoutY(10);
        
        panel2.setLayoutX(100);
        panel2.setLayoutY(50);
        

        
        
        Scene scene = new Scene(rooot, 500, 250);
        scene.setFill(Color.DARKCYAN);
        panel1.setBackground(new Background(new BackgroundFill(Color.ANTIQUEWHITE,null,null)));
        panel1.setPadding(new Insets(5,5,5,5));
        
        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
