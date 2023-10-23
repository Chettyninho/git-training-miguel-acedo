package Main;

import java.util.Scanner;

public class Mine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Haz un programa que pida al usuario las dimensiones de una matriz (2D) 
		//y cree dicha matriz con elementos char aleatorios que sean vocales mayúsculas (A, E, I, O, U).
		char[] vocales = {'A','E','I','O','U'};
		//DECLARAR LA MATRIZ//

        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();
        sc.close();
        
        //declaramos matriz con tamaño dado por el usuario
        char[][] matriz = new char[filas][columnas];

			    for(int i=0;i<(filas+2);i++){
		        for(int j=0;j<(columnas+2);j++){
		        	int aleatorio = (int)(Math.random() * vocales.length);
		            matriz[i][j]=vocales[aleatorio];    
		        	}
			    }
		    
		//pintar matriz
		for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            System.out.print(" " + matriz[i][j] + " ");
	        }
	        System.out.println(); // Cambio de línea para separar filas
	    }

	}
}