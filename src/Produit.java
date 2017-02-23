

public class Produit {
	
private int  id_prod;
private String nom_prod ;
private int  qtt_prod;
private int  fk_id_cat;
private double prix_prod;
public Produit(int id_prod, String nom_prod, int qtt_prod, int fk_id_cat, double prix_prod) {
	super();
	this.id_prod = id_prod;
	this.nom_prod = nom_prod;
	this.qtt_prod = qtt_prod;
	this.fk_id_cat = fk_id_cat;
	this.prix_prod = prix_prod;
}
public int getId_prod() {
	return id_prod;
}
public void setId_prod(int id_prod) {
	this.id_prod = id_prod;
}
public String getNom_prod() {
	return nom_prod;
}
public void setNom_prod(String nom_prod) {
	this.nom_prod = nom_prod;
}
public int getQtt_prod() {
	return qtt_prod;
}
public void setQtt_prod(int qtt_prod) {
	this.qtt_prod = qtt_prod;
}
public int getFk_id_cat() {
	return fk_id_cat;
}
public void setFk_id_cat(int fk_id_cat) {
	this.fk_id_cat = fk_id_cat;
}
public double getPrix_prod() {
	return prix_prod;
}
public void setPrix_prod(double prix_prod) {
	this.prix_prod = prix_prod;
}



}
