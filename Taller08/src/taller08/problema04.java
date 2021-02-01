/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller08;

import java.util.Scanner;

/**
 *
 * @author JEanpa
 */
public class problema04 {
      public static void main(String[] args) {
        // TODO code application logic here 
        Scanner entrada = new Scanner(System.in);
        int n ;
        double suma = 0;
        double numerador;
        double denominador;
        System.out.println("Ingrese el valor de n");
        n=entrada.nextInt();
        if (n > 0){
            for (int i = 0; i <= n; i++) {
                numerador = Math.pow(-1, i);
            denominador = (2*i)+1;
            suma = suma + (numerador/denominador);      
            }
        }else{
            System.out.println("El numero ingresado no es un valor positivo");
        }
        
        System.out.printf("Valor de la sumatoria %.2f\n", suma);
    }
    
}

