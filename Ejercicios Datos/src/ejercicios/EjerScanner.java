package ejercicios;

import java.util.Scanner;

public class EjerScanner {
	static Scanner scaner ;

	public static void main(String[] args) {
		scaner = new Scanner(System.in);
		System.out.print("Introduce varias palabras: ");
		
		while(scaner.hasNext()){
			System.out.println(scaner.next());
		}
	}
}
