package observer;

public class Multiplicador implements AcaoAposGerarNota {

	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;

	}

	@Override
	public void executa(NotaFiscal notaFical) {
		double valorMultiplicado = notaFical.getValorBruto() * fator;
		System.out.println("Multiplicador: " + valorMultiplicado);
	}

}
