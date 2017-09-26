package ejercicios;

import java.util.Collections;
import java.util.ArrayList;

public class EjerArrayList{
	public static void main(String args[]) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Tierra"); lista.add("Jupiter"); lista.add("Marte"); 
		lista.add("Venus"); lista.add("Urano"); lista.add("Mercurio"); 
		lista.add("Neptuno"); lista.add("Pluton"); lista.add("Saturno");
		System.out.println("Planetas del sistema solar:");
		for(int i=0; i<lista.size(); i++)
			System.out.print(lista.get(i)+" ");
		
		System.out.println("\nNumero elem= "+ lista.size());
		if (lista.contains("Saturno")) {
			System.out.println("El ArrayList contiene a Saturno. Posicion = "+ lista.indexOf("Saturno"));
		}
		else 
			System.out.println("El ArrayList NO contiene a Saturno");
		
		Collections.sort(lista);
		System.out.println("\nPlanetas ordenados:");
		for(int i=0; i<lista.size(); i++)
			System.out.print(lista.get(i)+" ");
		
		System.out.println("\nPrimer elemento= "+ lista.get(0));
		System.out.println("Ultimo elemento= "+lista.get(lista.size()-1));
		System.out.println("Agregando Logroño ...");
		lista.add(lista.indexOf("Tierra")+1, "Logroño");
		System.out.println("Elementos del ArrayList:");
		System.out.println("*************************************************************************");
/*		for(int i=0; i<lista.size();i++)
			System.out.print(lista.get(i)+" ");
*/
		for (String planeta: lista)
			System.out.print(planeta +" ");
		System.out.println("\n*************************************************************************");
		int contador = lista.size();
		System.out.println("Nuevo numero elem= "+ contador);		
		System.out.println("Ahora los borro ...");
		lista.clear();
		System.out.println("Al final, Num elem= "+ lista.size());
	}
}
