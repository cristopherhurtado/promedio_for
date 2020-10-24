/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio_for;

import java.util.Scanner;

/**
 *
 * @author Master Estampado SG
 */
public class Promedio_for {
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
      Scanner leer=new Scanner(System.in);
      
      String alumno;
      double nota, promedio, resul;
      
        for (int i = 1; i<=5; i++){
                    System.out.print("Ingrese nombre del alumno "+i+": ");
                    alumno=leer.next();
            resul=0;
            
            for (int x = 1; x<=2; x++){
                System.out.print("Ingrese calificacion "+x+": ");
                nota=leer.nextDouble();
                resul=(resul+nota);    
            }
            
            promedio=(resul/2);

            System.out.println("El promedio es : "+promedio);

            if (promedio >= 4){
                System.out.println("APROBADO");
            }   
            else{
                System.out.println("REPROBADO");
            }
              System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
       
        }
    }
}

