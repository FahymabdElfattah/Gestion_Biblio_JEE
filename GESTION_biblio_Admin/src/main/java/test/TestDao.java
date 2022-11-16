package test;

import java.util.List;

import dao.LivreDaoImpl;
import metier.entities.Livre;
public class TestDao {

	public static void main(String[] args) {
		LivreDaoImpl pdao= new LivreDaoImpl();
		Livre prod= pdao.save(new Livre("L'Etranger","Albert Camus","Non disponible","02 / 01 / 2023","C22"));
		System.out.println(prod);
		
		List<Livre> prods =pdao.livresParMC("Antigone");
		for (Livre p : prods)
		System.out.println(p);

	}

}
