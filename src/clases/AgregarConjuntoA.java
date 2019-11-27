/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static Imagenes.Conjunto.Mostrar;
import static clases.AgregarConjuntoB.conjuntoB;
import static clases.AgregarConjuntoB.j;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import TeoriaDeConjuntos.CrearConjuntoA;

public class AgregarConjuntoA extends CrearConjuntoA {

    public static ArrayList<String> conjuntoA = new ArrayList<String>();
    static int j = 0;

    public static void AgregarConjuntoA() {
      String dato;
        dato = JOptionPane.showInputDialog("Digite elemento del conjunto A");
        conjuntoA.add(dato);
    }

    public static void Mostrar() {
        int i = 0;
        Clear();
        if (conjuntoA.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha creado una el conjunto A", "Aviso¡", JOptionPane.WARNING_MESSAGE);
        } else {
            Iterator it = conjuntoA.iterator();
            while (it.hasNext()) {
                modelList.addElement(i + ": " + it.next() + "\n");
                i++;
                j = i;
            }
        }
    }

    public static void Modificar() {
        int posicion;
        String elemento;
        Mostrar();
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar"));
        if (posicion > conjuntoA.size()) {
            JOptionPane.showMessageDialog(null, "Ingrese una posicion corecta");
        } else {
            System.out.println("Nuevo elemento");
            elemento = JOptionPane.showInputDialog("Nuevo elemento");
            conjuntoA.set(posicion, elemento);
            Mostrar();
        }
    }

    public static void Eliminar() {
        int posicion;
        Mostrar();
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar"));
        if (posicion > conjuntoA.size()) {
            JOptionPane.showMessageDialog(null, "Ingrese una posicion corecta");
        } else {
            conjuntoA.remove(posicion);
            Mostrar();
        }
    }

    public static void Clear() {
        modelList.removeAllElements();

    }

    public static void contA() {
         if (conjuntoA.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha creado una el conjunto A", "Aviso¡", JOptionPane.WARNING_MESSAGE);
        } else {
        if (j == 0) {
            JOptionPane.showMessageDialog(null, "El numero de elementos del conjuto A es:  " + 1, "Tamaño del conjunto A", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "El numero de elementos del conjuto A es:  " + j, "Tamaño del conjunto A", JOptionPane.INFORMATION_MESSAGE);
        }
         }
    }
}
