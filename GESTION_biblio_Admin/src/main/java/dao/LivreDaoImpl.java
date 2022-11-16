package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.SingletonConnection;
import metier.entities.Livre;

public class LivreDaoImpl implements ILivreDao {

	@Override
	public Livre save(Livre p) {
		 Connection conn=SingletonConnection.getConnection();
	       try {
			PreparedStatement ps= conn.prepareStatement("INSERT INTO LIVRES (NOM_LIVRES,NOM_AUTEUR,DESPO,DAT_DESPO,ETAGE) VALUES(?,?,?,?,?)");
			ps.setString(1, p.getNomLivre());
			ps.setString(2, p.getNomAuteur());
			ps.setString(3, p.getDespo());
			ps.setString(4, p.getDateDespo());
			ps.setString(5, p.getEtage());
			
			ps.executeUpdate();
			
			
			PreparedStatement ps2= conn.prepareStatement
					("SELECT MAX(ID_LIVRES) as MAX_ID FROM LIVRES");
			ResultSet rs =ps2.executeQuery();
			if (rs.next()) {
				p.setIdLivre(rs.getLong("MAX_ID"));
			}
			ps.close();
			ps2.close();
				 
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<Livre> livresParMC(String mc) {
	      List<Livre> livs= new ArrayList<Livre>();
	       Connection conn=SingletonConnection.getConnection();
	       try {
			PreparedStatement ps= conn.prepareStatement("select * from LIVRES where NOM_LIVRES LIKE ?");
			ps.setString(1, "%"+mc+"%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Livre p = new Livre();
				
				p.setIdLivre(rs.getLong("ID_LIVRES"));
				p.setNomLivre(rs.getString("NOM_LIVRES"));
				p.setNomAuteur(rs.getString("NOM_AUTEUR"));
				p.setDespo(rs.getString("DESPO"));
				p.setDateDespo(rs.getString("DAT_DESPO"));
				p.setEtage(rs.getString("ETAGE"));
				
				livs.add(p);								
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

			return livs;
	}

	@Override
	public Livre getlivre(Long id) {
		    
		   Connection conn=SingletonConnection.getConnection();
		    Livre p = new Livre();
	       try {
			PreparedStatement ps= conn.prepareStatement("select * from LIVRES where ID_LIVRES = ?");
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if  (rs.next()) {
				
				p.setIdLivre(rs.getLong("ID_LIVRES"));
				p.setNomLivre(rs.getString("NOM_LIVRES"));
				p.setNomAuteur(rs.getString("NOM_AUTEUR"));
				p.setDespo(rs.getString("DESPO"));
				p.setDateDespo(rs.getString("DAT_DESPO"));
				p.setEtage(rs.getString("ETAGE"));
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			return p;
	}

	@Override
	public Livre updatelivre(Livre p) {
		Connection conn=SingletonConnection.getConnection();
	       try {
			PreparedStatement ps= conn.prepareStatement("UPDATE LIVRES SET NOM_LIVRES=?,NOM_AUTEUR=?,DESPO=?,DAT_DESPO=?,ETAGE=? WHERE ID_LIVRES=?");
			ps.setString(1, p.getNomLivre());
			ps.setString(2, p.getNomAuteur());
			ps.setString(3, p.getDespo());
			ps.setString(4, p.getDateDespo());
			ps.setString(5, p.getEtage());
			ps.setLong(6, p.getIdLivre());
			ps.executeUpdate();
			ps.close();
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public void deletelivre(Long id) {
		 Connection conn=SingletonConnection.getConnection();
	       try {
			PreparedStatement ps= conn.prepareStatement("DELETE FROM LIVRES WHERE ID_LIVRES = ?");
			ps.setLong(1, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
