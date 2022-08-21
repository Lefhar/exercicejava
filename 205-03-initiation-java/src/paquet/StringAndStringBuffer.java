package paquet;

public class StringAndStringBuffer {
	
	public StringAndStringBuffer () {
	}

	public static void main(String[] args)throws java.io.IOException{
		// construire un objet nommé m_st ( de type String), contenant " première chaîne"
		String m_st ="Première chaîne";
		
		// sortir à l'écran la longueur de la chaîne m_st
		System.out.println(m_st.length());
		
		// ajouter la chaine " , chaîne à ajouter" à la suite de buffer_de_travail
		StringBuffer buffer_de_travail = new StringBuffer(m_st);
		buffer_de_travail.append(" , chaîne à ajouter");
		System.out.println(buffer_de_travail);
		
		StringBuffer second_buffer = new StringBuffer(m_st);
		
		// second_buffer.setLength(4);
		System.out.println( " second buffer = " + second_buffer.substring(0,4) );
		  second_buffer = new StringBuffer(second_buffer.substring(0,4));
		  second_buffer.append("tototiti");
		System.out.println( " second buffer = " + second_buffer );
		
		
	
	}

}
