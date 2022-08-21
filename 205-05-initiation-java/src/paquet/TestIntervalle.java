package paquet;

import java.util.Scanner;

public class TestIntervalle {

	public static void main(String[] args) {
		
		Intervalle testeintervalle= new Intervalle(-5,21);
		Scanner sc = new Scanner(System.in);
		 System.out.printf("Entrer un entier");
		 int x = sc.nextInt();
		 System.out.println(x+" a une longueur d'intervalle de "+testeintervalle.getLongueur());
		 System.out.println(x+" a une longueur d'intervalle de "+testeintervalle.toString());
		 
		 if(testeintervalle.appartient(x))
		 {
			 System.out.println(x+ " appartient à l'interval");
		 }else {
			 System.out.println(x+ " appartient pas à l'interval"); 
		 }
		 
		 sc.close(); 
	}
	

}
