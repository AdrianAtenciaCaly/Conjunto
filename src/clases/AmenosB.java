/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import static clases.AᴖB.Interseccion;
import static clases.AᴖB.Muestra;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import TeoriaDeConjuntos.AdiferenciaB;
import static TeoriaDeConjuntos.BdiferenciaA.modelListD;

/**
 *
 * @author Adrian AC
 */
public class AmenosB extends AdiferenciaB {

    static Set<String> difference = new HashSet<String>();

    public static void AdiferenciB() {
        difference.addAll(conjuntoA);
        difference.removeAll(conjuntoB);
        Muestra(difference);

    }

    public static void MostrarA() {
        Iterator it = conjuntoA.iterator();
        while (it.hasNext()) {
            modelListA.addElement(it.next() + "\n");
        }
    }

    public static void MostrarB() {
        Iterator it = conjuntoB.iterator();
        while (it.hasNext()) {
            modelListB.addElement(it.next() + "\n");
        }
    }

    public static void Muestra(Set X) {
        Iterator iter = X.iterator();
        String mensaje = " ";
        while (iter.hasNext()) {
            //mensaje += iter.next();
            modelListD.addElement(iter.next() + "\n");
        }

    }

}
