package metier;

public class TrajetTrain extends Trajet 
{

	public TrajetTrain(String villeDepart, String villeArrive, double distance)
	{
		super(villeDepart,villeArrive, distance);
	}
	
	public double calculerCout()
	{
		return this.getDistance();
	}
}
