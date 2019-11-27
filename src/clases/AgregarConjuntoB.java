/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.AgregarConjuntoA.j;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import TeoriaDeConjuntos.CrearConjuntoA;
import static TeoriaDeConjuntos.CrearConjuntoA.modelList;
import TeoriaDeConjuntos.CrearConjuntoB;

/**
 *
 * @author Adrian AC
 */
public class AgregarConjuntoB extends CrearConjuntoB  {

    public static ArrayList<String> conjuntoB = new ArrayList<String>();
    static int i=1,j=0;

    public static void AgregarConjuntoB() {
       String dato;
        dato = JOptionPane.showInputDialog("Dijite el elemento del conjunto B");
        conjuntoB.add(dato);
        j++;
    }

     public static void Mostrar() {
        int i = 0;
        Clear();
        if (conjuntoB.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha creado una el conjunto B", "Aviso¡", JOptionPane.WARNING_MESSAGE);
        } else {
            Iterator it = conjuntoB.iterator();
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
        if (posicion > conjuntoB.size()) {
            JOptionPane.showMessageDialog(null, "Ingrese una posicion corecta");
        } else {
            System.out.println("Nuevo elemento");
            elemento = JOptionPane.showInputDialog("Nuevo elemento");
            conjuntoB.set(posicion, elemento);
            Mostrar();
        }
    }

    public static void Eliminar() {
        int posicion;
        Mostrar();
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar"));
        if (posicion > conjuntoB.size()) {
            JOptionPane.showMessageDialog(null, "Ingrese una posicion corecta");
        } else {
            conjuntoB.remove(posicion);
            Mostrar();
        }
    }

    public static void Clear() {
        modelList.removeAllElements();

    }

    public static void contB() {
      if (conjuntoB.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha creado una el conjunto B", "Aviso¡", JOptionPane.WARNING_MESSAGE);
        } else {
        if (j == 0) {
            JOptionPane.showMessageDialog(null, "El numero de elementos del conjuto B es:  " + 1, "Tamaño del conjunto B", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "El numero de elementos del conjuto B es:  " + j, "Tamaño del conjunto B", JOptionPane.INFORMATION_MESSAGE);
        }
      }
    }
}