package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
	@Override
	public List<Livre> getLivresParMotCle(String mc) {
		List<Livre> prods= new ArrayList<Livre>();
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
				prods.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prods;
	}
	@Override
	public void addLivres(Livre p) {
		// TODO Auto-generated method stub
	}
}
