package Visao;

import java.util.Scanner;
import Modelo.Gerente;
import Modelo.Analista;
import Modelo.Atendente;
import Modelo.Diretor;

public class AcessarConta {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("=== Sistema de Funcionários ===");
		System.out.println("Escolha o cargo para acessar:");
		System.out.println("1 - Gerente");
		System.out.println("2 - Analista");
		System.out.println("3 - Atendente");
		System.out.println("4 - Diretor");
		System.out.print("Opção: ");
		int opcao = entrada.nextInt();

		switch (opcao) {

			case 1:
				Gerente gerente = new Gerente();
				gerente.setNome("Cauã Expedito");
				gerente.setCpf("12345678900");
				gerente.setSalario(8500.00);
				gerente.setSenha(1234); // senha do gerente

				System.out.print("Digite a senha do gerente: ");
				int senhaG = entrada.nextInt();

				if (gerente.autentica(senhaG)) {
					System.out.println("\nDados do Gerente:");
					System.out.println(gerente);
				}
				break;

			case 2:
				Analista analista = new Analista();
				analista.setNome("Fernanda Silva");
				analista.setCpf("11122233344");
				analista.setSalario(5000.00);
				analista.setArea("TI");
				analista.setSenha(5678); // senha do analista

				System.out.print("Digite a senha do analista: ");
				int senhaA = entrada.nextInt();

				if (analista.autentica(senhaA)) {
					System.out.println("\nDados do Analista:");
					System.out.println(analista);
				}
				break;

			case 3:
				Atendente atendente = new Atendente();
				atendente.setNome("Lucas Moura");
				atendente.setCpf("22233344455");
				atendente.setSalario(2800.00);
				atendente.setTurno("Tarde");
				atendente.setSenha(2468); // senha do atendente

				System.out.print("Digite a senha do atendente: ");
				int senhaAt = entrada.nextInt();

				if (atendente.autentica(senhaAt)) {
					System.out.println("\nDados do Atendente:");
					System.out.println(atendente);
				}
				break;

			case 4:
				Diretor diretor = new Diretor();
				diretor.setNome("Mariana Lima");
				diretor.setCpf("33344455566");
				diretor.setSalario(15000.00);
				diretor.setNumeroDeDepartamentos(3);
				diretor.setSenha(4321); // senha do diretor

				System.out.print("Digite a senha do diretor: ");
				int senhaD = entrada.nextInt();

				if (diretor.autentica(senhaD)) {
					System.out.println("\nDados do Diretor:");
					System.out.println(diretor);
				}
				break;

			default:
				System.out.println("Opção inválida.");
		}

		entrada.close();
	}
}
