package paquet;

import java.util.Calendar;

public class Personne {

	private String conjoint;
	private String nom;
	private String prenom;
	private int AnneDeNaissance;
	private String sexe;
	
	public Personne(String nomPers,String prenomPers, String sexePers, int AnneDeNaissancePers) 
	{
		this.nom = nomPers;
		this.prenom = prenomPers;
		this.sexe= sexePers;
		this.AnneDeNaissance = AnneDeNaissancePers;
	}
	

	public String getGenre()
	{
		switch(sexe)
		{
		case "f":
			return "Mme";
			
		case "m":
			return "M";
			
			default:
				return "M";
			
		}
	}
	
	public int getAnneDeNaissance()
	{
		return Calendar.getInstance().get(Calendar.YEAR)- AnneDeNaissance;
	}
	
	public void setAnneDeNaissance(int AnneDeNaissance)
	{
		this.AnneDeNaissance = AnneDeNaissance;
	}
	
	public void marier(Personne p)
	{
		
	}
	
	
	public void divorce() 
	{
		
	}
}
