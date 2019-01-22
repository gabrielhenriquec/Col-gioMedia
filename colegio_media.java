import java.util.Scanner;

public class colegio_media {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double n1, n2, med, cont = 0, contaprovados = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Informe a primeira nota:");
			n1 = leia.nextDouble();

			System.out.println("Informe a segunda nota:");
			n2 = leia.nextDouble();

			med = (n1 + n2) / 2;

			System.out.println("Sua média é: " + med);

			if (med >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("FINAL");
			}

			if (med < 3) {
				System.out.println("REPROVADO");
			}

			if (med < 3) {
				cont++;
			}
			if (med >= 7) {
				contaprovados++;
			}
		}
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("A quantidade de alunos reprovados é: " + cont);
		System.out.println("A quantidade de alunos aprovados é: " + contaprovados);
	}

}
