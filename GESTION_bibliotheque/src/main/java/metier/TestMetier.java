package metier;

import java.util.List;
public class TestMetier {
	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<Livre> prods = metier.getLivresParMotCle("Petit");
		for (Livre p : prods)
			System.out.println(p.getNomLivre());
	}
}