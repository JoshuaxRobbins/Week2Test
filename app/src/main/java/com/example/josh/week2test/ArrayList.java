package com.example.josh.week2test;

public class ArrayList {
    Object[] arrayList = new Object[5];


    public ArrayList() {

    }

    public int getSize() {
        return arrayList.length;
    }

    public void expand() {
        int newSize = arrayList.length * 2;
        Object[] temp = new Object[newSize];
        for (int i = 0; i < arrayList.length; i++) {
            temp[i] = arrayList[i];

        }
        arrayList = temp;
    }

    public void set(Object input, int place) {
        arrayList[place] = input;
    }

    public Object getData(int place){
        return arrayList[place];
    }

    public void add(Object input) {

        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] == null) {
                arrayList[i] = input;
                break;
            }
            else if (i == arrayList.length - 2 && arrayList[i] != null)
                expand();


        }
    }
}