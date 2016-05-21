package observer;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFical) {
		System.out.println("enviado por e-mail");
	}

}
