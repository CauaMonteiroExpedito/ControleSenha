package Modelo;

public class Analista extends Funcionario {

	private String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Analista: " + getNome() +
			   "\nCPF: " + getCpf() +
			   "\nÁrea: " + area +
			   "\nSalário: R$" + String.format("%.2f", getSalario());
	}
}
