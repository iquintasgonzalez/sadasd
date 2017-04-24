/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iqgonzalez
 */
public class Array {

    ArrayList<Character> ya = new ArrayList<>();
    String x;
    int tamaño;

    public Array() {
    }

    public Array(String x) {

        for (int i = 0; i < x.length(); i++) {
            char letra = x.charAt(i);
            ya.add(letra);
        }

    }

    public Array(int x) {
        this.tamaño = x;
        ArrayList<Character> ya = new ArrayList<>(tamaño);
    }

    public String geti(int i) {
        return ya.get(i).toString();
    }

    public void set(int i, char c) {
        ya.add(i, c);
    }

    public void inserta(char c) {
        ya.add(c);
    }

    public void Borrar(int i) {
        ya.remove(i);
    }

    public void inserta1(int i, char c) {
        ya.add(i, c);
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        for (int i = 0; i < ya.size(); i++) {
            toret.append(ya.get(i).toString());
        }

        return toret.toString();
    }

}
