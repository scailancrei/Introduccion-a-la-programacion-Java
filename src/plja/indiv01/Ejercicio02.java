/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japl.pre02;

import java.util.Scanner;


public class Ejercicio02 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Introduzca un numero");
        Scanner teclado= new Scanner (System.in);
        numero = teclado.nextInt();
        if (numero%2==0) {
            System.out.print("Es un numero Par");
        }else{
            System.out.print("Es un numero impar");
            
        }
    }
}
