package metier;

public class TrajetTrain extends Trajet 
{
	private  String villeDepart;
	private String villeArrive;
	private double distance;
	
	public TrajetTrain(String villeDepart, String villeArrive, double distance)
	{
		this.villeDepart = villeDepart;
		this.villeDepart = villeArrive;
		this.distance = distance;
	}
	
	public String getVilledepart()
	{
		return villeDepart;
	}
	
	public String getVillearrive()
	{
		return villeArrive;
	}

	public double getDistance()
	{
		return distance;
	}
}
