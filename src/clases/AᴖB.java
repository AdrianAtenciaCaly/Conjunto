/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import TeoriaDeConjuntos.Interseccion;
import static TeoriaDeConjuntosDefinidos.CrearConjutoADefinido.conjuntoADefinido;
import static TeoriaDeConjuntosDefinidos.CrearConjutoBDefinido.conjuntoBDefinido;
import TeoriaDeConjuntosDefinidos.InterseccionDefinido;


/**
 *
 * @author Adrian AC
 */
public class AᴖB  extends Interseccion{
     static Set Interseccion = new TreeSet();
    public static void Interseccion() {
        Interseccion.addAll(conjuntoA);
        Interseccion.retainAll(conjuntoB);
        Muestra(Interseccion);
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
            modelListI.addElement(iter.next()+"\n");
        }
       
    }
    
}
