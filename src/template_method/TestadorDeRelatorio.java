package template_method;

import java.util.ArrayList;
import java.util.List;

import chain_of_responsability.Conta;

public class TestadorDeRelatorio {
	public static void main(String[] args) {
		
		Relatorio relatorioSimples = new RelatorioSimples();
		Relatorio relatorioComplexo = new RelatorioComplexo();
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(new Conta("roberto", 1000));
		contas.add(new Conta("paulo", 200));
		
		ImpressaoDeRelatorio impressaoRelatorio =  new ImpressaoDeRelatorio();
		impressaoRelatorio.imprime(relatorioComplexo, contas);
		
	}
}
