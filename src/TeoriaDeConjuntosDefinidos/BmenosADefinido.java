/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaDeConjuntosDefinidos;

import clases.*;
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
import static TeoriaDeConjuntosDefinidos.CrearConjutoADefinido.conjuntoADefinido;
import static TeoriaDeConjuntosDefinidos.CrearConjutoBDefinido.conjuntoBDefinido;

/**
 *
 * @author Adrian AC
 */
public class BmenosADefinido extends BdiferenciaADefinido {

    static Set<Integer> difference = new HashSet<Integer>();
    Set<Integer> A = new HashSet<Integer>();

    Set<Integer> B = new HashSet<Integer>();

    public static void BdiferenciaADefinido() {
        difference.addAll(conjuntoBDefinido);
        difference.removeAll(conjuntoADefinido);
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
            modelListD.addElement(iter.next() + "\n");
        }
        
    }

}
