package exercicios040322;

import java.util.Scanner;

//Crie um programa que leia um número do teclado até que encontre um número igual a zero.
//No final, mostre a soma dos números digitados.(DO...WHILE)

public class questao05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, s=0;
		String resposta; {
		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			s += n;
		} while (n!=0);
			System.out.println("A soma de todos os valores é " + s);
		}
	}
}
