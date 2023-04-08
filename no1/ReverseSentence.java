package week8.no1;

import java.util.*;

public class ReverseSentence {
    
    int size;
    int top;
    char data[];

    public ReverseSentence (int size){
        this.size = size;
        data = new char[size];
        top = -1;
    }

    public boolean isEmpty (){
        if (top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if (top == size - 1){
            return true;
        }
        else{
            return false;
        }
    }

    public void push(char dt){
        if(!isFull()){
            top++;
            data[top] = dt;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public char pop(){
        if(!isEmpty()){
            char x = data[top];
            top--;
            return x;
        }
        else{
            System.out.println("Stack is empty");
            return '\0';
        }
    }

    public char peek(){
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack is empty");
            return '\0';
        }
    }

    public void print(){
        System.out.println("Stack content: ");
        for(int i = top; i >- 0; i--){
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }

    public void clear(){
        if(!isEmpty()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack is now empty");
        }
        else{
            System.out.println("Failed ! Stack is still empty");
        }
    }

}
