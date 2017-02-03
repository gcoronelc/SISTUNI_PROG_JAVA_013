/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.matematica.prueba;

import pe.egcc.matematica.service.MyMath;

/**
 *
 * @author jeffry
 */
public class Prueba01 {
  public static void main(String[] args) {
        //Dato
    int n=6;
    int n1=7; 
    int n2=49;
        //Proceso
    MyMath service=new MyMath();
    long factorial= MyMath.factorial(n);
    int mcd=MyMath.mcd(n1, n2);
    int mcm=MyMath.mcm(n1, n2);
    String fibonacci=MyMath.fibonacci(n);
    boolean esPrimo=MyMath.esPrimo(n);
    //  REPORTE
      System.out.println("El factorial de 6 es: "+ factorial);
      System.out.println("El mcd de 7 y 49 es: "+ mcd);
      System.out.println("El mcm de 7 y 49 es: "+ mcm);
      System.out.println("Fibonacci de 6 es: "+ fibonacci);
      System.out.println("¿Es primo el numero 6?: "+ esPrimo);
      
  }
 
}
