package metier;

public class TrajetTrain extends Trajet 
{

	public TrajetTrain(String villeDepart, String villeArrive, double distance, boolean tp)
	{
		super(villeDepart,villeArrive, distance,tp);
	}
	
	public double calculerCout()
	{
		return this.getDistance();
	}
}
