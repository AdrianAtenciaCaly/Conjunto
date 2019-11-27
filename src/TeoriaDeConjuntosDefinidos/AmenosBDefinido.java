/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaDeConjuntosDefinidos;

import clases.*;
import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import static clases.AᴖB.Interseccion;
import static clases.AᴖB.Muestra;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import static TeoriaDeConjuntosDefinidos.CrearConjutoADefinido.conjuntoADefinido;
import static TeoriaDeConjuntosDefinidos.CrearConjutoBDefinido.conjuntoBDefinido;
import java.util.Set;

/**
 *
 * @author Adrian AC
 */
public class AmenosBDefinido extends AdiferenciaBDefinido {

    static Set<Integer> difference = new HashSet<Integer>();

    public static void AdiferenciBDefinido() {
        difference.addAll(conjuntoADefinido);
        difference.removeAll(conjuntoBDefinido);
        Muestra(difference);

    }

    public static void MostrarA() {
        Iterator<Integer> it = conjuntoADefinido.iterator();
        while (it.hasNext()) {
            modelListA.addElement(it.next() + "\n");
        }
    }

    public static void MostrarB() {
        Iterator<Integer> it = conjuntoBDefinido.iterator();
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
