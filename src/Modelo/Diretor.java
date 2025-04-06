package Modelo;

public class Diretor extends Funcionario {

	private int numeroDeDepartamentos;
	private int senha;

	public int getNumeroDeDepartamentos() {
		return numeroDeDepartamentos;
	}

	public void setNumeroDeDepartamentos(int numeroDeDepartamentos) {
		this.numeroDeDepartamentos = numeroDeDepartamentos;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int testarSenha) {
		if (testarSenha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Diretor: " + getNome() +
			   "\nCPF: " + getCpf() +
			   "\nSalário: R$" + String.format("%.2f", getSalario()) +
			   "\nDepartamentos: " + numeroDeDepartamentos;
	}
}
