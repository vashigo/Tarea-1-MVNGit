package edu.escuelaing.arem.ASE.app;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Hello world!
 *
 */
public class App 
{   
    private static LinkedList column1 = new LinkedList();
    private static LinkedList column2 = new LinkedList();
    private static double media1=0;
    private static double media2=0;
    private static double DesvEstandar1;
    private static double DesvEstandar2;
    
    /**
     * Main
     * Calcula la media y desviacion estandar de las tablas 1 y 2 previamente leidas desde un archivo de texto
     */ 
    public static void main( String[] args )
    {
        //lee Archivo y guarda los datos en las linked list (column1 y column2)
        leerArchivo();
        //Sacar media
        media1=promedio(column1);
        media2=promedio(column2);
        //sacar desviacion estandar
        DesvEstandar1=desviacion(column1);
        DesvEstandar2=desviacion(column2);
        //imprimir resultados redondeados a dos decimales
        System.out.println("table 1:");
        System.out.println("mean:"+String.format("%.2f", media1));
        System.out.println("Std. Dev:"+String.format("%.2f", DesvEstandar1));
        System.out.println("");
        System.out.println("table 2:");
        System.out.println("mean:"+String.format("%.2f", media2));
        System.out.println("Std. Dev:"+String.format("%.2f", DesvEstandar2));

    }
    /**
     * Método que calcula el promedio en una Linkedlist global
     */ 
    private static double promedio(LinkedList list) {
        double prom=0.0;
        for ( int i = 0; i < list.getSize(); i++ ){
            prom += list.getNode(i);
        }
        
        return prom / ( double ) list.getSize();
    }    
    /**
     * Método que calcula la Desviacion estandar de una LinkedList
     */
    private static double desviacion (LinkedList list) {
      double prom, sum = 0; int i, n = list.getSize();
      prom = promedio(list);

      for ( i = 0; i < n; i++ ) 
        sum += Math.pow ( list.getNode(i) - prom, 2 );

      return Math.sqrt ( sum / (n-1) );
    }
    
    /**
     * Método que lee el archivo y almacena los numeros en las LinkedList previamente creadas
     */   
    
    private static void leerArchivo(){
        try {
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
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
