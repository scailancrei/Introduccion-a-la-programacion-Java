/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japl.pre02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Introducimos la variable edad
        int edad;
        Scanner teclado = new Scanner(System.in);
        //Ahora vamos a colocar ademas try y catch para indicar error en caso de
        // colocar un numero u operador erroneo
       try {
        System.out.print("Introducir edad: ");
        edad = teclado.nextInt();  
        if (edad >= 18){
            System.out.println("eres mayor de edad");
        }else {
            if (edad < 18){
                System.out.println("eres menor de edad");
              }
          }
        } catch (InputMismatchException exception) {    
         System.out.println("Este valor no es valido");
            
                
        }  
        }     
        }
