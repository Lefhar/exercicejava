package metier;

public abstract class Trajet 
{
	private  String villeDepart;
	private String villeArrive;
	private double distance;
	
	//trajet privé ou pas
	private Boolean tp;
	
	//methode surcharge pour trajet
	public  Trajet(String villeDepart, String villeArrive, double distance)
	{
		super();
		this.villeDepart = villeDepart;
		this.villeArrive = villeArrive;
		this.distance = distance;
        this.tp=false;
		
	}
	
	//methode trajet avec trajet privé (tp)
	public  Trajet(String villeDepart, String villeArrive, double distance,Boolean tp)
	{
		super();
		this.villeDepart = villeDepart;
		this.villeArrive = villeArrive;
		this.distance = distance;

			this.tp=tp;
		
	}
	
	public Boolean getTp()
	{
		return tp;
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
		return "le trajet de "+getVilledepart()+ " a "+getVillearrive()+" distance "+getDistance();
	}

}
