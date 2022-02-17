import Personne.Personne;
import Personne.Elu;
import Personne.Mafieu;

public class Main {

    public static void main(String[] args) {

        Personne personneUn = new Personne("Lallan","Francis");
        Elu EluUn = new Elu("Man","Hit");

        EluUn.embaucherAssistant(personneUn);
        EluUn.verserDotation(personneUn,1000);
        EluUn.licencierAssistant(personneUn);

        Mafieu mafieuUn = new Mafieu("escobar","Pablo");
        Personne personneMafieu = new Personne("escobar", "pierre");

        mafieuUn.embaucherAssistantMafieux(personneMafieu);
        mafieuUn.verserDotation(personneMafieu,100);
        mafieuUn.licencierAssistant(personneMafieu);

    }
}
