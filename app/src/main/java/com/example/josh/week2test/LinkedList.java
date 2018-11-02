package com.example.josh.week2test;

public class LinkedList {

    Node parent;

    public LinkedList(Node parent) {
        this.parent = parent;
    }

    public void addNode(Node node) {
        Node loopNode = parent;
        while (loopNode.getNext() != null) {
            loopNode = loopNode.getNext();
        }
        loopNode.setNext(node);
    }
    public void addNode(char previousChar,char newChar){
        Node previousNode = getNode(previousChar,false);
        Node newNode = new Node(previousNode.getNext(),newChar);
        previousNode.setNext(newNode);
    }

    public Node getNode(char findChar, boolean place) {
        Node previous = null;
        Node loopNode = parent;
        Node next = parent.getNext();
        while (loopNode.getNext() != null) {
            if (findChar == loopNode.getData()) {
                if (place)
                    return previous;
            } else
                return loopNode;

            previous = loopNode;
            loopNode = loopNode.getNext();
            next = loopNode.getNext();
        }
        return null;
    }


    public static LinkedList stringToLinked(String input){
        LinkedList output = null;
        for (int i = 0; i < input.length(); i++) {
            if(i == 0)
                output = new LinkedList(new Node(input.charAt(i)));
            else
                output.addNode(new Node(input.charAt(i)));

        }
        return output;
    }

    public static String linkedToString(LinkedList list){
        Node counter = list.getParent();
        String output = "";
        while(counter != null){
            output = output + counter.getData();
            counter = counter.getNext();
        }
        return output;
    }
    public void removeNode(char findChar) {

        if (getNode(findChar, true) == null) {
            setParent(getParent().getNext());
        }
        else{
            Node previous = getNode(findChar,true);
            previous.setNext(previous.getNext().getNext());
        }

    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }


}
