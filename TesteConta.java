package aula_4;

public class TesteConta {

	public static void main(String[] args) {
		
		CriarConta c1 = new CriarConta("Cliente 1", "1234-5", "1234-2");
		c1.exibirDados();
		c1.depositar(500);
		System.out.println("Saldo: " + c1.getSaldo());
		c1.depositar(2000);
		System.out.println("Saldo: " + c1.getSaldo());
		c1.sacar(300);
		System.out.println("Saldo: " + c1.getSaldo());
		c1.exibirDados();
	}
}

            