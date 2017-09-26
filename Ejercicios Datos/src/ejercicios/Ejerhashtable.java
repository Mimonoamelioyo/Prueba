package ejercicios;

import java.util.Hashtable;
import java.io.*;

public class Ejerhashtable {
	public static void main(String args[]) throws IOException {
		Hashtable<Integer, String> h = new Hashtable<Integer, String>(10,(float)0.8);
		h.put(1505,"APROBADO");  h.put(2800,"SUSPENSO");
		h.put(1300,"SUSPENSO");  h.put(1234,"APROBADO");
		h.put(2600,"APROBADO");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Introduzca su codigo para ver su calificacion: ");
		String cod=br.readLine();
		Integer codInteger = new Integer(cod);
		if (h.containsKey(codInteger)) {
			String califica = h.get(codInteger);
			if(califica.equals("APROBADO"))
				System.out.println("Enhorabuena. Tu calificacion es "+ califica);
			else
				System.out.println("Lo siento. Tu calificacion es "+ califica);
			return;
		}
		else
			System.out.println("Clave incorrecta");
	}
}

