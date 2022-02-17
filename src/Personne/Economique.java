package Personne;

public class Economique extends Elu {

    public Economique(String nom, String prenom) {
        super(nom, prenom);
    }

    public String verserDotation(Personne monAssistant, int montant){
        if (this.assistant == this) {
            int montantDistribuer = 0;
            if (montant > 1480){
                montantDistribuer = 1480;
            }
            else{
                montantDistribuer = montant;
            }
            this.assistant.addSous(montantDistribuer);
            return "Vous avez verser "+montantDistribuer+"€ à "+monAssistant;
        }
        else{
            return "Vous ne pouvez pas verser de dotation à "+monAssistant+" car ce n'est pas votre assistant";
        }
    }
}
