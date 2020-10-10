package com.company;



public class Main {
    /**
     * Fonction pour afficher le tableau
     * @param tab Le tableau qui sera afficher
     */
    public static void displayGrid(int[][] tab){                //fonction afficher la grille
        for(int i = 0; i < tab.length; i++){                   //se déplace dans les lignes
            for(int j = 0; j < tab[i].length; j++){           // se déplace dans les colonnes
                System.out.print(tab[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * Fonction qui permet de verifier chaque ligne du tableau
     * @param tab le tableau à tester
     * @param line le numero de la ligne
     * @param number le nombre a verifier
     * @return retourne le nombre de fois que le numero chercher apparait dans cette ligne
     */
    public static boolean checkLine(int tab[][],int line, int number){     // boolean pour verifier si les contraintes d'une ligne
//        System.out.println("------");
        int count = 0;
        for (int i = 0; i < tab[line].length; i++){                     //se déplaces dans les lignes
            if(tab[line][i] == number){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }

    /**
     * fonction qui permet de verifier chaque colonne du tableau
     * @param tab le tableau à tester
     * @param colonne le numero de la colonne
     * @param number le nombre a verifier
     * @return retourne true si la colonne est valide
     */
    public static boolean checkcolone(int tab[][],int colonne, int number){   //verif colonnes
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
        return true;
    }

    /**
     * fonction qui permet de verifier si une section est valide
     * @param tab le tableau
     * @param number
     * @return retourne vrai si la section ne contient pas deux fois le meme nombre
     */
    public static boolean checkSection1(int tab[][], int number){            // verif section ( 3sur3 )
//        System.out.println("------");
        int count = 0;

        for (int i = 0; i < 3; i++){                                     //se déplace dans les lignes
            for (int j = 0; j < 3; j++){                                //se déplace dans les colonnes
                if(tab[i][j] == number){
                    count++;
                }
            }
            if (count > 1){
                return false;
            }
        }
        return true;
    }
    public static boolean checkSection2(int tab[][], int number){
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
        return true;
    }
    public static boolean checkSection3(int tab[][], int number){
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
        return true;
    }
    public static boolean checkSection4(int tab[][], int number){
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
        return true;
    }
    public static boolean checkSection5(int tab[][], int number){
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
        return true;
    }
    public static boolean checkSection6(int tab[][], int number){
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
        return true;
    }
    public static boolean checkSection7(int tab[][], int number){
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
        return true;
    }
    public static boolean checkSection8(int tab[][], int number){
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
        return true;
    }
    public static boolean checkSection9(int tab[][], int number){
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
        return true;
    }

    /**
     * fonction qui verifie la validité de toute la grille
     * @param tab le tableau à tester
     * @return retourne vrai si le tableau est valide
     */
    public static boolean grilleValide(int[][] tab){          //verif si toute la grille est valide( ligne + colonne + section )
        boolean isValid = false;
        int number = 1;
        while(number < 10) {
            for (int i = 0; i < 9; i++) {
                if (checkcolone(tab, i, number) && checkLine(tab, i, number) && checkSection1(tab, number)  //verif section+ligne+colonne
                        && checkSection2(tab, number) && checkSection3(tab, number) && checkSection4(tab, number)
                        && checkSection5(tab, number) && checkSection6(tab, number) && checkSection7(tab, number)
                        && checkSection8(tab, number) && checkSection9(tab, number)) {

                    isValid = true;              // retourne true si la grille est valid

                } else {
                    isValid = false;                //sinon retourne false
                    return isValid;
                }
            }
            number++;
        }

        return isValid;
    }

    static int tour = 0;

    /**
     * fonction qui permet de placer les nombre dans le tableau
     * @param tab tableau
     * @return retourne le tableau complet et remplis
     */
    public static boolean replaceNumber(int[][] tab){
        for (int i = 0; i < 9; i++){                                                 //se dépalce dans les ligne
            for (int j = 0; j < 9; j++){                                            // se déplace dans les colones
                if(tab[i][j] == 0){                                                // recherche les 0
                    for (int nb = 1; nb < 10; nb++){                              //fait nb++ de 1 à 9 si ils sont pas utilisée
                        tab[i][j] = nb;
                        tour++;                                                 //Calcule le nombre de test.
                        if (grilleValide(tab) && replaceNumber(tab)){
                            return true;                                      //remonte et remplace le 0 par les chiffre valide
                        }
                        tab[i][j] = 0;                                      //Met 0 si un nombre n'est pas valide
                    }
                    return false;                                         //Si aucun nombre ne fonctionne
                }
            }
        }
        return true;                                                  //retourne vrai si la grille est valide

    }

    /**
     * fonction qui execute le programme
     * @param tab la grille à résoudre
     */
    public static void play(int[][] tab){
        displayGrid(tab);
        System.out.println("------");

        long timeStart = System.currentTimeMillis();

        replaceNumber(tab);
        displayGrid(tab);

        long timeEnd = System.currentTimeMillis();
        long Time = timeEnd - timeStart;

        System.out.println("Coût pour le CPU: " + tour + " | " + "Temps de résolution: " + Time + " ms");

    }


    public static void main(String[] args) {
	// write your code here

        int[][] boardEasy = {                                          // grille donner à resoudre
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
        int[][] boardMedium = {
                {0, 7, 0, 3, 4, 0, 2, 0, 6},
                {9, 0, 0, 7, 0, 6, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 0, 0, 7, 9, 8, 6, 0},
                {0, 0, 0, 0, 0, 2, 3, 0, 4},
                {4, 0, 7, 5, 0, 8, 0, 0, 0},
                {0, 0, 0, 9, 0, 0, 0, 0, 0},
                {0, 0, 6, 0, 0, 0, 0, 1, 7},
                {5, 1, 0, 0, 8, 0, 4, 0, 2}
        };
        int[][] boardHard = {
                {0, 0, 0, 0, 0, 0, 9, 4, 0},
                {6, 0, 0, 0, 0, 0, 2, 7, 0},
                {8, 2, 0, 0, 4, 9, 6, 0, 0},
                {0, 7, 4, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 7, 6, 0, 0, 0, 0},
                {0, 6, 2, 0, 0, 5, 0, 8, 0},
                {0, 0, 0, 0, 5, 7, 0, 2, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {7, 5, 3, 2, 0, 4, 0, 0, 0}
        };
        int[][] boardGodLike = {
                {0, 0, 0, 6, 0, 2, 8, 0, 4},
                {0, 0, 0, 0, 3, 0, 0, 0, 7},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {4, 0, 6, 0, 5, 0, 3, 0, 0},
                {2, 0, 8, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 9, 1, 0},
                {1, 0, 0, 0, 0, 0, 2, 0, 0},
                {0, 7, 0, 9, 0, 0, 0, 5, 0},
                {0, 0, 2, 4, 0, 0, 0, 0, 8}
        };

        play(boardGodLike);           // joue la grille demander
    }
}
