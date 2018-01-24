package boletin17_4;

import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class Dni {

    private char letra[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N','O', 'P', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    private int numero[] = {3, 11, 20, 9, 22, 7, 4, 18, 13, 21, 19, 5, 12, 8, 16, 1, 15, 0, 17, 2, 10, 6, 14};

    public Dni() {
    }

    public double creaNif() {
        String nif;
        nif = (JOptionPane.showInputDialog("Introduce los 6 digitos Dni : "));
        double dni = (Double.parseDouble(nif)) % 23;
        return dni;
    }

    public void calculaLetra(double dni) {
        for (int i = 0; i < numero.length; i++) {
            if (dni == numero[i]) {
                JOptionPane.showMessageDialog(null, "La letra es: " + letra[i]);
                break;
            }
        }
    }
}
