package com.example.josh.week2test;

public class Leaf {
    int data;
    Leaf left = null;
    Leaf right = null;
    Leaf root = null;

    public Leaf(Leaf left, Leaf right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public Leaf(Leaf left, Leaf right,int data, Leaf root) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.root = root;
    }


    public Leaf getLeft() {
        return left;
    }

    public void setLeft(Leaf left) {
        this.left = left;
    }

    public Leaf getRight() {
        return right;
    }

    public void setRight(Leaf right) {
        this.right = right;
    }

    public Leaf getRoot() {
        return root;
    }

    public void setRoot(Leaf root) {
        this.root = root;
    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }
}
