
public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamentoQualquer, Imposto iss) {
		double valorImposto = iss.calcula(orcamentoQualquer);
		System.out.println(valorImposto);
	}

}
