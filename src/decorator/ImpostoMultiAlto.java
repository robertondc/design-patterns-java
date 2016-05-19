package decorator;

public class ImpostoMultiAlto extends Imposto {

	public ImpostoMultiAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ImpostoMultiAlto() {
		super();
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculaOutroImposto(orcamento);
	}

}
