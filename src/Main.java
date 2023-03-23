import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Hello world!");
        int x = 32;
        int y = 7;
        int n = x / y;
        System.out.println("valeur de n: "+n);
        Float f = new Float(n);
        int intValue= f.intValue();
        System.out.println("valeur de intValue: "+intValue);

        for(int i = 0; i<100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " divisé par 3 et 5");
            } else if (i % 7 == 0) {
                System.out.println(i + " divisé par 7");
            }
        }
        String[] table = {"toto1", "toto2", "toto3"};
        String[] table2 = new String[3];
        System.out.println("valeur de table: " + Arrays.toString(table));
        System.out.println("valeur de table: " + Arrays.toString(table2));
        table2[1] = "tutu1";
        System.out.println("valeur de table: " + Arrays.toString(table2));
        int result = additionner(5,2);
        System.out.println("valeur de table: "+result);
        result = entiere(5,2);
        System.out.println("valeur de table: "+result);
        diviser(5,0);
        int i = 0;
        while (i == 0) {
            System.out.println("je boucle");
        }

        System.out.println("resultat : "+factorielle(5));
        dessinerRectangle(5,3);*/

        String[][] plateau = creerPlateau(3);
        String joueurEnCours = "X";
        Scanner sc = new Scanner(System.in);
        while (!qqnGagne(plateau)){
            afficherPlateau(plateau);
            System.out.println("Entrez une valeur ligne : ");
            int entreeLigne = sc.nextInt();
            System.out.println(entreeLigne);
            System.out.println("Entrez une valeur colonne : ");
            int entreeCol = sc.nextInt();
            System.out.println(entreeCol);
            plateau[entreeLigne][entreeCol] = String.valueOf(joueurEnCours);
            if (joueurEnCours == "X") {
                joueurEnCours = "O";
            } else {
                joueurEnCours = "X";
            }
        }
        System.out.println("Joueur perdant : "+joueurEnCours);
        afficherPlateau(plateau);

    }
    public static boolean qqnGagne(String[][] plateau) {
        if ((plateau[0][0] == "X" && plateau[1][0] == "X" && plateau[2][0] == "X") ||
                (plateau[0][1] == "X" && plateau[1][1] == "X" && plateau[2][1] == "X") ||
                (plateau[0][2] == "X" && plateau[1][2] == "X" && plateau[2][2] == "X") ||
                (plateau[0][0] == "X" && plateau[1][1] == "X" && plateau[2][2] == "X")) {
            return true;
        }
        if ((plateau[0][0] == "O" && plateau[1][0] == "O" && plateau[2][0] == "O") ||
                (plateau[0][1] == "O" && plateau[1][1] == "O" && plateau[2][1] == "O") ||
                (plateau[0][2] == "O" && plateau[1][2] == "O" && plateau[2][2] == "O") ||
                (plateau[0][0] == "O" && plateau[1][1] == "O" && plateau[2][2] == "O")) {
            return true;
        }
        return false;
    }
    public static String[][] creerPlateau(int taille) {
        String[][] plateau = new String[taille][taille];
        for(int i = 0; i< plateau.length; i++){
            for(int j = 0; j < plateau.length; j++) {
                plateau[i][j] = "-";
            }
        }
        return plateau;
    }
    public static void afficherPlateau(String[][] plateau) {
        String ligne = "";
        for(int i = 0; i< plateau.length; i++){
            for(int j = 0; j < plateau.length; j++) {
                ligne += plateau[i][j];
            }
            ligne += "\n";
        }
        System.out.println(ligne);
    }
    public static void dessinerRectangle (int longueur, int largeur) {
        String ligne = "";
        for(int i = 0; i<largeur; i++){
            for(int j = 0; j <longueur; j++){
                ligne += "0";
            }
            ligne += "\n";
        }
        System.out.println(ligne);
    }
    private static int factorielle (int limite) {
        int resultat = 1;
        for (int i = 2; i <= limite; i++) {
            resultat = resultat*i;
        }
        return resultat;
    }
    /**
     * test de javadoc
     * @param a
     * @param b
     * @return sommme
     */
    public static int additionner(int a, int b) {
        return a + b;
    }
    public static int entiere(int a, int b) {
        return a / b;
    }
    public static int diviser(int a, int b) {
        if (b == 0) {
            System.out.println("diviseur vaut 0");
        }
        return a / b;
    }

}