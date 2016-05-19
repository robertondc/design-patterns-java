package decorator;

import java.util.ArrayList;
import java.util.List;

public class SaldoMenorCemReais extends Filtro {
	
	public SaldoMenorCemReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public SaldoMenorCemReais() {
		super();
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrados = new ArrayList<Conta>();
		for (Conta conta : contas){
			if (conta.getSaldo() < 100.0){
				filtrados.add(conta);
			}
		}
		
		filtrados.addAll(aplicaOutroFiltro(contas));
		
		return filtrados;
	}

}
