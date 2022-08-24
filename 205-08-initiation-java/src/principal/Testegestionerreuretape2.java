package principal;

public class Testegestionerreuretape2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long l1= inverse(0);
		
		System.out.println(l1);
	}
	public static long inverse(long valeur)
	{
		long valeurdepart=0;
		try
		{
			valeurdepart = 100/valeur;
		}catch(ArithmeticException e)
			{
				
			System.out.println("erreur "+e.toString());
				
			}
		
		
		return valeurdepart;
	}
}
