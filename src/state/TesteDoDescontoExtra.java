package state;

public class TesteDoDescontoExtra {
	
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontoExtra(); //depende da condicao do orcamento
		
		System.out.println(reforma.valor);
		
		reforma.aprova();
		
		reforma.aplicaDescontoExtra(); 
		
		System.out.println(reforma.valor);
		
		reforma.finaliza();
		
		//reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.valor);
		
	}
	
}
