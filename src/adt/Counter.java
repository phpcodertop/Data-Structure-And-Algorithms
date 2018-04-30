/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author menna
 */
public class Counter {
    private String name = "";
    private int value = 0;
    
    public Counter(String str){
        this.name = str;
    }
    
    public void increments(){
        this.value++;
    }
    
    public int getCurrentValue(){
        return this.value;
    }
    
    @Override
    public String toString(){
        return this.name + " : " + this.value;
    }
    
}
