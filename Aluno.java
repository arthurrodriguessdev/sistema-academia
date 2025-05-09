package SistemaAcademia;

public class Aluno {

	String nomeAluno;
	int idadeAluno;
	double pesoAluno, alturaAluno;

	//Declaração de construtores
	public Aluno(String nomeAluno, int idadeAluno, double pesoAluno, double alturaAluno) {
		this.nomeAluno = nomeAluno;
		this.idadeAluno = idadeAluno;
		this.pesoAluno = pesoAluno;
		this.alturaAluno = alturaAluno;

	}

	//Declaração de métodos
	public double calcularImc() {
		return pesoAluno / Math.pow(alturaAluno, 2);
	}

	public void classificarImc() {
		String classificacaoPeso;


		if(calcularImc() < 18.5) {
			System.out.printf("IMC: %.2f - Abaixo do peso%n", calcularImc());
			classificacaoPeso = "Abaixo do peso";
		} else if(calcularImc() >= 18.5 && calcularImc() <= 24.9) {
			System.out.printf("IMC: %.2f - Peso normal%n", calcularImc());
			classificacaoPeso = "Peso normal";
		} else if(calcularImc() >= 25.0 && calcularImc() <= 29.9) {
			System.out.printf("IMC: %.2f - Sobrepeso%n", calcularImc());
			classificacaoPeso = "Sobrepeso";
		} else {
			System.out.printf("IMC: %.2f - Obesidade%n", calcularImc());
			classificacaoPeso = "Obesidade";
		}

		sugerirTreino(classificacaoPeso);

	}

	public String sugerirTreino(String classificacaoPeso) {
		if(classificacaoPeso.equals("Abaixo do peso")) {
			System.out.println("Plano de treino: Hipertrofia leve + dieta hipercalórica");
		} else if(classificacaoPeso.equals("Peso normal")) {
			System.out.println("Plano de treino: Treino funcional + manutenção");
		} else if(classificacaoPeso.equals("Sobrepeso")) {
			System.out.println("Plano de treino: Cardio intenso + força moderada");
		} else {
			System.out.println("Plano de treino: Cardio leve + supervisão médica");
		}

		return classificacaoPeso;

	}

	public double calcularPesoIdeal() {
		return 22 * Math.pow(alturaAluno, 2);
	}

	public double diferencaPeso() {
		return Math.abs(calcularPesoIdeal() - pesoAluno);
	}

	public void exibirPesoIdealDiferenca() {
		System.out.printf("Peso ideal: %.2f%n", calcularPesoIdeal());
		System.out.printf("Diferença: %.2f%n", diferencaPeso());
	}

	public void calcularMensalidade() {
		if(idadeAluno < 18) {
			System.out.println("Mensalidade: R$80,00");
		} else if(idadeAluno >= 18 && idadeAluno <= 59) {
			System.out.println("Mensalidade: R$100,00");
		} else {
			System.out.println("Mensalidade: R$60,00");
		}
	}

}
