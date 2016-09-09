/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehorce;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.BooleanPropertyBase;
import javafx.beans.property.SimpleBooleanProperty;

/**
 *
 * @author Сергей
 */
public class Cell {
    
    int step;
    final int x, y;
    boolean curent;
    SimpleBooleanProperty disabled;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        step = 0;
        curent = false;
        disabled = new SimpleBooleanProperty();
        disabled.set(false);

    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getX() {
        return x;
    }

    public boolean isCurent() {
        return curent;
    }

    public void setCurent(boolean curent) {
        this.curent = curent;
    }

    public boolean isDisabled() {
        return disabled.get();
    }

    public void setDisabled(boolean avilabel) {
        this.disabled.set(avilabel);
    }

    public int getY() {
        return y;
    }

}
