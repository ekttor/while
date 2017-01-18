/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while1;

import java.util.Scanner;

/**
 *
 * @author a053603420b
 */
public class While1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*   int x = 20;
      
        while (x >= 2){
        System.out.println(x);
        x -= 2;
        }*/
 /* int x = 1;
     
     while (x <= 10){
     System.out.println(x*4);
     x++;
     }*/
 /* Scanner teclado = new Scanner(System.in);

        int x;
    public String getNombre() {
        return nombre;
    }

        System.out.println("introduce un numero distinto de 0 para saber su cuadrado:  ");
        x = teclado.nextInt();
        
        while (x != 0) {

    public String getNombre() {
        return nombre;
    }

            System.out.println(""+(x * x));
              System.out.println("introduce un numero distinto de 0 para saber su cuadrado:  ");
             x = teclado.nextInt();
        }
            System.out.println("has introducido un 0.");*/
        Scanner teclado = new Scanner(System.in);

        /* int contraseña;
       int login;
       
       
       System.out.println("   Introduce tu login: ");
        login = teclado.nextInt();
        System.out.println("   Introduce una contraseña: ");
        contraseña = teclado.nextInt();
       
       
       while (login != 1809 && contraseña != 1234){
     
            System.out.println("   Introduce tu login: ");
        login = teclado.nextInt();
           System.out.println("   Introduce una contraseña: ");
       contraseña = teclado.nextInt();
       
       
       }*/
 /*
        
        
        
        int num;
      int cont = 0;
      
      System.out.println("  Introduce un numero:  ");
      num = teclado.nextInt();
      
      while (cont < num){
          System.out.print("*");
          cont++;
      }*/
 /*descontar numero en pares
        int x = 20;

        do {
            System.out.println(x);
            x -= 2;
        } while(x >= 0);*/
 /*tabla multiplicar
       
       int x = 1;
       
       do{
           System.out.println( x * 5);
       x++;
       }while(x <= 10 );*/
 /* suma de numeros con do...while
 
 
        int x = 1;
        int y = 1;

        do {
            System.out.println("   Introduce dos numeros distintos de 0: ");
            x = teclado.nextInt();
            y = teclado.nextInt();
            System.out.println("La suma es: "+ x +" + " + y +" = "+(x + y));
        } while (x != 0 || y != 0);*/
 /* passwd y login con do...while
 
        int login, passwd;

        do {
            System.out.println("  Introduce un login:  ");
            login = teclado.nextInt();
            System.out.println("  Introduce un password:  ");
            passwd = teclado.nextInt();
        } while (login != 1908 || passwd != 1234);*/
        byte read;
        int x = 0;
        int y = 0;

        System.out.println("  Introduce un numero:  ");
        read = teclado.nextByte();
        
        do {
            do {
                System.out.print(" * ");
                y++;
            }while (y < read);
            y = 0;
            System.out.println("");
            x++;
        } while (x < read);

    }

}
