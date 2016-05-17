package strategy;

public class MeuImposto implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.9;
	}

}
