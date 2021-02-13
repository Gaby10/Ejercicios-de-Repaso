package Ejercicio3;

import java.util.Random;

public class Password {
	
	private int longitud = 8;
	private String contrase�a;
	
	public Password() {
		
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.generarPassword();
	}
	
	public boolean esFuerte() {
		int mayus = 0;
		int minus = 0;
		int num = 0;
		
		for (int i = 0; i < this.contrase�a.length(); i++) {
			if((this.contrase�a.charAt(i)>=65 && this.contrase�a.charAt(i)<=90) || this.contrase�a.charAt(i) == '�') {
				mayus++;
			}
			if((this.contrase�a.charAt(i)>=97 && this.contrase�a.charAt(i)<=122) || this.contrase�a.charAt(i) == '�') {
				minus++;
			}
			if(this.contrase�a.charAt(i)>=48 && this.contrase�a.charAt(i)<=57) {
				num++;
			}
		}
		
		if(mayus>=2 && minus>=1 && num>=5) {
			return true;
		}
		
		return false;
	}
	
	private void generarPassword() {
		Random r = new Random();
		String res = "";
		for (int i = 0; i < this.longitud; i++) {
			int rango = r.nextInt(3);
			int caracter;
			
			if(rango == 0) {
				caracter = r.nextInt(90+1-65)+65;
			} else if (rango == 1) {
				caracter = r.nextInt(122+1-97)+97;
			} else {
				caracter = r.nextInt(57+1-48)+48;
			}
			
			res += (char)caracter;
		}
		
		this.contrase�a = res;
	}

	public String getContrase�a() {
		return contrase�a;
	}
	
	
	
	

}
