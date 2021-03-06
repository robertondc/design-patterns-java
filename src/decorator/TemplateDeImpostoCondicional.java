package decorator;

public abstract class TemplateDeImpostoCondicional extends Imposto {
	
	public TemplateDeImpostoCondicional(Imposto outroImposto){
		super(outroImposto);
	}
	
	public TemplateDeImpostoCondicional() {
		super();
	}
	

	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculaOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculaOutroImposto(orcamento);
		}
	} 

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	public abstract double maximaTaxacao(Orcamento orcamento);
	public abstract double minimaTaxacao(Orcamento orcamento);

}
