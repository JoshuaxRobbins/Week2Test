package com.example.josh.week2test;

import java.util.Stack;

public class Queue {

    Stack<Object> stackOne = new Stack<>();
    Stack<Object> stackTwo = new Stack<>();



    public Queue() {

    }

    public void enqueue(Object input){
        stackOne.push(input);
    }

    public Object dequeue(){
        Object output = null;
        while(stackOne.size() != 0) {
            stackTwo.push(stackOne.pop());
        }
        output = stackTwo.pop();
        while(stackTwo.size() != 0){
            stackOne.push(stackTwo.pop());
        }

        return output;
    }
}
