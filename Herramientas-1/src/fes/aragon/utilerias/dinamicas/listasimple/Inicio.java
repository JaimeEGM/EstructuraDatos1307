package fes.aragon.utilerias.dinamicas.listasimple;

public class Inicio {
	public static void main(String[] args) {
		ListaSimple<Integer> datos = new ListaSimple<>();
		datos.agregarEnCabeza(34);
		datos.agregarEnCabeza(12);
		datos.agregarEnCabeza(90);
		datos.imprimirElementos();
	}
}
