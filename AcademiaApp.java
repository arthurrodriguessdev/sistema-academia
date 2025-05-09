package SistemaAcademia;

import java.util.Locale;
import java.util.Scanner;

public class AcademiaApp {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String verificacao = "SIM", nomeAluno = "";
		int idadeAluno = 0;
		double pesoAluno = 0, alturaAluno = 0;

		
		while(verificacao.equals("SIM")) {
			System.out.println("--- Cadastro de aluno ---");
			System.out.print("Nome: ");
			nomeAluno = sc.nextLine();
			System.out.print("Idade: ");
			idadeAluno = sc.nextInt();
			System.out.print("Peso(Kg): ");
			pesoAluno = sc.nextDouble();
			System.out.print("Altura(m): ");
			alturaAluno = sc.nextDouble();
			
			//Criação do objeto
			Aluno aluno1 = new Aluno(nomeAluno, idadeAluno, pesoAluno, alturaAluno);

			System.out.println();
			System.out.println("--- Avaliação ---");

			aluno1.classificarImc();
			aluno1.exibirPesoIdealDiferenca();
			aluno1.calcularMensalidade();

			System.out.println();
			System.out.print("Deseja cadastrar outro aluno? [SIM/NÃO]: ");
			verificacao = sc.next().toUpperCase();
			System.out.println();
			sc.nextLine();

		}
		
		System.out.println("Obrigado por utilizar nosso sistema, até mais!");
		sc.close();
	}

}
