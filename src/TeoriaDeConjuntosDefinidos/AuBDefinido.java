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
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import TeoriaDeConjuntos.Union;
import static TeoriaDeConjuntosDefinidos.CrearConjutoADefinido.conjuntoADefinido;
import static TeoriaDeConjuntosDefinidos.CrearConjutoBDefinido.conjuntoBDefinido;

public class AuBDefinido extends UnionDefinidos {

    //static ArrayList<Integer> Union = new ArrayList<Integer>();
    static Set Union = new TreeSet();

    public static void Unir() {
        Union.addAll(conjuntoADefinido);
        Union.addAll(conjuntoBDefinido);
        Muestra(Union);

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
       
        while (iter.hasNext()) {
            modelListU.addElement(iter.next() + "\n");
        }
    }

}
