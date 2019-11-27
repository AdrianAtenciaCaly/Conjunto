/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaDeConjuntosDefinidos;

import clases.*;
import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import static TeoriaDeConjuntosDefinidos.CrearConjutoADefinido.conjuntoADefinido;
import static TeoriaDeConjuntosDefinidos.CrearConjutoBDefinido.conjuntoBDefinido;

/**
 *
 * @author Adrian AC
 */
public class AxBDefinido extends ProductoCartesianoDefinido {

    public static void productoCartesiano() {
        System.out.println("\n Producto Cartesiano");
        for (int i = 0; i < conjuntoADefinido.size(); i++) {
            for (int j = 0; j < conjuntoBDefinido.size(); j++) {
                 System.out.println("\n rAIngreso oducto Cartesiano");
                // System.out.print("(" + conjuntoA.get(i) + "," + conjuntoB.get(j) + ")" + " \n");
                modelListX.addElement(conjuntoADefinido.get(i) + "," + conjuntoBDefinido.get(j) + " \n");
            }
        }

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

}
