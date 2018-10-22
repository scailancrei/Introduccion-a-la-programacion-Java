/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japl.pre02;

import java.util.Scanner;

public class Ejercicio03 {
    //Vamos a crear un programa que nos pida el mes en formato numerico
    //Y que nos indique cuantos dias tiene dicho mes
    public static void main(String[] args) {
        int mes, dias;
        Scanner lectura= new Scanner(System.in);
        mes = lectura.nextInt();
        System.out.println("Usted ha ingresado el mes: " + mes);
        switch  (mes) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12:
                System.out.println("Este mes tiene 31 dias: ");
               break;
            case 4: 
            case 6:
            case 9: 
            case 11:
                System.out.println("Este mes tiene 30 dias: ");
                break;
            case 2:
                System.out.println("Este mes tiene 28 dias: ");
                break; 
                default:  System.out.print("El numero introducido no es valido");
        }    
       
        
        
        
    }

    
}
