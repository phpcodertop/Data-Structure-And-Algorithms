/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorthms.and.datastructure;

import ds.Stack;
import java.util.Iterator;

/**
 *
 * @author menna
 */
public class AlgorthmsAndDatastructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack myStack = new Stack(3);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        
        
        
        // print all array elements
        System.out.println("value");
        while (!myStack.isEmpty()) {            
            long value = myStack.pop();
            System.out.println(value);
        }
    }
    
}
