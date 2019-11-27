/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import static clases.AgregarConjuntoA.Mostrar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;
import TeoriaDeConjuntos.CrearConjuntoA;

/**
 *
 * @author Adrian AC
 */
public class Conjunto extends CrearConjuntoA {

    static Scanner leer = new Scanner(System.in);

    static ArrayList<Integer> conjuntoA = new ArrayList<Integer>();

    public static void main(String[] args) {
        int opc;
        do {

            opc = leer.nextInt();
            if (opc == 1) {
                AgregarConjuntoA();
            }
            if (opc == 2) {
                Mostrar();
            }
            if (opc == 3) {
                Modificar();
            }
        } while (true);
    }

    public static void AgregarConjuntoA() {
        int dato;
        System.out.println("Digite el elemento a agregar en el conjunto A");
        dato = leer.nextInt();
        conjuntoA.add(dato);
    }

    public static void Mostrar() {
        int i = 0;
        Iterator<Integer> it = conjuntoA.iterator();
        while (it.hasNext()) {
            System.out.println(i + ":" + it.next() + "\n");
            i++;
           
        }

    }

    public static void Modificar() {
        int posicion, elemento;
        Mostrar();
        System.out.println("Digite posicion a eliminar");
        posicion = leer.nextInt();
        System.out.println("Nuevo elemento");
        elemento = leer.nextInt();

        conjuntoA.set(posicion, elemento);
        Mostrar();

    }

    public static void Eliminar() {
        int posicion;
        Mostrar();
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar"));
        conjuntoA.remove(posicion);
        Mostrar();

    }
}

