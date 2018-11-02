package com.example.josh.week2test;

public class Tree {
    Leaf root;

    public Tree() {
        root = null;
    }

    public Tree(Leaf root) {
        this.root = root;
    }

    public void createTree(int[] list){
        for (int i:list) {
            if(root != null){
                Leaf leaf = new Leaf(root.getLeft(),root.getRight(),i,root);
                System.out.println(leaf.getData());
                addLeaf(leaf);
            }else{
                root = new Leaf(null,null,i);
            }

        }
    }

    public void addLeaf(Leaf leaf){

        if(leaf.getRoot().getData() > leaf.getData()){
            if(leaf.getLeft() == null) {
                makeLeaf(leaf,false);
                addLeaf(leaf);
            }
            else{
                leaf.getRoot().setRoot(leaf);
            }
        }
        else
            if(leaf.getRight() == null){
                makeLeaf(leaf,true);
                addLeaf(leaf);
            }
            else{
                leaf.getRoot().setRoot(leaf);
            }

    }

    private void makeLeaf(Leaf leaf,boolean leftRight) {
        if (leftRight){
            leaf.setRoot(root.getLeft());
        }
        else
            leaf.setRoot(root.getRight());
        leaf.setLeft(root.getLeft());
        leaf.setRight(root.getRight());
    }
}
