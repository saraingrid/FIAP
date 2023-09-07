package aula_4;

public class Aluno {
	
	//atributos da classe
	private String nome;
	private String rm;
	private String cpf;
	private String curso;
	
	
	//Método Construtor
	
	public Aluno(String nome, String rm, String cpf, String curso) { //o atributo que passei no parametro existe apenas dentro do método que criei
		this.nome = nome; 
		this.rm = rm;
		this.cpf = cpf;
		this.curso= curso;
	}
	//Getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("RM: " + this.rm);
		System.out.println("CPF: " + getCpf());
		System.out.println("Nome: " + this.curso);
	}
}
