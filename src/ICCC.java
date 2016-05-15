
public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double valorImposto = 0;
		double valorOrcamento = orcamento.getValor();
		if (valorOrcamento < 1000){
			valorImposto = valorOrcamento * 0.05;
		} else if (valorOrcamento >= 1000 && valorOrcamento <= 3000 ){
			valorImposto =  valorOrcamento * 0.07;
		} else if (valorOrcamento > 3000){
			valorImposto = (valorOrcamento * 0.08) + 30;
		}
		return valorImposto;
	}

}
