/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cesar;

/**
 *
 * @author emmrove
 */
public class Conversion {

    private Elementos ele = new Elementos();

    Integer desplaza = 0;

    public Conversion(Integer desplazamiento) {
        this.desplaza = desplazamiento;
    }

    public boolean EsMayuscula(Character let) {
        if (let == Character.toUpperCase(let)) {
            return true;
        } else {
            return false;
        }
    }

    public Character Cambio(Character let) {
        if (desplaza < 1) {
            desplaza = 1;
        }
        boolean era = EsMayuscula(let);
        let = Character.toUpperCase(let);
        Character valor = null;
        Integer posicion_l = ele.getLetras().indexOf(let);
        Integer posicion_n = ele.getNumeros().indexOf(let);

        if (posicion_l > -1) {
            if (posicion_l + desplaza < ele.getLetras().size()) {
                valor = ele.getLetras().get(posicion_l + desplaza);
                if (!era) {
                    valor = Character.toLowerCase(valor);
                }
            } else {
                while (desplaza + posicion_l > ele.getLetras().size()) {
                    desplaza -= ele.getLetras().size();
                }
                valor = ele.getLetras().get((posicion_l + desplaza));
                if (!era) {
                    valor = Character.toLowerCase(valor);
                }
            }
        } else {
            if (posicion_n > -1) {
                if (posicion_n + (desplaza - 1) < ele.getNumeros().size()) {
                    valor = ele.getNumeros().get(posicion_n + (desplaza - 1));
                } else {
                    while ((desplaza - 1) + posicion_n >= ele.getNumeros().size()) {
                        desplaza -= ele.getNumeros().size();
                    }
                    valor = ele.getNumeros().get((posicion_n + (desplaza - 1)));
                }
            } else {
                valor = let;
            }
        }
        return valor;
    }

    public void Palabra_a_Cifrar(String palabra) {
        System.out.println("Palabra a Cifrar: " + palabra);
        String salida = "";
        for (int i = 0; i < palabra.length(); i++) {
            salida += Cambio(palabra.charAt(i));
        }
        System.out.println("Palabra Cifrada: " + salida);
    }

}
