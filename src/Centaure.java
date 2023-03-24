public class Centaure {
    private static final int BRAS = 2;
    private static final int PATTE = 4;
    private static int population = 0;
    public static int getPopulation() {
        return population;
    }

    public static void setPopulation(int population) {
        Centaure.population = population;
    }

    public Centaure(){
        population++;
    }

}
