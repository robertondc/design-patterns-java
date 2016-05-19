package decorator;

import java.util.ArrayList;
import java.util.List;

public class TesteDeFiltro {

	public static void main(String[] args) {
		Filtro menosCemReais = new SaldoMenorCemReais(new SaldoMaiorQuinhentosMil());
		
		Conta conta1 = new Conta("paulo", 50.0);
		Conta conta2 = new Conta("roberto", 600000.0);
		Conta conta3 = new Conta("fabiano", 300.0);

		List<Conta> contas = new ArrayList<Conta>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		
		List<Conta> contasFiltradas = menosCemReais.filtra(contas);
		
		System.out.println(contasFiltradas);
	}
}
