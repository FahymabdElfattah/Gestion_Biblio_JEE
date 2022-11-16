package dao;

import java.util.List;
import metier.entities.Livre;
public interface ILivreDao {
public Livre save(Livre p);
public List<Livre> livresParMC(String mc);
public Livre getlivre(Long id); public Livre updatelivre(Livre p);
public void deletelivre(Long id);
}
