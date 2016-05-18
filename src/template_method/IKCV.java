package template_method;

public class IKCV extends TemplateDeImpostoCondicional {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && possuiItemSuperior100(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
		
	private boolean possuiItemSuperior100(Orcamento orcamento) {
		for (Item item : orcamento.getItems()){
			if (item.getValor() > 100) return true;
		}
		return false;
	}

}
