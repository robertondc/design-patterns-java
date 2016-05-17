package chain_of_responsability;

public class TesteDeFormatos {
	public static void main(String[] args) {
		
		SerializadorDeContas serializadorDeContas = new SerializadorDeContas();
		
		Requisicao req = new Requisicao(Formato.XML);
		
		Conta conta = new Conta("roberto", 10000.0);
		
		serializadorDeContas.serializar(req, conta);
		
	}
}
