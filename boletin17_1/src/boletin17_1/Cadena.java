
package boletin17_1;

/**
 *
 * @author andrea
 */
public class Cadena {

    public Cadena() {
    }

    public void amosar(int[] listaNumeros) {
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
        }
    }

    public void amosarReves(int[] listaNumeros) {
        for (int i = listaNumeros.length - 1; i >= 0; i--) {
            System.out.println(listaNumeros[i]);
        }
    }

    public int[] creArray() {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50) + 1;
        }
        return numeros;
    }

}
