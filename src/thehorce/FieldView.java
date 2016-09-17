/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehorce;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Сергей
 */
public class FieldView {
   private final FieldModel modelField;
   private final Button buttons[][];
   private final GridPane grid;
   private final ControllerHandler controllerHandler;
   private final Scene scene;
   
   public Scene getScene (){
       return scene;
   }

    public FieldView(FieldModel modelField, 
            ControllerHandler controllerHandler) {
        this.modelField = modelField;
        this.controllerHandler = controllerHandler;
        int size = modelField.fieldSize;
        buttons = new Button[size][size];
        grid = new GridPane();
        
        
        for (int i=0; i<size;i++){
            for (int j=0; j<size; j++){
                buttons[i][j]=new Button();
                buttons[i][j].disableProperty().bind(modelField.getCell(i, j).disabled);
                buttons[i][j].setId(Integer.toString(i)+"%"+Integer.toString(j));
              
                buttons[i][j].setOnAction(controllerHandler);
                buttons[i][j].setMinSize(40, 40);
                buttons[i][j].setStyle("-fx-font: bold 12pt Arial;-fx-text-fill: #660000");
                grid.add(buttons[i][j], i, j);
            }
            
          
        }
          scene = new Scene(grid, modelField.fieldSize*40, modelField.fieldSize*40);
        
        
    }
    
    
}
