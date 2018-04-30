package algorithms.and.datastructure;

import ds.Stack;

/**
 *
 * @author Ahmed Maher Halima
 * @email phpcodertop@gmail.com
 */
public class AlgorthmsAndDatastructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Stack myStack = new Stack(3);
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        myStack.push(40);
        
        
        
        // print all array elements
        System.out.println("Reversed Text");
        System.out.println(reverseString("AHMED"));
    }
    
    public static String reverseString(String input){
        
        int stackSize = input.length(); // get string length
        Stack myStack = new Stack(stackSize); // create stack
        for(int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);
            myStack.push(currentChar);
        }
        
        String reversedText = "";
        while (!myStack.isEmpty()) {
            char ch = myStack.pop();
            reversedText = reversedText + ch;
        }
        return reversedText;
    }
    
}
