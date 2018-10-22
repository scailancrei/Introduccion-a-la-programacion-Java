/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japl.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ScaiLanCrei
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        //Genere un numero entero aleatorio mediante la funcion random math
        //El usuario tiene que adivinarlo. Cada vez que se introduce un numero
        //el programa debe indicar si es mayor o menor que el numero que que descubrir
        //El programa finalizara una vez que el usuario escriba el numero correcto.
        //Introduzco variables
        int numero = 0;
        int n = (int) (Math.random()*50+1);
        //Pido los numeros por teclado
        Scanner teclado = new Scanner(System.in);
        
        //Codificacion
     
            do {
           try {     
            System.out.println("Introduce numero: "); 
            numero = teclado.nextInt();
            if (n > numero) {
                System.out.println("El nº que buscas es mayor");
          } else {
            } if (n < numero) {
              System.out.println("El nº que buscas es menor");
                        }
          
          } catch (InputMismatchException e) {
                    System.out.println("El numero no es correcto");
                    }
            //Ahora establecemos que el programa acabe cuando acertemos el numero aleatorio.
        } while (numero != n); {
              System.out.println("Enhorabuena has encontrado el numero" + n);
            }
    }
    }
        

