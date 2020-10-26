package agenda.backend;

import java.util.List;

import agenda.backend.classe.Classe;

public class ItemsManager {
	
	private List<Classe> classe;

	public ItemsManager(List<Classe> classe) {
		super();
		this.classe = classe;
	}

	public List<Classe> getClasse() {
		return classe;
	}

	public void setClasse(List<Classe> classe) {
		this.classe = classe;
	}
}
