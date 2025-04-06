package Modelo;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private int senha;

	public String getNome() {
		return nome;
	}
	public void setNome(String nomeFuncionario) {
		nome = nomeFuncionario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senhaDigitada) {
		if (senhaDigitada == this.senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public abstract String toString();
}
