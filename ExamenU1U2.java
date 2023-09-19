/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;

import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese nombre del videojuego1");
        int nombre1= scanner.nextInt();
        System.out.println("ingrese nombre del videojuego1");
        int videojuego1=scanner.nextInt();
       
       scanner.nextLine();
        System.out.println("ingrese nombre del videojuego2");
        int nombre2= scanner.nextInt();
        System.out.println("ingrese nombre del videojuego2");
        int videojuego2=scanner.nextInt();
        
        scanner.nextLine();
        System.out.println("ingrese nombre del videojuego3");
        int nombre3= scanner.nextInt();
        System.out.println("ingrese nombre del videojuego3");
        int videojuego3=scanner.nextInt();
        
        double porcentaje1=(videojuego1*30/100);
        double porcentaje2=(videojuego2*15/100);
        double porcentaje3=(videojuego3*25/100);
        
        System.out.println("el precio del videojuego1 es"+ porcentaje1);
        System.out.println("el precio del videojuego1 es"+ porcentaje2);
        System.out.println("el precio del videojuego1 es"+ porcentaje3);
        
        
        
    }
    
}
