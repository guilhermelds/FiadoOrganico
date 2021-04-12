package Fiado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Consumidor consumidor = new Consumidor();		
		consumidor.fiados = new int [10];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		consumidor.nome = scanner.nextLine();
		System.out.print("Informe o valor da compra: ");
		consumidor.fiados[0] = Integer.valueOf(scanner.nextLine());
		
		int total = somaWhile(consumidor.fiados);
		
		if (total > 100) {
			System.out.println("cliente " + consumidor.nome + " deve: " + total + " - ganhou brinde");
		} else {
			System.out.println("cliente " + consumidor.nome + " deve: " + total );
		}		
	}
	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;
	}

}
