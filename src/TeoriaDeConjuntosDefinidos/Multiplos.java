/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaDeConjuntosDefinidos;

public class Multiplos {

    public static void main(String[] args) {
        primos();
    }

    public static void primos() {
        int numero=10;
        for (int i = 1; i <numero; i++) {
            int cout=0;
            for (int j = 1; j <numero; j++) {
                if(i%j==0){
                cout++;
                }
                
                
            }
            if(cout==2){
                    System.out.println(i);
                }
            
        }
           
        
        
    }

    public static void Divisor(int numero) {

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {

                System.out.println(i + " ");
            }

        }

    }

    public void multiplo() {
        int cadena[] = new int[100];

        for (int i = 1; i < 100; i++) {
            if (i % 6 == 0) {
                cadena[i] = cadena[i] + i;
                System.out.println(cadena[i] + " ");
            }
        }
    }

}
