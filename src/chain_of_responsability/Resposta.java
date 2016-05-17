package chain_of_responsability;

public interface Resposta {
	void responde(Requisicao req, Conta conta);
	void setProxima(Resposta proxima);
}
