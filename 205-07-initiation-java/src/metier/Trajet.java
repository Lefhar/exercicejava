package metier;

public abstract class Trajet 
{
	private  String villeDepart;
	private String villeArrive;
	private double distance;
	
	public  Trajet(String villeDepart, String villeArrive, double distance)
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
	
	public abstract double calculerCout();
	
	public String toString()
	{
		return "le trajet de "+getVilledepart()+ " à "+getVillearrive()+" distance "+getDistance();
	}

}
