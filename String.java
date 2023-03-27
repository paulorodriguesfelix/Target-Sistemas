import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("INVERTER CARACTER DE UMA STRING");
		System.out.println("===============================");
		
		
		System.out.print("Digite uma palavra: ");
		java.lang.String palavra = sc.next();
		java.lang.String resultado = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			resultado = resultado + palavra.charAt(i);
		}
		
		
		System.out.println(resultado);
		
		
		sc.close();
	}

}
