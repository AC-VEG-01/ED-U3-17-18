/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_ordenamiento;

/**
 *
 * @author Angel Vega
 */
public class EVA3_1_ORDENAMIENTO {

    public static void main(String[] args) {
       int[] datos= new int[10];
       long ini,fin,tiempo;
      
       llenar(datos);
       imprimir(datos);
       System.out.println("");
       
       ini=System.nanoTime();
       int []selection=copiar(datos);    
       selectionSort(selection);

       fin=System.nanoTime();
       tiempo=fin-ini;
         
       
       System.out.println("");
       System.out.println("SELECTION SORT");
       
       imprimir(selection);
        
       System.out.println("");
       System.out.println("Tiempo de ordenar: " + tiempo);
       imprimir(datos);
       System.out.println("");
       
       System.out.println("INSERTION");
       ini=System.nanoTime();
       int []insertion=copiar(datos); 
       InsertionSort(insertion);
       fin=System.nanoTime();
       tiempo=fin-ini;
       imprimir(insertion);
       
       System.out.println("Tiempo: "+ tiempo);
    
       ini=System.nanoTime();
       int []bubble=copiar(datos); 
       bubbleSort(bubble);
       System.out.println("BUBBLE SORT");
       imprimir(bubble);
       fin=System.nanoTime();
       tiempo=fin-ini;
       System.out.println("Tiempo: "+ tiempo);
       
       ini=System.nanoTime();
       int []quickSort=copiar(datos);
       System.out.println("QUICK SORT");
       quickSort1(quickSort,0,1,quickSort.length-1);
        fin=System.nanoTime();
       tiempo=fin-ini;
       imprimir(quickSort);
       System.out.println("Tiempo: "+ tiempo);
       
       
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
      
  public static int[] copiar (int [] arreglo){
        
        int [] copia= new int [arreglo.length];
        
        for (int i=0; i<arreglo.length; i++){
            copia[i]=arreglo[i];
                 
            }
    
        return copia;
     
       }
  
  ///// DEPENDE DE VARIAS COSAS LA ELECCION DE UN ALGORITO, AVECES PARA POCOS ELEMENTOS, UN ALGORITMO O(N2) ES MAS EFICIENTE
  //// INTERCAMBIOS O(N)
  ////COMPARACIONES O(N^2)
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
  
  public static void InsertionSort(int[] arreglo){

     for (int i=1; i<arreglo.length; i++){     
       
    int  temp=arreglo[i];
    int prev=i;
  
        for (int j=i; j>0; j--){
       
               if (arreglo[j-1]>temp){
               arreglo[j]=arreglo[j-1];
               prev--;
               
              }else{
              
              break;
              
              }
        }
    }   
  }
  public static void bubbleSort(int[] arreglo){
      for (int i=0; i<arreglo.length; i++){
          
          for (int j=0; i<arreglo.length; i++){
              
              if (arreglo [j]>arreglo[j+1]){
                  int temp=arreglo[j];
                  arreglo[j]=arreglo[j+1];
                  arreglo[j+1]=temp;
                  
              }
          }
      }
  }
  
public static void quickSort1(int[] arreglo, int piv, int va1, int va2) {

    if (piv < va2) {
        int pivote = piv;
        int valorMayor = va1;
        int valorMenor = va2;

        
        while (arreglo[valorMayor] <= arreglo[pivote] && valorMayor < va2) {
            valorMayor++;
        }

     
        while (arreglo[valorMenor] > arreglo[pivote]) {
            valorMenor--;
        }

        if (valorMayor < valorMenor) {
          
            int aux = arreglo[valorMayor];
            arreglo[valorMayor] = arreglo[valorMenor];
            arreglo[valorMenor] = aux;
            
            quickSort1(arreglo, pivote, valorMayor, valorMenor);
        } else {

            int aux = arreglo[pivote];
            arreglo[pivote] = arreglo[valorMenor];
            arreglo[valorMenor] = aux;

             
            quickSort1(arreglo, piv, piv + 1, valorMenor - 1);

            quickSort1(arreglo, valorMenor + 1, valorMenor + 2, va2);
        }
    }
}
}


