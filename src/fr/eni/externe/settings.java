package fr.eni.externe;

import java.io.IOException;
import java.util.Properties;

public class settings {
  static private Properties properties;//variable où seront récupérer et stocker les valeurs contenues dans settings.properties
  
  static {
	  try {
		  properties= new Properties();
		 // properties.load(settings.class.getResourceAsStream("settings.properties"));//va chercher le fichier settings.properties		  
		  properties.loadFromXML(settings.class.getResourceAsStream("settings.xml"));//va chercher le fichier settings.properties		  
	  }catch(IOException e) {
		  e.printStackTrace();
	  }

  }
  
  public static String getProperty(String cle) {
	  return properties.getProperty(cle);
  }
}
