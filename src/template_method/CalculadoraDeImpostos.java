package template_method;

public class CalculadoraDeImpostos {

	public double calcula(Imposto imposto, Orcamento orcamento) {
		return imposto.calcula(orcamento);
	}

}
