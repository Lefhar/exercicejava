package paquet;

public class Calculatrice {
	
	

	public static String calculer(double nbr1,double nbr2, String operator) {
		
		double resultat;
		switch(operator)
		{
		case "+":
			
			resultat = nbr1+nbr2;
			break;
		case "-":
			resultat = nbr1-nbr2;
			break;
		case "*":
			resultat = nbr1*nbr2;
		case "/":
			resultat = nbr1/nbr2;
			break;
		default: 
			resultat =0;
			break;
		}
		
		return (nbr1+operator+nbr2+" = "+resultat).toString();
		
		
	}
}
