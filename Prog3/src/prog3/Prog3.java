/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog3;

import java.util.Scanner;
/**
 *
 * @author EMERSON MENDOZA
 */
public class Prog3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Años = new Scanner(System.in);
        Velas velas = new Velas();
        int edad;
        System.out.println("\t\t\t\t////Pastel de cumpleaños////\t\t\t\t");     
        System.out.println("\nIngrese la edad de la persona que cumple años\t");
        edad = Años.nextInt();
        velas.Velas(edad);
        velas.hV();
        velas.ImphV();
        velas.offV();
        
    }
    
}