package Personne;

public class Escroc extends Elu{


    public Escroc(String nom, String prenom) {
        super(nom, prenom);
    }

    public String verserDotationEscroc(Personne monAssistant, int montant){
        int montantDistribuer = 0;
        int compteSuisseDistrib = 0;
        int argentEscroquer;
        if (this.assistant == this) {

            if (montant > 1480){
                montantDistribuer = 1480;
                argentEscroquer = montant - 1480;
                compteSuisseDistrib = compteSuisseDistrib + montant;
            }
            else{
                montantDistribuer = montant;
            }
            this.assistant.addSous(montantDistribuer);
            return "Vous avez verser "+montantDistribuer+"€ à "+monAssistant+" /n Votre Compte en Suisse à une somme de "+compteSuisseDistrib+"€";
        }
        else{
            return "Vous ne pouvez pas verser de dotation à "+monAssistant+" car ce n'est pas votre assistant /n Votre Compte en Suisse à une somme de "+compteSuisseDistrib+"€";
        }
    }
}
