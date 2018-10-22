/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japl.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ScaiLanCrei
 */
public class Ejercicio05 {
    public static void main(String[] args) {
    //Ingresar las variables para pedir por teclado y pedir la media de 5 numeros
    int numeros;
    int total;
    //Ahora vamos a pedir la informacion necesaria
    try {      
    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduce numero: ");
    numeros = teclado.nextInt();
    System.out.print("Introduce numero: ");
    numeros = teclado.nextInt();
    System.out.print("Introduce numero: ");
    numeros = teclado.nextInt();
    System.out.print("Introduce numero: ");
    numeros = teclado.nextInt();
    System.out.print("Introduce numero: ");
    numeros = teclado.nextInt();
    //Codificacion de la media
   //la media  se evaluara como double
   double media = 0.0;

    
        for (int i = 0; i < numeros; i++) {
            media = media + numeros;
            media = media / numeros;

        }

        for (int i = 0; i < numeros; i++) {
            media = media + numeros;
            media = media / numeros;

                System.out.print("La media del numero es: " +  media);

        }

    System.out.print("La media del numero es: " +  media);
    
        //Finalizamos el try con un catch
    }  catch (InputMismatchException exception) {
             System.out.println("Este valor es incorrecto");
    }
    }
}
