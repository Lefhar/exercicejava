package principal;

import erreur.DivideException;

public class Testegestionerreuretape3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        long l1;
		try {
			l1 = inverse(0);
			System.out.println(l1);
		} catch (DivideException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		
		
	}
	public static long inverse(long valeur) throws DivideException
	{
		long valeurdepart=0;
		try
		{
			valeurdepart = 100/valeur;
		}catch(ArithmeticException e)
			{
				
			//DivideException de = new DivideException("on peut pas diviser par zero ",e);
			//System.out.println(de);
			
			DivideException de1 = new DivideException(e);
			throw de1;
				
			}
		
		
		return valeurdepart;
	}
}
