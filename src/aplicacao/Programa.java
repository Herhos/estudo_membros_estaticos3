package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import utilidades.Calculadora;

// MEMBROS ESTÁTICOS 3 - Com classe auxiliar estática

public class Programa
{	
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculadora.circuferencia(raio);
		
		double v = Calculadora.volume(raio);
		
		System.out.printf("Circunferência: %.2f \n", c);
		System.out.printf("Volume: %.2f \n", v);
		System.out.printf("Valor de PI: %.2f \n", Calculadora.PI);
		
		sc.close();
	}	
}
