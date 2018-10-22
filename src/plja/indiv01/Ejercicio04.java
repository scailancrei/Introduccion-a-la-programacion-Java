/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japl.pre02;

import java.util.Scanner;

public class Ejercicio04 {
    public  static void main (String [] args){
        //Primero vamos a introducir las variables necesarias para este programa
        System.out.println("Introduce numero: ");
        int num, factorial;
        factorial = 1;
        Scanner teclado = new Scanner (System.in);
        num = teclado.nextInt();
        // Calcular el factorial del numero introducido.
        while (num !=0) {            
            factorial*=num;
            num--;
        }
        System.out.println("El numero introducido es: " + factorial);
        }
     
    }

