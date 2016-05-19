package decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	private Filtro outroFiltro;

	public Filtro(Filtro outroFiltro){
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro(){
		this.outroFiltro = null;
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> aplicaOutroFiltro(List<Conta> contas){
		if (this.outroFiltro == null) return new ArrayList<Conta>();
		return outroFiltro.filtra(contas);
	}

}
