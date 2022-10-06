package fes.aragon.convertidor;

import javax.swing.JOptionPane;

public class ConversionPP {

	public static void main(String[] args) {
		String interfija = JOptionPane.showInputDialog(null, "Introduzca operacion interfija");// Primero se tiene que
																								// introducir una
																								// operación interfija
		String postfija = Convertidor.convertirApostfija(interfija);
		JOptionPane.showMessageDialog(null,
				"La operación interfija es: " + interfija + "\nExpresion en notación postfija: " + postfija);// Aqui se
																												// imprime
																												// la
																												// operacion
																												// en
																												// posfija
	}
}
