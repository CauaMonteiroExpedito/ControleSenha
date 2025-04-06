package Modelo;

public class Atendente extends Funcionario {

	private String turno;

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Atendente: " + getNome() +
			   "\nCPF: " + getCpf() +
			   "\nTurno: " + turno +
			   "\nSalário: R$" + String.format("%.2f", getSalario());
	}
}
