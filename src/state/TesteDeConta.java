package state;

public class TesteDeConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saca(100.0);
		
		System.out.println(conta.saldo);
		
		conta.deposita(200.0);
		
		System.out.println(conta.saldo);
		
		conta.saca(100);
		
		System.out.println(conta.saldo);
		
		conta.saca(10.0);
	}
	
}
