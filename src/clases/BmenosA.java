/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import TeoriaDeConjuntos.AdiferenciaB;
import static TeoriaDeConjuntos.AdiferenciaB.modelListA;
import static TeoriaDeConjuntos.AdiferenciaB.modelListB;
import static TeoriaDeConjuntos.AdiferenciaB.modelListD;
import TeoriaDeConjuntos.BdiferenciaA;

/**
 *
 * @author Adrian AC
 */
public class BmenosA extends BdiferenciaA {

    static Set<String> difference = new HashSet<String>();
    Set<Integer> A = new HashSet<Integer>();

    Set<Integer> B = new HashSet<Integer>();

    public static void BdiferenciaA() {
        difference.addAll(conjuntoB);
        difference.removeAll(conjuntoA);
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
              modelListD.addElement(iter.next()+"\n");
            //mensaje += iter.next();
        }
      
    }

}
