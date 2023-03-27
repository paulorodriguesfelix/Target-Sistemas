import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num01 = 0;
		int num02 = 1;
		int num03 = 0;
		System.out.println("==================================");
		System.out.println("CONSULTA DA SEQUÊNCIA DE FIBONACCI.");
		System.out.println("==================================");
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		while (n > num03) {
			num03 = num01 + num02;
			num01 = num02;
			num02 = num03;
		}
		if (n == 0 || n == 1) {
			System.out.println("O número faz parte da sequência de Fibonacci.");
		} else if (n == num03) {
			System.out.println("O número faz parte da sequência de Fibonacci.");
		} else {
			System.out.println("O número digitado não faz parte da sequência de Fibonacci.");
		}

		sc.close();
	}

}
