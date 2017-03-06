/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Kevin Gerardo Hinojosa Castellanos    A01411383  IMT
package spp.khinojosac.a07;
import java.util.Scanner;
/**
 *
 * @author kevinhinojosa
 */
public class SPPKHinojosaCA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Long [] telefono = new Long [10];
    for (int i=0; i<telefono. length; i++){
        telefono [i] = tel("el numero telefonico "+ (i+1));
    }
    
    int consulta = consult("El numero que desea saber");
    System.out.println("El numero de la persona "+consulta+" es: " + telefono[consulta]);
    }
    
    public static long tel(String mensaje){
        Scanner teclado = new Scanner (System.in);
        long varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduce " + mensaje);
        try{
        varEntera = teclado.nextLong();
        flag=false;
        }
        catch (Exception ex){
            System.out.println("Introduzca un numero valido");
            flag=true;
            teclado.next();
        } 
        }while (flag); 
    return varEntera;
    }
    public static int consult(String mensaje){
        Scanner teclado = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduce " + mensaje);
        try{
        varEntera = teclado.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Incorrecto" + ex);
            flag=true;
            teclado.nextLine();
    } 
  } while (flag); 
    return varEntera;}
}
    
