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
public class ModelField {

    final int fieldSize = 10;
    private Cell field[][];
    private Cell currentCell;
    private int step = 0;

    public ModelField() {
        field = new Cell[fieldSize][fieldSize];
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = new Cell(i, j);
            }
        }

    }

    void updateField(int x, int y) {
        step++;
        if (step == (fieldSize * fieldSize)) {
            System.out.println("Winn!");
            return;
        }
        if (currentCell != null) {
            currentCell.setAvilabel(false);
            currentCell.setCurent(false);
        }
        currentCell = field[x][y];
        currentCell.setCurent(true);
        currentCell.setStep(step);

        if (!updateAvilabels(x, y)) {
            System.out.println("Looser!");
            return;
        }
    }

    private boolean updateAvilabels(int x, int y) {
        int cnt = 0;
        int tempX, tempY;
        resetAvilabels();
//   1     
        tempX = x + 2;
        tempY = y - 1;
        if ((tempX >= 0) && (tempX < fieldSize) && (tempY >= 0) && (tempY < fieldSize)) {
            if (field[tempX][tempY].getStep() == 0) {
                field[tempX][tempY].setAvilabel(true);
                cnt++;
            }
        }
        //   2     
        tempX = x + 1;
        tempY = y - 2;
        if ((tempX >= 0) && (tempX < fieldSize) && (tempY >= 0) && (tempY < fieldSize)) {
            if (field[tempX][tempY].getStep() == 0) {
                field[tempX][tempY].setAvilabel(true);
                cnt++;
            }
        }
        //   3     
        tempX = x - 1;
        tempY = y - 2;
        if ((tempX >= 0) && (tempX < fieldSize) && (tempY >= 0) && (tempY < fieldSize)) {
            if (field[tempX][tempY].getStep() == 0) {
                field[tempX][tempY].setAvilabel(true);
                cnt++;
            }
        }
        //   4     
        tempX = x - 2;
        tempY = y - 1;
        if ((tempX >= 0) && (tempX < fieldSize) && (tempY >= 0) && (tempY < fieldSize)) {
            if (field[tempX][tempY].getStep() == 0) {
                field[tempX][tempY].setAvilabel(true);
                cnt++;
            }
        }
        //   5     
        tempX = x - 2;
        tempY = y + 1;
        if ((tempX >= 0) && (tempX < fieldSize) && (tempY >= 0) && (tempY < fieldSize)) {
            if (field[tempX][tempY].getStep() == 0) {
                field[tempX][tempY].setAvilabel(true);
                cnt++;
            }
        }
        //   6     
        tempX = x - 1;
        tempY = y + 2;
        if ((tempX >= 0) && (tempX < fieldSize) && (tempY >= 0) && (tempY < fieldSize)) {
            if (field[tempX][tempY].getStep() == 0) {
                field[tempX][tempY].setAvilabel(true);
                cnt++;
            }
        }
        //   7     
        tempX = x + 1;
        tempY = y + 2;
        if ((tempX >= 0) && (tempX < fieldSize) && (tempY >= 0) && (tempY < fieldSize)) {
            if (field[tempX][tempY].getStep() == 0) {
                field[tempX][tempY].setAvilabel(true);
                cnt++;
            }
        }
        //   8     
        tempX = x + 2;
        tempY = y + 1;
        if ((tempX >= 0) && (tempX < fieldSize) && (tempY >= 0) && (tempY < fieldSize)) {
            if (field[tempX][tempY].getStep() == 0) {
                field[tempX][tempY].setAvilabel(true);
                cnt++;
            }
        }
        return cnt!=0;
    }

    private void resetAvilabels() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j].setAvilabel(false);
            }
        }

    }
}
