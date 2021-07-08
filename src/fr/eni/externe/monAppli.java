package fr.eni.externe;

public class monAppli {

	public static void main(String[] args) {

		System.out.println("Hello");
		System.out.println("Clé 1:"+settings.getProperty("cle1"));
		System.out.println("Autre : "+settings.getProperty("autre"));
	}

}
