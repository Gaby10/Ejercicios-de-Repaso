package Ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre.");
		String nombre = sc.nextLine();
		
		System.out.println("Introduzca la edad.");
		int edad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca el sexo.");
		char sexo = sc.nextLine().charAt(0);
		
		System.out.println("Introduzca el peso (en kg).");
		float peso = sc.nextFloat();
		
		System.out.println("Introduzca la altura (en metros).");
		float altura = sc.nextFloat();
		sc.nextLine();
		
		Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
		Persona p2 = new Persona(nombre,edad,sexo);
		Persona p3 = new Persona();
		
		System.out.println("Introduzca el nombre.");
		p3.setNombre(sc.nextLine());
		
		System.out.println("Introduzca la edad.");
		p3.setEdad(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Introduzca el sexo.");
		p3.setSexo(sc.nextLine().charAt(0));
		
		System.out.println("Introduzca el peso (en kg).");
		p3.setPeso(sc.nextFloat());
		
		System.out.println("Introduzca la altura (en metros).");
		p3.setAltura(sc.nextFloat());
		
		Persona [] pers = new Persona[3];
		pers[0] = p1;
		pers[1] = p2;
		pers[2] = p3;
		
		for (int i = 0; i < pers.length; i++) {
			if(pers[i].esMayorDeEdad()) {
				System.out.println(pers[i].getNombre()+" es mayor de edad.");
			}
		}
		
		for (int i = 0; i < pers.length; i++) {
			System.out.println(pers[i].toString());
		}
		
	}

}
