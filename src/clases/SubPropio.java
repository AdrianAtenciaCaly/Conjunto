/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import java.util.ArrayList;

/**
 *
 * @author Adrian AC
 */
public class SubPropio {
   

    public static boolean ASubPropioB() {
        for (int i = 0; i < conjuntoA.size() ; i++) {
            if (conjuntoA.contains(conjuntoB.get(i)) &&!conjuntoB.contains(conjuntoA.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean BSubPropioA() {
        for (int i = 0; i < conjuntoB.size() ; i++) {
            if (conjuntoB.contains(conjuntoA.get(i)) &&!conjuntoA.contains(conjuntoB.get(i))) {
                return false;
            }
        }
        return true;
    }
     
    
}
