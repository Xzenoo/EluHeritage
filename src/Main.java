import Personne.Personne;
import Personne.Elu;

public class Main {

    public static void main(String[] args) {

        Personne personneUn = new Personne("Lallan","Francis");
        Elu EluUn = new Elu("Man","Hit");

        EluUn.embaucherAssistant(personneUn);
        EluUn.verserDotation(personneUn,1000);
        EluUn.licencierAssistant(personneUn);

    }
}
