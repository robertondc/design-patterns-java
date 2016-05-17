package chain_of_responsability;

public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento){
		
		Desconto maisDeCincoItems = new DescontoPorMaisDeCincoItems();
		Desconto maisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		Desconto vendaCasada = new DescontoPorVendaCasada();
		Desconto nenhumDesconto = new SemDesconto();
		
		maisDeCincoItems.setProximo(maisDeQuinhentosReais);
		maisDeQuinhentosReais.setProximo(vendaCasada);
		vendaCasada.setProximo(nenhumDesconto);
		
		return maisDeCincoItems.desconta(orcamento);
	}

}
