package paquet;
import paquet.Personne;
public class TestePersonne {

	public static void main(String[] args) {

     Personne perso1 = new Personne("Lefebvre","Harold","h",1981);
     Personne perso2 = new Personne("Pecourt","sabrina","f",1982);
     perso1.marier(perso1);
    // perso1.divorce();
     //System.out.println(perso1.marier(perso2));
     	System.out.println(perso1.toString());
	}

}
