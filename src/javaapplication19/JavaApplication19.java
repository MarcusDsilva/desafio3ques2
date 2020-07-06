/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n1, n2, n3;

       Scanner ler = new Scanner(System.in);
       //Estou começando a numeração dos valores 

       System.out.println("De o valor de 1");
       n1 = ler.nextInt();
       System.out.println("De o valor de 2");
       n2 = ler.nextInt();
       System.out.println("De o valor de 3");
       n3 = ler.nextInt();

       //Terminei a numeração

       if (n1 >= n2 && n1 >= n3) {
           System.out.println("O primeiro é maior");
       } else if (n2 >= n3){
           System.out.println("O segundo é Maior ");
       } else //11if (n3 >= n1 && n3 >= n2) 
       {
        System.out.println("O terceiro é Maoir ");
    }

    }
}

