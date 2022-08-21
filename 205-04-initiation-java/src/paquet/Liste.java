package paquet;

import java.util.Scanner;

public class Liste {

	public static void main(String[] args) {

		int nbrQuestion ;
		double somme =0;
		Scanner Question = new Scanner(System.in);
		System.out.println("Entrer le nombre de note");
		
		nbrQuestion = Question.nextInt();
		
		double TabNote[]=new double[nbrQuestion];
		for(int i=0; i<nbrQuestion;i++)
		{
			
			System.out.println("Entrer une note de la liste");
			TabNote[i]= Question.nextDouble();
		}
		
		
		for(int i=0;i<TabNote.length;i++)
		{
			somme = somme+TabNote[i];
			System.out.println(TabNote[i]+" ");
		}
		System.out.println("la somme des notes est égal à "+somme);
		Question.close();
	}

}
