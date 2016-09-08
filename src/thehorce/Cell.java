/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehorce;

/**
 *
 * @author Сергей
 */
public class Cell {
    
    int step;
    final int x, y;
    boolean curent;
    boolean avilabel;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        step = 0;
        curent = false;
        avilabel = false;

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

    public boolean isAvilabel() {
        return avilabel;
    }

    public void setAvilabel(boolean avilabel) {
        this.avilabel = avilabel;
    }

    public int getY() {
        return y;
    }

}
