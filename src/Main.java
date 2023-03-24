import famille.Enfant;

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

        /*
        Scanner sc = new Scanner(System.in);
        String[][] plateau = creerPlateau(3);
        System.out.println("Jouer contre IA random : (Y/N) ");
        String retourIA = sc.nextLine();
        System.out.println("retourIA : "+retourIA);
        boolean isIA;
        isIA = "Y".equals(retourIA);

        boolean plateauFull = false;
        boolean qqnGagne = false;
        String joueurEnCours = "X";
        while (!qqnGagne && !plateauFull){
            int entreeCol = 0;
            int entreeLigne = 0;
            if (isIA && joueurEnCours == "O") {
                int[] coupIA = rechercherCoup(plateau);
                entreeCol = coupIA[1];
                entreeLigne = coupIA[0];
            } else {
                System.out.println("Joueur " + joueurEnCours + " Entrez une valeur colonne : ");
                entreeCol = sc.nextInt();
                System.out.println(entreeCol);
                System.out.println("Joueur " + joueurEnCours + " Entrez une valeur ligne : ");
                entreeLigne = sc.nextInt();
                System.out.println(entreeLigne);
            }
            if (plateau[entreeLigne][entreeCol] == "-") {
                plateau[entreeLigne][entreeCol] = String.valueOf(joueurEnCours);
            } else {
                System.out.println("==> Erreur sur la position <==");
            }
            afficherPlateau(plateau);
            plateauFull = plateauFull(plateau);
            qqnGagne = qqnGagne(plateau, joueurEnCours);
            if (joueurEnCours == "X") {
                joueurEnCours = "O";
            } else {
                joueurEnCours = "X";
            }
        }
        if (plateauFull && !qqnGagne) {
            System.out.println("-- Match Nul");
        } else {
            System.out.println("Joueur perdant : " + joueurEnCours);
        }
        afficherPlateau(plateau);*/

        Enfant bill = new Enfant("SMITH", "Bill");
        bill.presentation();
        Enfant charlotte = new Enfant();
        charlotte.setPrenom("Charlotte");
        charlotte.presentation();
        charlotte.joueAuBallon(bill);
        charlotte.estAmoureux();
        charlotte.tomberAmoureux(bill);
        charlotte.estAmoureux();
        bill.estAmoureux();
        bill.tomberAmoureux(charlotte);
        bill.estAmoureux();
    }
    public static int[] rechercherCoup(String[][] plateau) {
        for(int i = 0; i< plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                if (plateau[i][j] == "-") {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    public static boolean plateauFull(String[][] plateau) {
        for(int i = 0; i< plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                if (plateau[i][j] == "-") {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean qqnGagne(String[][] plateau, String joueur) {
        if ((plateau[0][0] == joueur && plateau[1][0] == joueur && plateau[2][0] == joueur) ||
                (plateau[0][1] == joueur && plateau[1][1] == joueur && plateau[2][1] == joueur) ||
                (plateau[0][2] == joueur && plateau[1][2] == joueur && plateau[2][2] == joueur) ||
                (plateau[2][0] == joueur && plateau[1][1] == joueur && plateau[0][2] == joueur) ||
                (plateau[0][0] == joueur && plateau[1][1] == joueur && plateau[2][2] == joueur)) {
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
        String table = "";
        for(int i = 0; i< plateau.length; i++){
            for(int j = 0; j < plateau.length; j++) {
                table += plateau[i][j];
            }
            table += "\n";
        }
        System.out.println(table);
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