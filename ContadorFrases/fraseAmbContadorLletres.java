/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.introduccio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class fraseAmbContadorLletres {
    static Scanner lc = new Scanner(System.in);
    public static String frase = "";
    static ArrayList<Lletra> Lletres = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Introdueix una frase: ");
        frase = lc.nextLine();
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {

            char c = frase.charAt(i);
            if (c != ' ') {
                Lletra a = new Lletra(c);
                int pos = Lletres.indexOf(a);
                if (pos != -1) {
                    Lletres.get(pos).incre();
                } else {
                    Lletres.add(a);
                }
            }

        }
        for (Lletra llt : Lletres) {
            System.out.println(llt);
        }
    }
}
