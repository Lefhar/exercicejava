package metier;

public class TrajetAvion extends Trajet 
{

	public TrajetAvion(String villeDepart, String villeArrive, double distance, boolean tp)
	{
		super(villeDepart,villeArrive, distance,tp);
	}
	
	

	public double calculerCout()
	{
		if(this.getTp()) {
			return ((this.getDistance()*100)*2);
		}else {
			return (this.getDistance()*100);
		}
		
	}
}
