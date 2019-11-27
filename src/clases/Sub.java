/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.AgregarConjuntoA.conjuntoA;
import static clases.AgregarConjuntoB.conjuntoB;
import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian AC
 */
public class Sub {
    public static boolean ASubB() {
        for (int i = 0; i < conjuntoA.size() ; i++) {
            if (!conjuntoA.contains(conjuntoB.get(i))) {
                 
                return false;
            }
        }

        return true;
    }
       public static boolean BSubA() {
        for (int i = 0; i < conjuntoB.size() ; i++) {
            if (!conjuntoB.contains(conjuntoA.get(i))) {
                 
                return false;
            }
        }
    
        return true;
    }
    

    
}

    

