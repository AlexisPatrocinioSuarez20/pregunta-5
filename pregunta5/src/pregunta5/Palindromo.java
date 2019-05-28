package pregunta5;
import java.util.Scanner;
public class Palindromo {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String palabra="",nuevo="";
	int j;
	System.out.println("Ingrese la palabra deseada");

	palabra=entrada.nextLine();
	
	j=palabra.length();
	char al[]=new char[j];
	for(int i=0;i<j;i++) {
		al[j-i-1]=palabra.charAt(i);
	}
	nuevo=String.valueOf(al);
	if(nuevo.equalsIgnoreCase(palabra)) {
		System.out.print("Es palíndromo");
		}
	else {
		System.out.print("No es palíndromo");
	}
}
}

