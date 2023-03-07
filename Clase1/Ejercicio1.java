package Ejercicios;

import java.util.Scanner;




public class Ejercicio1 {
	Scanner sc = new Scanner(System.in);
	int var1 = 1;
	int var2 = 10;

	
	public void mostrarNums() {
		if(var1 > var2) {
			int aux = var1;
			var1 = var2;
			var2 = aux;
		}
		
		while(var1 < var2) {
			System.out.println(var1);
			var1 = var1 + 1;
		}
	}
	
	public void mostrarPares() {
		System.out.println("Ingrese el primer valor");
		var1 = sc.nextInt();	
		System.out.println("Ingrese el segundo valor");
		var2 = sc.nextInt();
		if(var1 > var2) {
			int aux = var1;
			var1 = var2;
			var2 = aux;
		}
		
		while(var1 < var2) {
			if(var1 % 2 == 0) {
				System.out.println("El siguiente numero es par \n");
				System.out.println(var1);
			}
			var1 = var1 + 1;
		}
	}
	
	public void mostrarSegunVariable() {
		boolean var;
		System.out.println("1 para pares cualquier otra tecla para impares");
		var = (1 == sc.nextInt());
			
		if(var1 > var2) {
			int aux = var1;
			var1 = var2;
			var2 = aux;
		}
		
		while(var1 < var2) {	
			if(var) {
				if(var1 % 2 == 0) {
					System.out.println("El siguiente numero es par");
					System.out.println(var1);
				}
			}else{
				if(var1 % 2 != 0) {
					System.out.println("El siguiente numero es impar");
					System.out.println(var1);
				}
			}
			
			var1 = var1 + 1;
		}
	}
	
	public void mostrarParesInvertidos() {
		System.out.println("Ingrese el primer valor");
		var1 = sc.nextInt();	
		System.out.println("Ingrese el segundo valor");
		var2 = sc.nextInt();
		if(var1 > var2) {
			int aux = var1;
			var1 = var2;
			var2 = aux;
		}
		
		for (int i = var2; i >= var1; i--) {	
			if(i%2 ==0) {
				System.out.println("Este numero es par:");
				System.out.println(i);
			}
		}
		
	}
	
}
