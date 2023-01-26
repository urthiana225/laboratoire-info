package tp.bac3;

import java.util.*;

import ht.bac3.Article;

public class Article {
	
	public static void main(String[]args) {
		HashMap<Long, String> mapArticle = new HashMap<Long, String>();
		mapArticle.put(04444L, "ORDINATEUR");
		mapArticle.put(00555L,"IMPRIMANTE");
		mapArticle.put(00523L,"SOURIS");
		mapArticle.put(00525L,"TABLETTE");
		mapArticle.put(00526L,"TELEPHONE");
		mapArticle.put(00527L,"TELEPHONE");
		mapArticle.put(0012L,"ORDINATEUR");
		mapArticle.put(00223L,"ORDINATEUR");
		mapArticle.put(00533L,"IMPRIMANTE");
		mapArticle.put(01523L,"IMPRIMANTE");
		mapArticle.put(10523L,"ROUTEUR");
		mapArticle.put(20523L,"ROUTEUR SANS FIL");
		mapArticle.put(30523L,"TABLETTE");
		mapArticle.put(40523L,"CAMERA");
		mapArticle.put(50523L,"TELEPHONE");
		mapArticle.put(01513L,"ORDINATEUR");
		mapArticle.put(07523L,"TABLETTE");
		mapArticle.put(80523L,"IMPRIMANTE");
		mapArticle.put(01543L,"SOURIS");
		mapArticle.put(03323L,"CAMERA");
		mapArticle.put(02223L,"ORDINATEUR");
	
		for (Map.Entry mapentry : mapArticle.entrySet() ) {
			if(mapentry.getValue().equals("IMPRIMANTE"))
			System.out.println("clé:" +mapentry.getKey()
			+" valeur: " + mapentry.getValue()); 
}
}
}
