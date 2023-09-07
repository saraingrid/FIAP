package aula_4;

public class CriarConta {

	private String titular;
	private String agencia;
	private String conta;
	private float saldo;
	
	//Método construtor
	
	public CriarConta (String titular, String agencia, String conta) {
	this.titular = titular;
	this.agencia = agencia;
	this.conta = conta;
	
}
	//getters and setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
			
	}
	
	public float getSaldo() {
	return saldo;
	
	}
	

	//métodos operacionais
	
	public float depositar(float valor) {
		this.saldo += valor; //count = saldo + valor
		return saldo;
		
	}	
	
	public float sacar(float valor) {
		this.saldo -= valor; //saldo = saldo - valor
		return saldo;
	}	
	public void exibirDados() {
	System.out.println("titular: " + getTitular());
	System.out.println("agencia: " + getAgencia());
	System.out.println("conta: " + getConta());
	System.out.println("saldo: " + getSaldo());
	}
	

}
