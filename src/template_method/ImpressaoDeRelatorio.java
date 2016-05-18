package template_method;

import java.util.List;

import chain_of_responsability.Conta;

public class ImpressaoDeRelatorio {

	public void imprime(Relatorio relatorio, List<Conta> contas) {
		relatorio.imprime(contas);
	}

}
