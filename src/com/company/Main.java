package com.company;


import com.robin.Boards;
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
//        System.out.println("------");
        int count = 0;
        for (int i = 0; i < tab[line].length; i++){
            if(tab[line][i] == number){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " sur la  ligne  = " + count);
        return true;
    }


    public static boolean checkcolone(int tab[][],int colonne, int number){
//        System.out.println("------");
        int count = 0;
        for (int j = 0; j < tab[colonne].length; j++){
            if(tab[j][colonne] == number){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " sur la  colonne  = " + count);
        return true;
    }

    public static boolean checkSection1(int tab[][], int number){
//        System.out.println("------");
        int count = 0;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if(tab[i][j] == number){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " = " + count);

        return true;
    }
    public static boolean checkSection2(int tab[][], int number){
//        System.out.println("------");
        int count = 0;

        for (int i = 0; i < 3; i++){
            for (int j = 3; j < 6; j++){
                if(tab[i][j] == number){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " = " + count);

        return true;
    }
    public static boolean checkSection3(int tab[][], int number){
//        System.out.println("------");
        int count = 0;

        for (int i = 0; i < 3; i++){
            for (int j = 6; j < 9; j++){
                if(tab[i][j] == number){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " = " + count);

        return true;
    }
    public static boolean checkSection4(int tab[][], int number){
//        System.out.println("------");
        int count = 0;

        for (int i = 3; i < 6; i++){
            for (int j = 0; j < 3; j++){
                if(tab[i][j] == number){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " = " + count);

        return true;
    }
    public static boolean checkSection5(int tab[][], int number){
//        System.out.println("------");
        int count = 0;

        for (int i = 3; i < 6; i++){
            for (int j = 3; j < 6; j++){
                if(tab[i][j] == number){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " = " + count);

        return true;
    }
    public static boolean checkSection6(int tab[][], int number){
//        System.out.println("------");
        int count = 0;

        for (int i = 3; i < 6; i++){
            for (int j = 6; j < 9; j++){
                if(tab[i][j] == number){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " = " + count);

        return true;
    }
    public static boolean checkSection7(int tab[][], int number){
//        System.out.println("------");
        int count = 0;

        for (int i = 6; i < 9; i++){
            for (int j = 0; j < 3; j++){
                if(tab[i][j] == number){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " = " + count);

        return true;
    }
    public static boolean checkSection8(int tab[][], int number){
//        System.out.println("------");
        int count = 0;

        for (int i = 6; i < 9; i++){
            for (int j = 3; j < 6; j++){
                if(tab[i][j] == number){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " = " + count);

        return true;
    }
    public static boolean checkSection9(int tab[][], int number){
//        System.out.println("------");
        int count = 0;

        for (int i = 6; i < 9; i++){
            for (int j = 6; j < 9; j++){
                if(tab[i][j] == number){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }
//        System.out.println("Nombre de " + number + " = " + count);

        return true;
    }

    public static boolean grilleValide(int[][] tab, int number){
        System.out.println("---------");
        for(int i = 0; i < 9; i++){
            if(checkcolone(tab, i, number) && checkLine(tab, i, number) && checkSection1(tab, number)
                    && checkSection2(tab, number) && checkSection3(tab, number) && checkSection4(tab, number)
                    && checkSection5(tab, number) && checkSection6(tab, number) && checkSection7(tab, number)
                    && checkSection8(tab, number) && checkSection9(tab, number)){

                return true;

            }
        }
        return false;
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

        displayGrid(boardEasy);
//        System.out.println(checkLine(boardEasy, 0, 1));
//        System.out.println(checkcolone(boardEasy, 0,8));
//        System.out.println(checkSection5(boardEasy, 9));
        System.out.println(grilleValide(boardEasy, 9));
    }
}
