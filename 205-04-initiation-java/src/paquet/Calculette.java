package paquet;
import java.util.Scanner;
import static paquet.Calculatrice.*;
public class Calculette {

	public static void main(String[] args) {
		double nbr1;
		double nbr2;
		 String operator;

		 Scanner entrer= new Scanner(System.in);
		 
		 System.out.println("Entrer le premier nombre");
		 nbr1 = entrer.nextDouble();
		 System.out.println("Entrer l'opérator");
		 operator = entrer.next();
		 System.out.println("Entrer le deuxiéme nombre");
		 nbr2 = entrer.nextDouble();
		 System.out.println(calculer(nbr1,nbr2,operator));
		 
	}

}
