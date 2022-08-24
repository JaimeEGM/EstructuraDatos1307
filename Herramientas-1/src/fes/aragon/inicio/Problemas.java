package fes.aragon.inicio;

import java.util.Random;
import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.estaticas.Arreglos;

public class Problemas {
	public static void main(String[] args) throws IndiceFueraDeRango {
		Arreglos<Integer> numeros = new Arreglos<>(10);
		new Random();
		int max = 100, min = 1;
		int aux = 0;
		for (int i = 0; i < numeros.longitud(); i++) {
			numeros.asignar(i, 0);
		}
		for (int i = 0; i < numeros.longitud(); i++) {
			numeros.asignar(i, (int) (Math.random() * (max - min) + 1));
			numeros.imprime();
		}
		for (int i = 0; i < numeros.longitud(); i++) {
			for (int j = 0; j < numeros.longitud(); j++) {
				if (numeros.recupera(j) > aux) {
					aux = numeros.recupera(j);
				}
			}
			System.out.println(aux);
		}
	}

}
