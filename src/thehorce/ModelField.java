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
    private int step=0;

    public ModelField() {
        field = new Cell[fieldSize][fieldSize];
        for(int i=0;i<fieldSize;i++){
            for(int j=0;j<fieldSize;j++){
                field[i][j]=new Cell(i,j);
            }
        }
        
    }
    
    void updateField(int x, int y){
        step++;
        if (step==(fieldSize*fieldSize)){
            System.out.println("Winn!");
            return;
        }
        if (currentCell!=null){
            currentCell.setAvilabel(false);
            currentCell.setCurent(false);
        }
    }
    
    
    


}

