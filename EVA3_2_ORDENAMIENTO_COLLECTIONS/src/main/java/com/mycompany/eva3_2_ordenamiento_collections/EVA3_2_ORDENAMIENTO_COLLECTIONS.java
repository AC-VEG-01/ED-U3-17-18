/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_ordenamiento_collections;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Angel Vega
 */
public class EVA3_2_ORDENAMIENTO_COLLECTIONS {

    public static void main(String[] args) {
        LinkedList <Integer>datos=new LinkedList();
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        datos.add((int)(Math.random()*100));
        System.out.println(datos);   
        Comparator comparator= new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
              int resu=0;
              int val1,val2;
              val1=(int)o1;
              val2=(int)o2;
                return val2-val1;
            }
            
        };
        datos.sort(comparator);
        System.out.println(datos); 
    }
}
