package exercicios040322;

import java.util.Scanner;

//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
//No final, mostre a soma dos n�meros digitados.(DO...WHILE)

public class questao05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, s=0;
		String resposta; {
		do {
			System.out.println("Digite um n�mero: ");
			n = leia.nextInt();
			s += n;
		} while (n!=0);
			System.out.println("A soma de todos os valores � " + s);
		}
	}
}
