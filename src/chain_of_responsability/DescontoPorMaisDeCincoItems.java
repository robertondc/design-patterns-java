package chain_of_responsability;

public class DescontoPorMaisDeCincoItems implements Desconto{

	private Desconto proximoDesconto;

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItems().size() > 5 ){
			return orcamento.getValor() * 0.1; 
		}
		return proximoDesconto.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

}
