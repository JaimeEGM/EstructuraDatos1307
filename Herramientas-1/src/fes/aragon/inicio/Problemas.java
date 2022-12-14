package fes.aragon.inicio;

/*import componentes.computadora.Bocina;
import componentes.computadora.Monitor;
import componentes.computadora.Mouse;
import componentes.computadora.TarjetaGrafica;
import componentes.computadora.Teclado;
import computadora.computadora;*/
import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.estaticas.Arreglos;

public class Problemas {

	public static void main(String[] args) throws IndiceFueraDeRango {

		/*
		 * computadora compu = new computadora("Apple", "MacBook", new
		 * Monitor("Toshiba", "4820-5LG", 32), new Teclado("Dell", "Negro", 104), new
		 * Mouse("MOFII", "Amarillo", "Inálambrico"), new TarjetaGrafica("NVIDIA", 1050,
		 * "4 GB", "1250MHz"), new Bocina("Sony", "SRS-XB13/BC LA", 20000));
		 * 
		 * System.out.println(compu + "\n");
		 */

		/***********************************************************************************/

		Arreglos<Auxiliar> numeros = new Arreglos<>(70);
		Arreglos<Integer> numeros2 = new Arreglos<>(70);
		int max = 99, min = 0, aux = 0;

		try {

			numeros.asignar(0, new Auxiliar((int) (Math.random() * (max - min + 1) + min)));

			for (int i = 1; i < numeros.longitud(); i++, aux = 0) {
				Integer rd = (int) (Math.random() * (max - min + 1) + min);
				for (int j = 0; j < i; j++) {
					if (rd == numeros.recupera(j).getNumero()) {
						aux += 1;
						numeros.recupera(j).setContador(aux);
					} else {
						numeros.asignar(i, new Auxiliar(rd));
					}
				}
			}

			for (int i = 0; i < numeros2.longitud(); i++) {
				numeros2.asignar(i, numeros.recupera(i).getNumero());
			}

			System.out.println("Número de repetición de los valores aleatorios: ");
			numeros.imprime();
			System.out.println(
					"******************************************************************************************************************");
			System.out.println("Los valores del intervalo de 52 y 60 son: ");
			numeros.intervalo(52, 60);
			System.out.println(
					"******************************************************************************************************************");

			System.out.println("EL valor máximo del intervalo es: " + numeros2.max());
			System.out.println("El segundo valor del máximo es: " + numeros2.segundoMax());
			System.out.println("EL valor mínimo del intervalo es: " + numeros2.min());
			System.out.println("El promedio de los valores aleatorios es: " + numeros2.promediar());

			System.out.println("Su mediana es: " + numeros2.mediana());

		} catch (IndiceFueraDeRango e) {
			// TODO: handle exception
			System.out.println(e.getMessage());

		}
	}
}