/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.ArrayList;

/**
 *
 * @author SaiVarsha Vellanki
 */
public class ListClass {

    ArrayList<Integer> elements;
    int index = 0;

    /**
     *
     * @param elements
     */
    public ListClass(ArrayList<Integer> elements) {
        this.elements = elements;
    }

    /**
     *
     * @param n
     * @return
     */
    public int searchElemnt(int n) {
        if (elements.size() < index + 1) {
            System.out.println("no such element founf");
        }

        if (elements.get(index) == n) {
            return index;
        } else {
            index = index + 1;
            return searchElemnt(n);
        }

    }

}
