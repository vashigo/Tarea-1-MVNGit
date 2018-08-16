/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 *
 * @author 2101770
 */
public class AppMethod {
    public static LinkedList column1 = new LinkedList();
    public static LinkedList column2 = new LinkedList();
    public static double media1=0;
    public static double media2=0;
    public static double DesvEstandar1;
    public static double DesvEstandar2;
    
        /**
     * Método que calcula el promedio en una Linkedlist global
     */ 
    public static double promedio(LinkedList list) {
        double prom=0.0;
        for ( int i = 0; i < list.getSize(); i++ ){
            prom += list.getNode(i);
        }
        
        return prom / ( double ) list.getSize();
    }    
    /**
     * Método que calcula la Desviacion estandar de una LinkedList
     */
    public static double desviacion (LinkedList list) {
      double prom, sum = 0; int i, n = list.getSize();
      prom = promedio(list);

      for ( i = 0; i < n; i++ ) 
        sum += Math.pow ( list.getNode(i) - prom, 2 );

      return Math.sqrt ( sum / (n-1) );
    }
    
    /**
     * Método que lee el archivo y almacena los numeros en las LinkedList previamente creadas
     */    
    public static void leerArchivo() throws IOException{
        Path filePath = Paths.get("src/main/java/edu/escuelaing/arem/ASE/app/Datos.txt"); 
        Scanner scanner = new Scanner(filePath); 
        
        while (scanner.hasNext()) { 
            if (scanner.hasNextDouble()) { 
                column1.insertFirst(scanner.nextDouble());
                column2.insertFirst(scanner.nextDouble());
            } else { 
             scanner.next(); 
            } 
        } 
    }
    
}
