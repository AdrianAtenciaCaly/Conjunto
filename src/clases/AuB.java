/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import static clases.AuB.Union;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import TeoriaDeConjuntos.Union;

public class AuB extends Union {
 static Set Union = new TreeSet();
    public static void Unir() {
        Union.addAll(conjuntoA);
        Union.addAll(conjuntoB);
        Muestra(Union);

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
       
        while (iter.hasNext()) {
            modelListU.addElement(iter.next() + "\n");
        }
    }

}
