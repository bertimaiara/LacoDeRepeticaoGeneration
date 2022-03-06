package exercicios040322;

import java.util.Scanner;
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
public class questao02 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int numeroImpar=0,numeroPar=0;
		
		for(int i=0;i<10;i++) {
		
		System.out.println("digite o " + (i+1) +" ºnumero:");
		int numero = leia.nextInt();
				
		if(numero%2==0) {
			numeroPar++;
		}
		else {
			numeroImpar++;
			
		}
	}
		System.out.println("São "+numeroPar+" números pares no total.");
		System.out.println("São "+numeroImpar+" números ímpares no total.");
}
}