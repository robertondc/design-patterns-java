package chain_of_responsability;

public class SerializadorDeContas {
	
	public void serializar(Requisicao req,Conta conta){
		
		Resposta xml = new RespostaEmXML(new RespostaEmCSV(new RespostaEmPorcento()));
		
		xml.responde(req, conta);
	}
	
}
