package paquet;

import java.util.Scanner;
import java.util.ArrayList;

public class ListeTableau {

	public static void main(String[] args) {
		// on déclare le nombre de note à 0 
		double somme =0;
		
		//on déclare et initialise arrayliste
		ArrayList<Double> maListe = new ArrayList<Double>();
		Scanner Question = new Scanner(System.in);
		//on défini la réponse sur n par defaut
		String Response2="n";
	
		//on fait
		do {
			System.out.println("entrer une note");
			 double Response = Question.nextDouble();
			System.out.println("Souhaitez vous encore ajouter une réponse entrer o/n ?");
			 Response2 = Question.next();
			maListe.add(Response);
			//on boucle tant que response2 est égal à o
			} while("o".equals(Response2));
		
		//on additionne les notes
		for(int i=0;i<maListe.size();i++)
		{
			 somme += maListe.get(i);
		}
		  //on affiche la somme des notes
		  System.out.println("la moyenne est "+somme/maListe.size());
		  
		  //on récupére les notes
		   for (double number : maListe) {
		         System.out.println("la liste des notes  " + number);
		      }
		   Question.close();
	}

}
