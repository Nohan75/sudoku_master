package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void displayGrid(int[][] tab){
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean checkLine(int tab[][],int line, int number){
        System.out.println("------");
        int count = 0;
        for (int i = 0; i < tab[line].length; i++){
            if(tab[line][i] == number){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        System.out.println("Nombre de " + number + " sur la  ligne  = " + count);
        return true;
    }


    public static boolean checkcolone(int tab[][],int colonne, int number){
        System.out.println("------");
        int count = 0;
        for (int j = 0; j < tab[colonne].length; j++){
            if(tab[j][colonne] == number){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        System.out.println("Nombre de " + number + " sur la  colonne  = " + count);
        return true;
    }

    public static void main(String[] args) {
	// write your code here
        int[][] boardEasy = {
                {4, 0, 0, 1, 0, 2, 6, 8, 0},
                {1, 0, 0, 0, 9, 0, 0, 0, 4},
                {0, 3, 8, 0, 6, 4, 0, 1, 0},
                {0, 0, 5, 0, 7, 1, 9, 2, 0},
                {0, 2, 6, 0, 0, 9, 8, 0, 0},
                {8, 0, 0, 2, 5, 0, 0, 0, 0},
                {9, 0, 3, 0, 0, 0, 0, 0, 8},
                {2, 5, 0, 6, 0, 0, 1, 0, 7},
                {6, 0, 7, 9, 0, 5, 3, 0, 0}
        };
        displayGrid(boardEasy);

        checkLine(boardEasy, 0, 1);
        checkcolone(boardEasy, 6,6);
    }
}
