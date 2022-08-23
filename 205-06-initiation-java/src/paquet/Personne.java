package paquet;

import java.util.Calendar;

public class Personne {

	private Personne conjoint;
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
	
	public String getNom()
	{
		return nom;
	}

	
	public String getPrenom()
	{
		return prenom;
	}

	public String getGenre()
	{
		switch(sexe)
		{
		case "f":
			if(isMarier()) {
			return "Mme";
			}else {
			return "Mlle";
			}
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
	
	public boolean isMarier()
	{
		if(conjoint !=null && conjoint.getNom()!= getNom())
		{
			return true;
		}else {
			return false;
		}
	}
	
	public void marier(Personne p)
	{
	
			 this.conjoint=p;
			 p.conjoint=this;

		
	}
	
	public Personne getConjoint()
	{
	
			
		return conjoint;
	}
	
	public void divorce() 
	{
		if(isMarier())
		{
			this.conjoint =null;
		}
		
	}
	
	public String toString()
	{
		if(isMarier())
				{				
			return getGenre()+" "+nom+" "+prenom+" à "+getAnneDeNaissance()+" ans est Marié avec "+getConjoint().getGenre()+" " +getConjoint().getNom()+" agé de "+getConjoint().getAnneDeNaissance();


				}else {
					return getGenre()+" "+nom+" "+prenom+" est agé de "+getAnneDeNaissance()+" il est célibataire";


				}

	
	}
}
