package ejercicios;

import java.util.StringTokenizer;
import java.io.*;

public class EjerTokenizer{
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Introduce una frase con varias palabras: ");
		String texto=br.readLine();
		
		StringTokenizer st = new StringTokenizer(texto);
		int contador = st.countTokens();
		System.out.println("Numero de palabras= "+ contador);		
		
		StringBuilder palabras[] = new StringBuilder[contador];
		int i=0;
		while(st.hasMoreTokens()){
			palabras[i] = new StringBuilder(st.nextToken());	// st.nextToken() devuelve un String
			System.out.println(palabras[i]);
			i++;
		}
		
		System.out.println("Elementos del array:");
		for (i=0; i<contador; i++)
			System.out.println(palabras[i]+" "+palabras[i].getClass());		
	}
}

