package Personne;

public class Personne {

    protected String nom;
    protected String prenom;
    protected int compteBancaire;

    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom= prenom;
        this.compteBancaire = 0;
    }

    public void addSous(int montant){
        this.compteBancaire += montant;
    }

    public void retraitSous(int montant){
        this.compteBancaire -= montant;
    }
}
