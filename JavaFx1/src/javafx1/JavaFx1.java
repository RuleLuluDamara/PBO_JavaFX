/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafx1;

import java.awt.Desktop.Action;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFx1 extends Application {

    // launch the application
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Rule Lulu Damara");

        VBox body = new VBox();

        Button b1 = new Button("Tap");
        b1.setLayoutX(0);
        b1.setLayoutY(100);
        b1.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(Action event){
                System.out.println("Haii");
                b1.setText("Done");
            }

            @Override
            public void handle(ActionEvent event) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        Button b3 = new Button("Tap Tap");
        HBox div1 = new HBox();

        div1.getChildren().addAll(b1, b3);

        StackPane r = new StackPane();
        r.getChildren().addAll(div1);
        Scene scene = new Scene(r, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}