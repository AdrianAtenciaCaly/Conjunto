/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaDeConjuntosDefinidos;

import static TeoriaDeConjuntosDefinidos.CrearConjuntoADefinido.modelList;
import static TeoriaDeConjuntosDefinidos.CrearConjutoADefinido.conjuntoADefinido;
import static TeoriaDeConjuntosDefinidos.CrearConjutoADefinido.j;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian AC
 */
public class CrearConjutoBDefinido extends CrearConjuntoBDefinido {

    public static ArrayList<Integer> conjuntoBDefinido = new ArrayList<Integer>();
    static int c = 0, j = 0;

    public static void Multiplo(int numero) {

        for (int i = 1; i < numero; i++) {
            if (i % 6 == 0) {
                conjuntoBDefinido.add(i);
                c++;
                j++;
            }
        }
        JOptionPane.showMessageDialog(null, "Creado Multiplo", "Aviso¡", JOptionPane.WARNING_MESSAGE);
    }

    public static void Primo(int numero) {
        for (int i = 1; i < numero; i++) {
            int cout = 0;
            for (int j = 1; j < numero; j++) {
                if (i % j == 0) {
                    cout++;
                }
            }
            if (cout == 2) {
                conjuntoBDefinido.add(i);
                c++;
                j++;
            }
        }
        JOptionPane.showMessageDialog(null, "Creado Primo", "Aviso¡", JOptionPane.WARNING_MESSAGE);

    }

    public static void Divisor(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {

                conjuntoBDefinido.add(i);
                c++;
                j++;
            }
        }
        JOptionPane.showMessageDialog(null, "Creado Divisor", "Aviso¡", JOptionPane.WARNING_MESSAGE);

    }
      public static void Ecuacion2doGrado(int numero) {
        for (int i = 0; i < numero; i++) {
           // System.out.println(Ecuacion(i));
           conjuntoBDefinido.add(Ecuacion(i));
           j++;
        }
         JOptionPane.showMessageDialog(null, "Creado Ecucuacion de 2do grado", "Aviso¡", JOptionPane.WARNING_MESSAGE);
    }
       public static void EcuacionLineal(int numero) {
        for (int i = 0; i < numero; i++) {
            // System.out.println(Ecuacion(i));
            conjuntoBDefinido.add(Ecuacionlineal(i));
            j++;
        }
        JOptionPane.showMessageDialog(null, "Creado Ecucuacion Lineal", "Aviso¡", JOptionPane.WARNING_MESSAGE);

    }

    public static int Ecuacionlineal(int x) {
        return 4 * (x + 10) - 6 * (2 - x) - 6 * x;
    }

    public static int Ecuacion(int x) {
        return (int) (Math.pow(4 * x, 2) - 4 * x + x+2);
    }

     public static void Mostrar() {
        int i = 0;
        Clear();
        if (conjuntoBDefinido.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha creado una el conjunto B", "Aviso¡", JOptionPane.WARNING_MESSAGE);
        } else {
            Iterator<Integer> it = conjuntoBDefinido.iterator();
            while (it.hasNext()) {
                modelList.addElement(i + ": " + it.next() + "\n");
                i++;
                j = i;
            }
        }
    }

    public static void Modificar() {
        int posicion, elemento;
        Mostrar();
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar"));
        if (posicion > conjuntoBDefinido.size()) {
            JOptionPane.showMessageDialog(null, "Ingrese una posicion corecta");
        } else {
            System.out.println("Nuevo elemento");
            elemento = Integer.parseInt(JOptionPane.showInputDialog("Nuevo elemento"));
            conjuntoBDefinido.set(posicion, elemento);
            Mostrar();
        }
    }

    public static void Eliminar() {
        int posicion;
        Mostrar();
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar"));
        if (posicion > conjuntoBDefinido.size()) {
            JOptionPane.showMessageDialog(null, "Ingrese una posicion corecta");
        } else {
            conjuntoBDefinido.remove(posicion);
            Mostrar();
        }
    }

    public static void Clear() {
        modelList.removeAllElements();

    }

    public static void contB() {
        if (j == 0) {
            JOptionPane.showMessageDialog(null, "El numero de elementos del conjuto B es:  " + 1, "Tamaño del conjunto B", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "El numero de elementos del conjuto B es:  " + j, "Tamaño del conjunto B", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}