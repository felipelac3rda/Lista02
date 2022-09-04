import java.util.Scanner;

public class questao12_letra_e {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int tam;

		System.out.print("Digite o valor de linhas e colunas do desenho: ");
		tam = ler.nextInt();

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				if (i < (tam / 2)) {
					System.out.print("*");
				}
				if (i > ((tam / 2) - 1) && (((j % 2) == 0) || (j == 0))) {
					System.out.print("#");
				} else if (i > ((tam / 2) - 1) && ((j % 2) != 0)) {
					System.out.print("$");
				}

			}
			System.out.println("\n");
		}

	}
}
