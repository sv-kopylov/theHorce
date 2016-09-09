/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehorce;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Сергей
 */
public class ControllerHandler implements EventHandler<ActionEvent> {
    ModelField modelField;

    public ControllerHandler(ModelField modelField) {
        this.modelField = modelField;
    }
    

    @Override
    public void handle(ActionEvent event) {
    }
    
}
