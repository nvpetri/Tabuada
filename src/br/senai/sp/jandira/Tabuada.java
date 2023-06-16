package br.senai.sp.jandira;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valorMultiplicando, valorMinimo, valorMaximo, valor, resultado;
		
		System.out.println("****************************************");
		System.out.println("           T A B U A D A");
		System.out.println("****************************************");
		System.out.println();
		System.out.print("Digite o multiplicando: ");
		valorMultiplicando = teclado.nextInt();
		
		System.out.println();
		System.out.print("Digite o multiplicador inicial: ");
		valorMinimo = teclado.nextInt();
		
		System.out.println();
		System.out.print("Digite o multiplicador máximo: ");
		valorMaximo = teclado.nextInt();
		
		valor = valorMinimo;
		
		if(valorMaximo >= valor){
			
			while(valor <= valorMaximo) {
				resultado = valorMultiplicando * valor;
				System.out.println(valorMultiplicando + " x " + valor + " = " + resultado);
				valor ++;
				}
			}else {
				while(valor >= valorMaximo) {
					resultado = valorMultiplicando * valorMaximo;
					System.out.println(valorMultiplicando + " x " + valorMaximo + " = " + resultado);
					valorMaximo ++;
					}
			
		}
	}

}
