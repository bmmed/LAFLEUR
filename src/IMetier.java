
import java.util.List;

public interface IMetier {
	
	public void ajoutCat(Categorie cat);
	
	public void ajoutProd(Produit prod);
	
	public List<Produit> rechProd(String mc);
	
	public List<Categorie> listCat();
	
	public List<Produit> rechProdParCat(int idCat);

}
