package metier;
import java.io.Serializable;

public class Livre implements Serializable {
	private Long idLivre ;
	private String nomLivre ;
	private String nomAuteur ;
	private String despo ;
	private String dateDespo ;
	private String etage;
	
	public Livre() {
		super();
	}
	
	public Livre(String nomLivre, String nomAuteur,String despo,String dateDespo,String etage) {
		super();
		this.nomLivre = nomLivre;
		this.nomAuteur = nomAuteur;
		this.despo = despo;
		this.dateDespo = dateDespo;
		this.etage= etage;
		}
	
	public Long getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(Long idLivre) {
		this.idLivre = idLivre;
	}
	public String getNomLivre() {
		return nomLivre;
	}
	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}
	public String getNomAuteur() {
		return nomAuteur;
	}
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	public String getDespo() {
		return despo;
	}
	public void setDespo(String despo) {
		this.despo = despo;
	}
	public String getDateDespo() {
		return dateDespo;
	}
	public void setDateDespo(String dateDespo) {
		this.dateDespo = dateDespo;
	}
	public String getEtage() {
		return etage;
	}
	public void setEtage(String etage) {
		this.etage = etage;
	}
	

}
