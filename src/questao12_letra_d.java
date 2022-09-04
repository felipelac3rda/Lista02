import java.util.Scanner;

public class questao12_letra_d {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int tam;

		System.out.print("Digite o valor de linhas e colunas do desenho: ");
		tam = ler.nextInt();

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				if ((i == 0) || (i == tam - 1) || (j == 0) || (j == tam - 1)) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}

			}
			System.out.println("\n");
		}

	}
}
