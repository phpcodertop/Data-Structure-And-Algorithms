package ds;

/**
 *
 * @author Ahmed Maher Halima
 * @email phpcodertop@gmail.com
 */
public class Stack {
    
    private int top;
    private final char[] stackArrar;
    private final int maxSize;
    
    public Stack(int size){
        this.maxSize = size;
        this.stackArrar = new char[size];
        this.top = -1;
    }
    
    
    public void push(char i){
        if(this.isFull()){
            System.out.println("This Stack is already Full");
        }else{
            this.top++;
            this.stackArrar[top] = i;
        }      
    }
    
    public char pop(){
        if(this.isEmpty()){
            System.out.println("This Stack is already empty");
        }else{
            int old_top = this.top;
            this.top--;
            return stackArrar[old_top]; 
        }
        return ' ';
    }
    
    public char peak(){
        return this.stackArrar[this.top];
    }
    
    public boolean isEmpty(){
        return (this.top == -1);
    }
    
    public boolean isFull(){
        return (this.maxSize-1 == this.top);
    }
    
    public char[] stackContent(){
        return this.stackArrar;
    }
    
}
