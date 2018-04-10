/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cesar;

import java.util.ArrayList;

/**
 *
 * @author emmrove
 */
public class Elementos {

    private static String letter = "AÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚVWXYZ";
    private static String number = "12345";
    private ArrayList<Character> letras = new ArrayList<>();
    private ArrayList<Character> numeros = new ArrayList<>();

    public Elementos() {
        Llenar();
    }

    private void Llenar() {
        for (int i = 0; i < letter.length(); i++) {
            letras.add(letter.charAt(i));
        }
        for (int i = 0; i < number.length(); i++) {
            numeros.add(number.charAt(i));
        }
    }

    public ArrayList<Character> getLetras() {
        return letras;
    }

    public ArrayList<Character> getNumeros() {
        return numeros;
    }
}
