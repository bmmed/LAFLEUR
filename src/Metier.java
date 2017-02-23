 import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Metier implements IMetier {

	@Override
	public void ajoutCat(Categorie cat) {
		Connection cnx = JDBC.getConnection();
		try {
			PreparedStatement  stat = cnx.prepareStatement("INSERT INTO `categorie`(`nom_cat`) "
					+ "VALUES (?)");
			stat.setString(1, cat.getNom_cat());
			
			stat.executeUpdate();
			stat.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void ajoutProd(Produit prod) {
		Connection cnx = JDBC.getConnection();
		try {
			PreparedStatement  stat = cnx.prepareStatement("INSERT INTO `produit`"
					+ "(`nom_prod`, `prix_prod`, `qtt_prod`, `fk_id_cat`)"
					+ " VALUES (?,?,?,?)");
			
			stat.setString(1, prod.getNom_prod());
			stat.setDouble(2, prod.getPrix_prod());
			stat.setInt(3, prod.getQtt_prod());
			stat.setInt(4, prod.getFk_id_cat());
			
			stat.executeUpdate();
			stat.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Produit> rechProd(String mc) {
		
		List<Produit> resTable = new ArrayList<Produit>();
		
		Connection cnx = JDBC.getConnection();
		try {
			PreparedStatement  stat = cnx.prepareStatement("SELECT * FROM `produit`"
					+ " WHERE `nom_prod`LIKE ?");
			stat.setString(1, "%"+mc+"%");
			
			ResultSet res = stat.executeQuery();
			
			
			while(res.next())
			{
				Produit p= new Produit(0, "", 0, 0, 0);
				p.setId_prod(res.getInt(1));
				p.setNom_prod(res.getString(2));
				p.setPrix_prod(res.getDouble(3));
				p.setQtt_prod(res.getInt(4));
				p.setFk_id_cat(res.getInt(5));
				
				resTable.add(p);
				
			}
			
			stat.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resTable;
	}

	@Override
	public List<Categorie> listCat() {

		List<Categorie> resTable = new ArrayList<Categorie>();
		
		Connection cnx = JDBC.getConnection();
		try {
			PreparedStatement  stat = cnx.prepareStatement("SELECT * FROM `categorie`");
			
			ResultSet res = stat.executeQuery();
			
			
			while(res.next())
			{
				Categorie p= new Categorie(0, "");
				p.setId_cat(res.getInt(1));
				p.setNom_cat(res.getString(2));
				
				resTable.add(p);
				
			}
			
			stat.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resTable;
	}

	@Override
	public List<Produit> rechProdParCat(int idCat) {
		
		
		List<Produit> resTable = new ArrayList<Produit>();
		
		Connection cnx = JDBC.getConnection();
		try {
			PreparedStatement  stat = cnx.prepareStatement("SELECT * FROM `produit`"
					+ " WHERE `fk_id_cat` = ?");
			stat.setInt(1,idCat);
			
			ResultSet res = stat.executeQuery();
			
			
			while(res.next())
			{
				Produit p= new Produit(0, "", 0, 0, 0);
				p.setId_prod(res.getInt(1));
				p.setNom_prod(res.getString(2));
				p.setPrix_prod(res.getDouble(3));
				p.setQtt_prod(res.getInt(4));
				p.setFk_id_cat(res.getInt(5));
				
				resTable.add(p);
				
			}
			
			stat.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resTable;
	}

}
