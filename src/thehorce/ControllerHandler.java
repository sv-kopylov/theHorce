/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehorce;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 *
 * @author Сергей
 */
public class ControllerHandler implements EventHandler<ActionEvent> {

    FieldModel modelField;

    public ControllerHandler(FieldModel modelField) {
        this.modelField = modelField;
    }

    @Override
    public void handle(ActionEvent event) {
        Button b = (Button) event.getSource();
        String s = b.getId();
        modelField.updateField(parsX(s), parsY(s));
        b.setText(Integer.toString(modelField.getStep()));
        b.setStyle("-fx-color: blue");
    }

    private int parsX(String str) {
        String s = str.substring(0, str.indexOf('%'));
        return Integer.parseInt(s);
    }

    private int parsY(String str) {
        String s = str.substring(str.indexOf('%')+1);
        return Integer.parseInt(s);
    }

}
