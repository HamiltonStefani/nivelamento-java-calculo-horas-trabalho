package calcularhorasesalariosdefuncionarios;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorHora, salario;
		
		
	
		numero = sc.nextInt();
		
		horas = sc.nextInt();
		
		valorHora = sc.nextInt();
		
		salario = valorHora * horas;
		
		System.out.println("Números de horas: " + numero);
		System.out.printf("Salario é de :U$ %.2f%n", salario);
		
		sc.close();

	}

}
