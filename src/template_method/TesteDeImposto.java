package template_method;

public class TesteDeImposto {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(1000);
		orcamento.adicionaItem(new Item("lapis", 100.0));
		orcamento.adicionaItem(new Item("caneta", 200.0));
		
		Imposto icpp =  new ICPP();
		Imposto ikcv =  new IKCV();
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos(); 
		
		double valorImposto = calculadora.calcula(ikcv, orcamento);
		
		System.out.println(valorImposto);
		
	}
	
}
