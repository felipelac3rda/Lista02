import java.util.Scanner;

public class questao10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 0;
		int j = 0;
		int a = 0;
		int b = 0;
		int cont = 0;

		System.out.print("Digite o teto dos pares da esquerda e direita: ");
		b = a = ler.nextInt();

		for (int c = 0; c <= 0;) {
			System.out.print(i + " - " + j + "\n");
			j++;
			if (j == b + 1) {
				j = 0;
			}
			cont++;
			if (cont == 3) {
				i++;
				cont = 0;
			}
			if (i == a + 1) {
				i = 0;
				c++;
			}
		}
	}
}
