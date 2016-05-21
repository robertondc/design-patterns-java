package observer;

public class Impressora implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFical) {
		System.out.println("imprimindo nota fiscal");
	}

}
