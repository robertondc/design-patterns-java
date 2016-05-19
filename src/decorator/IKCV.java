package decorator;

public class IKCV extends TemplateDeImpostoCondicional {
	
	public IKCV(Imposto outroImposto){
		super(outroImposto);
	}
	
	public IKCV(){
		super();
	}
	
	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}


}
