package chain_of_responsability;

public class TesteDeDescontos {
	
	public static void main(String[] args) {
		
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orcamento orcamento =  new Orcamento(100.0);
		orcamento.adicionaItem(new Item("caneta", 250));
		orcamento.adicionaItem(new Item("lapis", 250));
		
		double valorDesconto = calculador.calcula(orcamento);
		
		System.out.println(valorDesconto);
		
	}
	
}

