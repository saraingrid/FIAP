package aula_4;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Sasah", "rm123", "123.321.123-23", "ADS");
		aluno.exibirDados();
		
		System.out.println("=======================================");
		
		//("Rachel", "rm123", "123.321.123-23", "ADS");
		
		Aluno a2 = new Aluno(); 
		a2.exibirDados();
		a2.setNome("José");
		a2.setRm("rm123");
		a2.exibirDados();
	}
}

