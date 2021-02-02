package org.fundacionjala.at13.spaceinvaders;
import org.fundacionjala.at13.spaceinvaders.Alien;

public class Matrix {
    public static final int MATRIX_HEIGHT = 50;
    public static final int MATRIX_WIDTH = 100;
    public int[][] space;
    public Alien firstAlien = new Alien();

    public Matrix(){
        this.space = new int[MATRIX_HEIGHT][MATRIX_WIDTH];
        fillMatrix();
        //showMatrix();
       // firstAlien.moveRight();
       // fillMatrix();
      //  showMatrix();
    }

    public void fillMatrix() {
        for (int i = 0; i < MATRIX_HEIGHT; i++) {
            for (int j = 0; j < MATRIX_WIDTH; j++) {
                if ((i == firstAlien.getYPos()) && (j == firstAlien.getXPos())) {
                    space[i][j]=1;
                } else {
                    space[i][j]=0;
                }
            }
        }
    }

    public void showMatrix() {
        for (int i = 0; i < MATRIX_HEIGHT; i++) {
            for (int j = 0; j < MATRIX_WIDTH; j++) {
                System.out.print(space[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
    public int getMATRIX_WIDTH(){
        return MATRIX_WIDTH;
    }
    public int getMATRIX_HEIGHT(){
        return MATRIX_HEIGHT;
    }
}
