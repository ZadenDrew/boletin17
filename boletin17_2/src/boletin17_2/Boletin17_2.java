
package boletin17_2;

/**
 *
 * @author andrea
 */
public class Boletin17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notas_Alumnos nota = new Notas_Alumnos();
        int[] listNotasDam = nota.creArrayNotas();
        nota.amosar(listNotasDam);
        nota.ver(listNotasDam);
        nota.media(listNotasDam);
        //nota.alta(listNotasDam);
    }
    
}
