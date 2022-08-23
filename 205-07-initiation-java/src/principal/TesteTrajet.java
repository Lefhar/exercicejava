package principal;

import java.util.ArrayList;
import java.util.List;

import metier.Trajet;
import metier.TrajetAvion;
import metier.TrajetTrain;

public class TesteTrajet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrajetTrain trajettrain1 = new TrajetTrain("Cain","Caen",422.3);
		TrajetTrain trajettrain2 = new TrajetTrain("Paris","Londres",1422.3);
		
		TrajetAvion trajetavion1 = new TrajetAvion("Paris","New-York",14422.3);
		TrajetAvion trajetavion2 = new TrajetAvion("Paris","Sydney",16422.3,true);
		
		
		List<Trajet> listtrajet = new ArrayList<Trajet>();
		
		listtrajet.add(trajetavion1);
		listtrajet.add(trajetavion2);
		listtrajet.add(trajettrain1);
		listtrajet.add(trajettrain2);
		double somme =0;
	  for(Trajet t : listtrajet)
	  {
		  System.out.println(t);
		  somme += t.calculerCout();
	  }
	  System.out.println("total des trajets "+somme);
	}

}
