package chain_of_responsability;

public class RespostaEmXML implements Resposta {

	private Resposta proxima;

	public RespostaEmXML(Resposta proxima) {
		this.proxima = proxima;
	}
	
	public RespostaEmXML() {
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		} else {
			proxima.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta proxima) {
		this.proxima = proxima;
	}

}