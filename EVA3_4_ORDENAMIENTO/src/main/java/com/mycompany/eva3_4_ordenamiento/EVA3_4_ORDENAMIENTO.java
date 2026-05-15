/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_ordenamiento;

import java.util.Scanner;

/**
 *
 * @author Angel Vega
 */
public class EVA3_4_ORDENAMIENTO {

    public static void main(String[] args) {
       int [] datos=new int [10];
       long ini,fin,tiempo;
       llenar(datos);
       imprimir(datos);
       System.out.println();
       System.out.println();
       selectionSort(datos);
       imprimir(datos);
       System.out.println();
       System.out.println("Valor a encontrar");
       Scanner in= new Scanner(System.in);
       int valor = in.nextInt();
       
       System.out.println("Numero " +valor+ " encontrado en: " + busquedaBinaria(datos,0,datos.length-1,valor));
    }
    
    
        
  public static void llenar (int [] arreglo){
        
       for (int i=0; i<arreglo.length; i++){
            
           arreglo[i]= (int) (Math.random()*100);
      
       }
  }
    
    
  public static void imprimir (int [] arreglo){
        
       for (int i=0; i<arreglo.length; i++){
            
            System.out.print("["+arreglo[i]+"]");
       }       
    }
  
  
    public static void  selectionSort (int[] arreglo){
     
    for (int i=0; i<arreglo.length; i++){     
        int min=i;
        
        for (int j=i+1; j<arreglo.length; j++){
          
                if (arreglo[j]<arreglo[min]){
                min=j;
                
                }       
        }
                int temp= arreglo[min];
                arreglo[min]=arreglo[i];
                arreglo[i]=temp;
    }  
  }
    
    public static int busquedaBinaria(int[]arreglo,int ini, int fin,int valor){
        int mit=(ini+((fin-ini)/2));
        int resu=-1;
        if (arreglo[mit]==valor){
           resu=mit;
        }else if(valor<arreglo[mit]&& ini!=mit){
           
              return busquedaBinaria(arreglo,ini,mit-1,valor);
              
        }else if (valor>arreglo[mit] && fin!=mit){
            
              return busquedaBinaria(arreglo,mit+1,fin,valor);
        }
        
         
        
        return resu;
}
}
