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
public class Ejercicio07 {
    public static void main(String[] args) {
   //En primer lugar pedire un numero positivo por teclado
   //Despues de eso realizaré la division entre 3 mediante restas
   // Al final indicare el cociente y el resto resultante.
   //Colocamos en primer lugar las variables
   int dividendo = 0;
   int divisor = 0;
   int cociente = 0;
   int resto= 0;
   //Despues pedimos los numeros a introducir
    
        try {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dividendo: ");
        dividendo = teclado.nextInt();
        System.out.println("Introduce divisor: ");
        divisor = teclado.nextInt();
            //Vamos a eliminar los numeros negarivos y si el numero es negativo
            //Se detiene el bucle
            while (dividendo >= divisor) {
                dividendo = dividendo - divisor;
                cociente++;
                if (dividendo < divisor) {
                   resto = dividendo;
                }
            }
            
        } catch (InputMismatchException e) {
            System.out.println("El numero introducido no es valido, pruebe con otro");
        
        }
 System.out.println("La division nos da"  + cociente + "Y el resto de la operacion es: "+ resto);
       }
      }
    
       
