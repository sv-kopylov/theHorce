/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehorce;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Сергей
 */
public class TheHorce extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FieldModel field = new FieldModel();
        ControllerHandler control = new ControllerHandler(field);
        FieldView fieldView = new FieldView(field, control);
       Scene scene = fieldView.getScene();
        
       
        
        primaryStage.setTitle("The horce");
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
