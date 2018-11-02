package com.example.josh.week2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public static void main(String[] args) {

//        String test = "test";
//        LinkedList linkedList = LinkedList.stringToLinked(test);
//        linkedList.removeNode('e');
//        linkedList.addNode('s','t');
//        String output = LinkedList.linkedToString(linkedList);
//
//        System.out.println(output);

//        Queue queue = new Queue();
//        queue.enqueue("one");
//        queue.enqueue("two");
//        queue.enqueue("five");
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        queue.enqueue("three");
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());

//        ArrayList arrayList = new ArrayList();
//        arrayList.add("One");
//        System.out.println("eh");
//        arrayList.add("One");
//        arrayList.add("One");
//        arrayList.add("One");
//        arrayList.add("One");
//        System.out.println(arrayList.getSize());

        int[] list = {4,5,2,6,3,1,7};
        Tree tree = new Tree();
        tree.createTree(list);
    }
}
