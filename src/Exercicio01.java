import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		// variáveis
		Scanner teclado = new Scanner(System.in);
		double base, altura;
		double area, perimetro;
		
		// entrada de dados
		System.out.print("Informe o valor da base --> ");
		base = teclado.nextDouble();
		System.out.print("Informe o valor da altura --> ");
		altura = teclado.nextDouble();
		
		// processamento de dados
		area = base * altura;
		perimetro = 2 * (base + altura);
		
		// saída de dados
		System.out.println();
		System.out.println("área do retângulo --> " + area);
		System.out.println("perímetro do retângulo --> " + perimetro);

	}
}
