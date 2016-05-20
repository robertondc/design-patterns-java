package state;

public class Conta {

	protected EstadoDaConta estado;
	protected double saldo; 

	public Conta() {
		estado =  new Positivo();
	}

	public void saca(double valor) {
		estado.saca(this, valor);
	}

	public void deposita(double valor){
		estado.deposita(this, valor);
	}
 
	
}
