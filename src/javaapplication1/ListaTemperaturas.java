/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author iqgonzalez
 */
public class ListaTemperaturas {

    HashMap<String, Double> temperaturas = new HashMap<>();

    public ListaTemperaturas() {
    }

    public void inserta(String c, double t) {
        temperaturas.put(c, t);

    }

    public double get(String c) {
        return temperaturas.get(c);

    }
    public double getString (String c) {
        return temperaturas.get(c);

    }

    public List<String> getCiudades() {
        ArrayList<String> i= new ArrayList<>();
        for (int j = 0; j < temperaturas.size(); j++) {
            i.add(temperaturas.get(j));
        
        }
       return i;
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            toret.append(temperaturas );
        }
        return toret.toString();

    }
}
