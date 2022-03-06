package exercicios040322;

import java.util.Scanner;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
public class questao03 {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int idade=0, idade21=0, idade50=0;
	while (idade<=99) {
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade<=21) {
			idade21++;
		}
		else if (idade>=50 || idade<=99) {
			idade50++;
		}
		else {
			idade50++;
			}
	}
	System.out.println("São "+idade21+" o total de pessoas com menos de 21 anos.");
	System.out.println("São "+idade50+" o total de pessoas com mais de 50 anos.");

}
}
