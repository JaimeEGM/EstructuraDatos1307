package fes.aragon.palindromo;

import java.util.Stack;
import fes.aragon.utilerias.dinamicas.pila.Pila;

//Un palindromo es cuando una palabra se lee igual al derecho y al revés. ejemplo: Aana, oso, Amor a Roma, Rotor, etc.

public class PalindromoMain {

	public static void main(String[] args) {
		System.out.println(esPalindromo("CHICLE")); // false
		System.out.println(esPalindromo("ANA")); // TRUE
		System.out.println(esPalindromo("RECONOCER")); // true
	}

	static boolean esPalindromo(String palabra) {

		Stack<Character> pila = new Stack<Character>();

		for (int i = 0; i < palabra.length(); i++) {
			pila.push(palabra.charAt(i));
			System.out.println(pila);
		}

		String desapilada = "";
		while (!pila.empty()) {
			desapilada += pila.pop();
		}

		System.out.println(desapilada); // Sale la palabra al revés si no es palindromo

		return palabra.equals(desapilada);

	}

}
