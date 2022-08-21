package paquet;

public class Intervalle {

	private int borne1;
	private int borne2;
	
	public Intervalle(int borneInf, int borneSup)
	{
		
		borne1 = borneInf;
		borne2 = borneSup;
		ordonne();
		
	}
	
	
	private void ordonne() {
		
		if(borne2<borne1)
		{
			int change = borne2;
			borne2 = borne1;		
			borne1= change;
		}
	}
	
	public int getLongueur() {
		return borne2-borne1;
	}
	
	public boolean appartient(int x)
	{
		if(x>=borne1&&x<=borne2 ) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString()
	{
		return "intervalle ["+borne1+", "+borne2+"]";
	}
}
