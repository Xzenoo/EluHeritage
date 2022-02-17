package Personne;

import java.util.Objects;

public class Mafieu extends Elu {


    public Mafieu(String nom, String prenom) {
        super(nom, prenom);
    }

    public String embaucherAssistantMafieux(Personne unePersonne){
        if (unePersonne != this.assistant && Objects.equals(this.assistant.nom, this.nom)){
            this.assistant = unePersonne;
            return unePersonne+" est maintenant votre assistant.";
        }
        else{
            return unePersonne+" est déjà votre assistant.";
        }
    }

}
