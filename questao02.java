package exercicios040322;

import java.util.Scanner;
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
public class questao02 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int numeroImpar=0,numeroPar=0;
		
		for(int i=0;i<10;i++) {
		
		System.out.println("digite o " + (i+1) +" �numero:");
		int numero = leia.nextInt();
				
		if(numero%2==0) {
			numeroPar++;
		}
		else {
			numeroImpar++;
			
		}
	}
		System.out.println("S�o "+numeroPar+" n�meros pares no total.");
		System.out.println("S�o "+numeroImpar+" n�meros �mpares no total.");
}
}