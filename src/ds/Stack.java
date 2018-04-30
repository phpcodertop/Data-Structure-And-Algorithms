package ds;

/**
 *
 * @author Ahmed Maher Halima
 */
public class Stack {
    
    private int top;
    private final long[] stackArrar;
    private final int maxSize;
    
    public Stack(int size){
        this.maxSize = size;
        this.stackArrar = new long[size];
        this.top = -1;
    }
    
    
    public void push(long i){
        if(this.isFull()){
            System.out.println("This Stack is already Full");
        }else{
            this.top++;
            this.stackArrar[top] = i;
        }      
    }
    
    public long pop(){
        if(this.isEmpty()){
            System.out.println("This Stack is already empty");
        }else{
            int old_top = this.top;
            this.top--;
            return stackArrar[old_top]; 
        }
        return -1;
    }
    
    public long peak(){
        return this.stackArrar[this.top];
    }
    
    public boolean isEmpty(){
        return (this.top == -1);
    }
    
    public boolean isFull(){
        return (this.maxSize-1 == this.top);
    }
    
    public long[] stackContent(){
        return this.stackArrar;
    }
    
}
