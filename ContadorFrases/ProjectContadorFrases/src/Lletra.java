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
/**
* a emmagatzem el caracter de l'objecte lletra.
*
*/
    private char a;
    private int v = 0;

    public Lletra(char a) {
        this.a = a;
        this.v++;
    }

    public void incre() {
        v++;
    }
/**
*
* toString retorna una cadena concetanada de la lletra i el numero de vagades.
*/

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
