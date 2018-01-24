/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_3;

import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class Notas_Alumnos {

    public Notas_Alumnos() {
    }

    public int[] creArrayNotas() {
        int[] notas = new int[30];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0 || notas[i] <= 10) {
                notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Nota :"));
            }
        }
        return notas;
    }

    public String[] creArrayNombres() {
        String[] nombre = new String[30];
        for (int i = 0; i < nombre.length; i++) {
            nombre[i] = JOptionPane.showInputDialog("Nombre Alumno :");
        }
        return nombre;
    }

    public void imprimirAlumno(String[] nombre, int[] notas) {
        for (int i = 0; i < nombre.length; i++) {
                System.out.println("Nombre :"+nombre[i]+(i+1) +"Notas :"+notas[i]);
        }
    }

    public void ver(int[] listaNotas) {
        for (int i = 0; i < listaNotas.length; i++) {
            System.out.println(listaNotas[i]);
        }
    }

    public void amosar(int[] listaNotas) {
        int suspenso = 0, aprobado = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            if (listaNotas[i] < 5) {
                suspenso++;
            } else {
                aprobado++;
            }
        }
        System.out.println("\nSuspensos :" + suspenso);
        System.out.println("Aprobados :" + aprobado);
    }

    public void alta(int[] listaNotas) {
        int alta = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            if (listaNotas[i] >= listaNotas[listaNotas.length]) {
                alta = listaNotas[i];
            } else {
                alta = listaNotas[listaNotas.length];
            }
            //System.out.println("La nota más alta es :" + alta);
        }
        System.out.println("La nota más alta es :" + alta);
    }

    public void media(int[] listaNotas) {
        int media = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            media += listaNotas[i];
        }
        System.out.println("La mediad la clase es :" + media / listaNotas.length);
    }

}
