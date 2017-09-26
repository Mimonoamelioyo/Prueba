package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
//import java.math.BigDecimal;

public class Conversor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMap<String, Float> monedas = new HashMap<String, Float>(10, (float) 0.8);
		monedas.put("Dolares", 1.17929f);
		monedas.put("Yenes", 131.824f);
		monedas.put("Libras", 0.877549f);
		monedas.put("Zlotys", 4.28343f);
		monedas.put("Soles", 3.84782f);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Introduzca moneda origen");
		String origen = br.readLine();
		String mOrigen = new String(origen);
		System.out.print("Introduzca moneda final");
		String fnal = br.readLine();
		String mFinal = new String(fnal);
		System.out.print("Introduzca cantidad");
		String numero = br.readLine();
		float cambio = new Float(0);
		float cantidad = new Float(numero);
		if (monedas.containsKey(mOrigen) & monedas.containsKey(mFinal)) {
			if (mOrigen.equals("Euros")) {
				cambio = cantidad * monedas.get(mFinal);
			} else if (mFinal.equals("Euros")) {
				cambio = cantidad / monedas.get(mOrigen);
			} else {
				cambio = cantidad * monedas.get(mFinal) / monedas.get(mOrigen);
			}
			System.out.println(cantidad + " " + mOrigen + " son al cambio " + cambio + " " + mFinal);
		} else
			System.out.println("Dichas divisas no estan disponibles");
	}

}
