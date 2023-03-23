import java.util.ArrayList;
import java.util.Arrays;

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
        System.out.println("valeur de table: " + Arrays.toString(table2));*/
        int result = additionner(5,2);
        System.out.println("valeur de table: "+result);
        result = entiere(5,2);
        System.out.println("valeur de table: "+result);
    }
    public static int additionner(int a, int b) {
        return a + b;
    }
    public static int entiere(int a, int b) {
        return a / b;
    }
}