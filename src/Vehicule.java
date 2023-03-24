public class Vehicule {
    int nbRoue;
    public Vehicule(int nbRoue) {
        this.nbRoue = nbRoue;
    }
    public void direBonjour(){
        System.out.println("Bonjour, je suis un vehicuile à "+this.nbRoue+" roues");
    }
    @Override
    public String toString(){
        return "Bonjour, je suis un vehicuile à "+this.nbRoue+" roues";
    }
}
