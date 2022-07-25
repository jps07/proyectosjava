/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto1;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Reto1 {

    public static void main(String[] args) {
        Scanner Entrada=new Scanner(System.in); 
        int N, tipo;
         long cuenta;
         String fecha;
         double saldo, vrintereses=0, totalintereses=0, totalsaldo=0;
         //System.out.println("ingrese la cantidad de cuentas");
         N=Entrada.nextInt();
         
         for(int i=1;i<=N;i++){
             //System.out.println("Ingrese el numero de cuentas ");
             cuenta=Entrada.nextLong();
             //System.out.println("Ingresar fecha de apertura");
             fecha=Entrada.next();
             //System.out.println("ingresar tipo de cuenta");
             tipo=Entrada.nextInt();
             //System.out.println("ingrese saldo");
             saldo=Entrada.nextInt();
             switch(tipo){
                 case 1:vrintereses=saldo*1.5/100;
                 break;
                 case 2:vrintereses=saldo*1.7/100;
                 break;
                 case 3:vrintereses=saldo*1.6/100;
                 break;
             }
             saldo+=vrintereses;
             totalintereses+=vrintereses;
             totalsaldo+=saldo;
             System.out.println(cuenta);
             System.out.println(vrintereses);
             System.out.println(saldo);
         }
         
         System.out.println(totalintereses);
         System.out.println(totalsaldo);
         
    }
}
