package observer;

public class EnviadorDeSms implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFical) {
		System.out.println("enviando sms");
	}

}
