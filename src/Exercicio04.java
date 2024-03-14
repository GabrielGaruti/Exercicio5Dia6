//# significa que o numero nao ira ser obrigatario caso nao aparecer
//0 significa que o numero ira ser obrigatorio mesmo se nao tiver


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double salarioMinimo, qtdKw;
		double valorDoKw, valorTotal, valorComDesconto;
		DecimalFormat mascara = new DecimalFormat("0.00");
	
		System.out.print("Informe o valor do salário mínimo anual ");
		salarioMinimo = in.nextDouble();
		System.out.print("Informe o valor da quantidade de kilowat ");
		qtdKw = in.nextDouble();
		
		valorDoKw = salarioMinimo / 7 / 100;
		valorTotal = valorDoKw * qtdKw;
		valorComDesconto = valorTotal * 0.90;
		
		System.out.println("Valor do kilowatt --> R$ " + mascara.format(valorDoKw));
		System.out.println("Valor total a pagar --> R$ " + mascara.format(valorTotal));
		System.out.println("Valor total com 10% de desconto --> R$ " + mascara.format(valorComDesconto));
		
		
	}

}
