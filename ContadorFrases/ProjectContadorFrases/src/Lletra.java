/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.introduccio;

import java.util.Map;

/**
 *
 * @author user
 */
public class Lletra {

    private char a;
    private int v = 0;

    public Lletra(char a) {
        this.a = a;
        this.v++;
    }

    public void incre() {
        v++;
    }

    public String toString() {
        return a + " : " + v;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Lletra ))
        return false;

        Lletra other = (Lletra) o;
        return this.a == other.a;
    }

}
