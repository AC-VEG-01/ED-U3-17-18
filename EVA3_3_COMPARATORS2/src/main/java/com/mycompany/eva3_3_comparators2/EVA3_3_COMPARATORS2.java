/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_comparators2;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Angel Vega
 */
public class EVA3_3_COMPARATORS2 {

    public static void main(String[] args) {
        LinkedList <String>datos=new LinkedList();
        datos.add("Hola");
        datos.add("Mundo");
        datos.add("Cruel");
        datos.add("!!!");
        System.out.println(datos);
      
        Comparator comparator= new Comparator(){
              @Override
              public int compare(Object o1, Object o2) {
                 int resu=0;
                 
                 String cade1=(String)o1;
                 String cade2=(String)o2;
                 resu=cade1.compareTo(cade2);
                 return resu;
              }
            
            
        };
          datos.sort(comparator);
          System.out.println(datos);
    }
}
