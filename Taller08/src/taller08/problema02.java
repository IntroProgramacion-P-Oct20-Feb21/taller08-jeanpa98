/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller08;

/**
 *
 * @author JEanpa
 */
public class problema02 {
    public static void main (String[] args){
        char valor;
        for (int i = 1; i <= 26 ; i++){
            valor = (char)(i + 96);
            for (int j = 1 ; j <= i ; j++ ){
                System.out.printf("%s",valor) ;
            }
            System.out.println();
        }
    }
}

