/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import static TeoriaDeConjuntos.BdiferenciaA.modelListA;
import static TeoriaDeConjuntos.BdiferenciaA.modelListB;
import static TeoriaDeConjuntos.BdiferenciaA.modelListD;
import TeoriaDeConjuntos.ProductoCartesiano;

/**
 *
 * @author Adrian AC
 */
public class AxB extends ProductoCartesiano {

    public static void productoCartesiano() {

        System.out.println("\n Producto Cartesiano");

        for (int i = 0; i < conjuntoA.size(); i++) {
            for (int j = 0; j < conjuntoB.size(); j++) {
                // System.out.print("(" + conjuntoA.get(i) + "," + conjuntoB.get(j) + ")" + " \n");
                modelListX.addElement(conjuntoA.get(i) + "," + conjuntoB.get(j) + " \n");
            }
        }

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

}
