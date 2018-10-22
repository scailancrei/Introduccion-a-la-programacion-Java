/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japl.pre02;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author ScaiLanCrei
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        //Realizar suma de los numeros introducidos por teclado hasta que sea
        //mayor o igual que  77. Cuando finalice debera mostrar suma total
        // y cantidad de numeros que se han introducido.
      int suma = 0;
      int total = 0; 
      int numero1 = 0;
      int numero2 = 0;
      
      //Tras introducir las variables pedimos ahora los numeros por teclado
        Scanner teclado = new Scanner(System.in);
        
        
        
      //Ahora procederemos a la suma de los numeros hasta que salga 77 o mas.
        do{  
           // ahora vamos a colocar el try y el catch para crear excepciones
            try {          
            System.out.println("Introducir numero : ");
            numero1 = teclado.nextInt();
            System.out.println("Introducir numero : ");
            numero2 = teclado.nextInt();
            suma =numero1 + numero2;
            total ++; 
                System.out.println("La suma introducida es: "+ suma);
            
             } catch (InputMismatchException e) {
                System.out.println("¡Atencion!, El numero introducido no es valido ");     
            }
        }
        while (suma <= 77); 
            System.out.println("El numero es:  " + suma + "y la cantidad de numeros introducidos son: "+ total);
        
          
          }      
    }
