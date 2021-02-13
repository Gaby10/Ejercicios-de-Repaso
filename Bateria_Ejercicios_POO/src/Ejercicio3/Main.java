package Ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad de contraseñas.");
		int size = sc.nextInt();
		
		Password [] p = new Password[size];
		
		System.out.println("Introduzca la longitud de las contraseñas.");
		int longitud = sc.nextInt();
		
		boolean [] fuertes = new boolean[size];
		
		for (int i = 0; i < p.length; i++) {
			p[i] = new Password(longitud);
			if(p[i].esFuerte()) {
				fuertes[i] = true;
			}
		}
		
		for (int i = 0; i < p.length; i++) {
			String r = "Contraseña " + i + ": " + p[i].getContraseña();
			if(fuertes[i]) {
				r += "   -> Es fuerte.";
			} else {
				r += "   -> No es fuerte.";
			}
			System.out.println(r);
		}
		

	}

}
