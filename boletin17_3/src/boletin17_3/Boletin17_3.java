package boletin17_3;

/**
 *
 * @author acabezaslopez
 */
public class Boletin17_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notas_Alumnos nota = new Notas_Alumnos();
        Notas_Alumnos nom = new Notas_Alumnos();
        int[] listNotasDam = nota.creArrayNotas();
        String[] listAlumnos = nom.creArrayNombres();
        nota.amosar(listNotasDam);
        nota.ver(listNotasDam);
        nota.media(listNotasDam);
        //nota.alta(listNotasDam);
        nom.imprimirAlumno(listAlumnos, listNotasDam);
    }

}
