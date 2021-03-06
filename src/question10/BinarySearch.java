/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class BinarySearch {
    
// Find out if a key x exists in the sorted array
    // A[left..right] or not using binary search algorithm

    /**
     *
     * @param A
     * @param left
     * @param right
     * @param x
     * @return
     */
    public static int binarySearch(int[] A, int left, int right, int x){
        // Base condition (search space is exhausted)
        if (left > right) {
            return -1;
        }
 
        // we find the mid value in the search space and
        // compares it with key value
 
        int mid = (left + right) / 2;
 
        // overflow can happen. Use below
        // int mid = left + (right - left) / 2;
 
        // Base condition (key value is found)
        if (x == A[mid]) {
            return mid;
        }
 
        // discard all elements in the right search space
        // including the mid element
        else if (x < A[mid]) {
            return binarySearch(A, left, mid - 1, x);
        }
 
        // discard all elements in the left search space
        // including the mid element
        else {
            return binarySearch(A, mid + 1, right, x);
        }
    }
 
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int[] A = { 2, 5, 6, 8, 9, 10 };
        int key = 8;
 
        int left = 0;
        int right = A.length - 1;
 
        int index = binarySearch(A, left, right, key);
 
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
