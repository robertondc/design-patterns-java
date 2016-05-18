package template_method;

import java.util.Calendar;
import java.util.List;

import chain_of_responsability.Conta;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Rua asdnasdba");
		System.out.println("Banco aaa");
	}

	@Override
	protected void rodape() {
		System.out.println(Calendar.getInstance().getTime());
		System.out.println("11 342143-34123");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta conta : contas){
			System.out.println("Nome: " + conta.getTitular() +  " Saldo: " + conta.getSaldo());
		}
	}
}
