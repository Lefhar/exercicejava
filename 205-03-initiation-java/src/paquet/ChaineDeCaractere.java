package paquet;

public class ChaineDeCaractere {

	public static void main(String[] args) {
		
		String s = new String("Valeur de la chaîne");
		StringBuffer sb = new StringBuffer();
		
		//System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i=i-1)
		{
			char c = s.charAt(i);
			
			sb.append(c);
			
		}
		System.out.println("chaine de caractére à l'envers "+sb.toString());
	}

}
