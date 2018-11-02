package com.example.josh.week2test;

public class Node {

    private Node next;
    private Character data;

    public Node(Node next, Character data) {
        this.next = next;
        this.data = data;
    }

    public Node(Character data){
        this.next = null;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Character getData() {
        return data;
    }

    public void setData(Character data) {
        this.data = data;
    }
}
