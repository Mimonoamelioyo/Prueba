package ejercicios;

public class Ejercicio1 {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Vuenos dias");
		System.out.println("StringBuilder: " + sb);
		System.out.println("Capacidad=" + sb.capacity() + "\tLongitud=" + sb.length());
		sb.setCharAt(0, 'B');
		System.out.println(sb);
		int n = 20;
		sb.append(n);
		sb.append("chicos");
		System.out.println(sb);
		sb.insert(sb.indexOf("dias") + 4, "tengan");
		
		// sb.indexOf("dias")->7
		System.out.println(sb);
		sb.delete(0, 6);
		System.out.println(sb);
		String s = sb.substring(sb.length() - 4, sb.length());
		System.out.println(s);
		System.out.println("Capacidad final=" + sb.capacity() + "\tLongitud final=" + sb.length());

		StringBuilder misdatos[] = new StringBuilder[3];
		misdatos[0] = new StringBuilder("Javier");
		misdatos[1] = new StringBuilder("Rojas");
		misdatos[2] = new StringBuilder("Ostiategui");
		System.out.println(misdatos[0].toString() + ' ' + misdatos[1].toString() + ' ' + misdatos[2].toString());
		System.out.println(misdatos[0] + " " + misdatos[1] + " " + misdatos[2]);
		misdatos[0].reverse();
		System.out.println(misdatos[0]);
		
	

	}
}
