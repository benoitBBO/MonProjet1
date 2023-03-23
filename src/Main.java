public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
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
    }
}