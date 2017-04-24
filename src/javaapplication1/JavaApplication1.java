/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;

/**
 *
 * @author iqgonzalez
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Array c = new Array("Pedro cuesta");
        String cadena = "pedro cuesta";
               
                
       // Array d = new Array(cadena);
        
       // Array e = new Array(80);
        
        
        
        System.out.println(c);
        
        System.out.println(c.geti(0));
        c.inserta('a');
        System.out.println(c);
        c.inserta1(5, '2');
        System.out.println(c);
        c.Borrar(2);
        System.out.println(c);
         */

        ListaTemperaturas lt = new ListaTemperaturas();

        lt.inserta("Orense", 25.0);
        lt.inserta("Vigo", 20.0);
        lt.inserta("Vigo", 2.0);
        System.out.println(lt.get("Vigo"));
        
        System.out.println(lt.getCiudades());
        System.out.println(lt);

   
    }

}
