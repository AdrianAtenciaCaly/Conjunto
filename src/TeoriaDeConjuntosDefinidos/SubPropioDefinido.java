/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaDeConjuntosDefinidos;

import static TeoriaDeConjuntosDefinidos.CrearConjutoADefinido.conjuntoADefinido;
import static TeoriaDeConjuntosDefinidos.CrearConjutoBDefinido.conjuntoBDefinido;
import clases.*;
import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import java.util.ArrayList;

/**
 *
 * @author Adrian AC
 */
public class SubPropioDefinido {
   

    public static boolean ASubPropioB() {
        for (int i = 0; i < conjuntoADefinido.size()+conjuntoBDefinido.size() ; i++) {
            if (conjuntoADefinido.contains(conjuntoBDefinido.get(i)) &&!conjuntoADefinido.contains(conjuntoADefinido.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean BSubPropioA() {
        for (int i = 0; i < conjuntoBDefinido.size() ; i++) {
            if (conjuntoBDefinido.contains(conjuntoADefinido.get(i)) &&!conjuntoADefinido.contains(conjuntoBDefinido.get(i))) {
                return false;
            }
        }
        return true;
    }
     
    
}
