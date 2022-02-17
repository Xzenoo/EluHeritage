package Personne;

public class Elu extends Personne {

    private Personne assistant;

    public Elu(String nom, String prenom) {
        super(nom, prenom);

    }

    public String embaucherAssistant(Personne unePersonne){
        if (unePersonne != this.assistant){
        this.assistant = unePersonne;
        return unePersonne+" est maintenant votre assistant.";
        }
        else{
            return unePersonne+" est déjà votre assistant.";
        }
    }

    public String licencierAssistant(Personne monAssistant){
        if (monAssistant == this.assistant){
            monAssistant = null;
        return monAssistant+" est licencier";
        }
        else{
            return monAssistant+" n'est pas votre assistant";
        }
    }

    public String verserDotation(Personne monAssistant, int montant){
        if (this.assistant == this) {
            this.assistant.addSous(montant);
        return "Vous avez verser "+montant+"€ à "+monAssistant;
        }
        else{
            return "Vous ne pouvez pas verser de dotation à "+monAssistant+" car ce n'est pas votre assistant";
        }
    }

}
