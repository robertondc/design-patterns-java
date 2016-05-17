package chain_of_responsability;

public class RespostaEmCSV implements Resposta {

	private Resposta proxima;

	public RespostaEmCSV(Resposta proxima) {
		this.proxima = proxima;
	}

	public RespostaEmCSV() {
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			proxima.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta proxima) {
		this.proxima = proxima;
	}

}
