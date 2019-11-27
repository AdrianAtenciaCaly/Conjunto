/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaDeConjuntosDefinidos;


import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import TeoriaDeConjuntos.Interseccion;
import static TeoriaDeConjuntosDefinidos.CrearConjutoADefinido.conjuntoADefinido;
import static TeoriaDeConjuntosDefinidos.CrearConjutoBDefinido.conjuntoBDefinido;


/**
 *
 * @author Adrian AC
 */
public class AᴖBDefinido  extends InterseccionDefinido{
     static Set Interseccion = new TreeSet();
    public static void InterseccionDefinido() {
        Interseccion.addAll(conjuntoADefinido);
        Interseccion.retainAll(conjuntoBDefinido);
        Muestra(Interseccion);
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
            //mensaje += iter.next()+",";
             modelListI.addElement(iter.next()+"\n");
        }
      
    }
    
}
