package ejercicios;

import java.util.Collections;
import java.util.Vector;

public class EjerVector{
	public static void main(String args[]) {
		Vector<String> v = new Vector<String>();
		v.addElement("Tierra"); v.addElement("Jupiter"); v.addElement("Marte"); 
		v.addElement("Venus"); v.addElement("Urano"); v.addElement("Mercurio"); 
		v.addElement("Neptuno"); v.addElement("Pluton"); v.addElement("Saturno");
	
		
		
		System.out.println("Planetas del sistema solar:");
		for(int i=0; i<v.size(); i++)
			System.out.print(v.elementAt(i)+" ");
		
		System.out.println("\nCapacidad= "+v.capacity()+"\tNumero elem= "+v.size());
		if (v.contains("Saturno")) {
			System.out.println("El vector contiene a Saturno. Posicion = "+v.indexOf("Saturno"));
		}
		else 
			System.out.println("El vector NO contiene a Saturno");
		
		Collections.sort(v);
		System.out.println("\nPlanetas ordenados:");
		for(int i=0; i<v.size(); i++)
			System.out.print(v.elementAt(i)+" ");
		System.out.println("\nPrimer elemento= "+ v.firstElement());
		System.out.println("Ultimo elemento= "+ v.lastElement());
		System.out.println("Agregando Logroño ...");
		v.insertElementAt("Logroño", v.indexOf("Tierra")+1);
		System.out.println("Elementos del vector:");
		System.out.println("*************************************************************************");
/*		for(int i=0; i<v.size(); i++)
			System.out.print(v.elementAt(i)+" ");
*/		
		for (String planeta: v)
			System.out.print(planeta +" ");
		System.out.println("\n*************************************************************************");
		System.out.println("Nueva capacidad= "+v.capacity()+"\tNuevo numero elem= "+v.size());		
		System.out.println("Ahora los borro ...");
		v.removeAllElements();
		System.out.println("Al final, capacidad= "+v.capacity()+"\tNum elem= "+v.size());
	}
}

