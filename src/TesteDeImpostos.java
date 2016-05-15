
public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto meuImposto = new MeuImposto();
		Imposto iccc = new ICCC();
		
		
		CalculadorDeImpostos calculadorDeImpostos =  new CalculadorDeImpostos();
		Orcamento orcamento = new Orcamento(4000.0);
		
		calculadorDeImpostos.realizaCalculo(orcamento, iss);
		calculadorDeImpostos.realizaCalculo(orcamento, icms);
		calculadorDeImpostos.realizaCalculo(orcamento, meuImposto);
		calculadorDeImpostos.realizaCalculo(orcamento, iccc);
		
	}
	
}
