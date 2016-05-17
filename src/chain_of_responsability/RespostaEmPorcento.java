package chain_of_responsability;

public class RespostaEmPorcento implements Resposta {

	private Resposta proxima;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else {
			throw new RuntimeException("implementação não encontrada");
		}
	}

	@Override
	public void setProxima(Resposta proxima) {
		this.proxima = proxima;
	}

}
