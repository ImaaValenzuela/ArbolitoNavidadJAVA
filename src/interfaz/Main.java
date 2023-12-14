package interfaz;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la altura de su arbol de navidad: ");
		int altura = sc.nextInt();
		System.out.println("Ingrese el largo del tronco: ");
		int largoTronco = sc.nextInt();
		
		
		// Arbol
		System.out.println("\n¡Aquí está tu hermoso árbol de Navidad!\n");
		for(int i = 0; i < altura; i++ ) { // Filas
		
			for(int j = 0; j < (altura - i - 1); j++) { // Espacios
				System.out.print(" ");
			}
			
			for(int k = 0; k < (i * 2) + 1; k++) { // Asteriscos
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// Tronco
		for(int i = 0; i < largoTronco; i++) { // Base
			
			for(int j = 0; j < (altura - 2); j++) { // Espacios
				System.out.print(" ");
			}
			
			for(int k = 0; k < 3; k++) { // Barras
				System.out.print("|");
			}
	
			System.out.println();
		}

		System.out.println("\n¡Feliz Navidad!");
		
		sc.close();
	}
}
