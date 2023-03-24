public class Maison implements AvecClimatisation, AvecChauffage {
    public Maison(int temperature) {
        this.temperature = temperature;
    }

    private int temperature;

    @Override
    public void chauffer() {
        this.temperature++;
    }

    @Override
    public void refroidir() {
        this.temperature--;
    }
}
