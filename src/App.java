import java.util.ArrayList;
import java.util.List;

public class App {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) {

		
		
		Metier m= new Metier();
		
		/*
		Produit p =new Produit(0, "produit 01", 45, 0, 12.5);
		m.ajoutProd(p);
		
		Categorie c1 = new Categorie(0,"fluer jaune");
		m.ajoutCat(c1);
		*/
		
		List<Produit> listeProd = new ArrayList<Produit>();
		listeProd=m.rechProd("pr");
		System.out.println(" Les produit par  mot cle");
		for(Produit iProd:listeProd)
		{
			System.out.println(iProd.getId_prod()+" "+iProd.getNom_prod()+" "+iProd.getPrix_prod()
			+" "+iProd.getQtt_prod()+" "+iProd.getFk_id_cat());
		}
		
		
		List<Categorie> listeCat = new ArrayList<Categorie>();
		listeCat=m.listCat();
		System.out.println(" La liste des Categories");
		for(Categorie iCat:listeCat)
		{
			System.out.println(iCat.getId_cat()+" "+iCat.getNom_cat());
		}
		
		List<Produit> listeProd2 = new ArrayList<Produit>();
		listeProd2=m.rechProdParCat(1);
		System.out.println(" Les produit de la categorie X");
		for(Produit iProd:listeProd2)
		{
			System.out.println(iProd.getId_prod()+" "+iProd.getNom_prod()+" "+iProd.getPrix_prod()
			+" "+iProd.getQtt_prod()+" "+iProd.getFk_id_cat());
		}
		
	}

}
