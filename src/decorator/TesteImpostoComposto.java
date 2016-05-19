package decorator;

public class TesteImpostoComposto {
	
	public static void main(String[] args) {
		Imposto multiAltoComposto = new ImpostoMultiAlto(new ISS(new ICMS()));
		Imposto icppComposto = new ICPP(new IKCV());
				
		Orcamento orcamento = new Orcamento(500);
		
		double valor = icppComposto.calcula(orcamento);
		
		System.out.println(valor);
	}
}
