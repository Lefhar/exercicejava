package paquet;

import semaine.JourDeLaSemaine;

public class Premiere {

	public static void main(String[] args) {
		   //entier
		    byte b = 12;
		    short s= 65;
		    int i =876;
		    long l = 13573;
		    int i2 =8;
		    System.out.println(b);
		    System.out.println(s);
		    System.out.println(i);
		    System.out.println(l);
		    System.out.println(i2);
		    //un seul caractére
			char variables1;
			char variables2;
			char variables3;
			
			variables1 = 'c';
			variables2 = '\n';
			variables3 = '9';
			 System.out.println(variables1);
			 System.out.println(variables2);
			 System.out.println(variables3);
			double reel1 = 123.6754;
			double reel2;
			double reel3;
			
			//chaîne de caractére
			String chaine ="Voici une belle chaîne";
			 System.out.println(chaine);
			//initiation de JourDeLaSemaine
			JourDeLaSemaine jour = JourDeLaSemaine.Lundi;
			 System.out.println(jour);
	}

}
