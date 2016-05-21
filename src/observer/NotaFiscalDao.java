package observer;

public class NotaFiscalDao implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFical) {
		System.out.println("savando no banco");
	}

}
