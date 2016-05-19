package decorator;

import java.util.ArrayList;
import java.util.List;

public class SaldoMaiorQuinhentosMil extends Filtro{

	public SaldoMaiorQuinhentosMil(Filtro outroFiltro){
		super(outroFiltro);
	}
	
	public SaldoMaiorQuinhentosMil() {
		super();
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrados =  new ArrayList<Conta>();
		
		for (Conta conta : contas){
			if (conta.getSaldo() > 500000) filtrados.add(conta);
		}
		
		filtrados.addAll(aplicaOutroFiltro(contas));
		
		return filtrados;
	}
	
}
