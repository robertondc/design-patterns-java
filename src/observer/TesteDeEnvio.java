package observer;

public class TesteDeEnvio {
	
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Multiplicador(0.5));
		
		NotaFiscal nota = builder.comItem(new ItemDaNota("lapis", 10.0))
		
		.comItem(new ItemDaNota("caneta", 20.0))
		.comObservacoes("dashakshd")
		.constroi();
	
		
	}
}
