package lucatic.grupo1.service;

import java.util.Collection;
import lucatic.grupo1.model.Descarte;

public interface DescarteService {
	public void add(Descarte descarte);
	public Collection<Descarte> findAll();
}