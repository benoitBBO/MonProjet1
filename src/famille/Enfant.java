package famille;

public class Enfant {
    private String nom;
    private String prenom;
    private boolean amoureux;
    public boolean isAmoureux() {
        return amoureux;
    }
    public void setAmoureux(boolean amoureux) {
        this.amoureux = amoureux;
    }
    public Enfant() {
    }
    public Enfant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public void presentation(){
        System.out.println("Bonjour je m'appelle "+this.nom+" "+this.prenom);
    }
    public void joueAuBallon(Enfant enfant){
        System.out.println(this.prenom+" joue au ballon avec "+enfant.getPrenom());
    }

    public void tomberAmoureux(Enfant enfant){
        System.out.println(this.prenom+" tombe amoureux de "+enfant.getPrenom());
        this.amoureux = true;
    }
    public void estAmoureux(){
        if (this.amoureux) {
            System.out.println(this.prenom + " est amoureux");
        }
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
