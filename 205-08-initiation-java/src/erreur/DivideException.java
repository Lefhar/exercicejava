package erreur;

public class DivideException extends Exception{
	
	


	public DivideException()
	{
		super();
	}

	public DivideException( Throwable erreur)
	{
		super(erreur);
	}
	public DivideException(String message)
	{
		super(message);
	}

	public DivideException(String message, Throwable erreur)
	{
		super(message,erreur);
	}
}
