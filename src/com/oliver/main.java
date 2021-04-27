package com.oliver;

public class main {
    public static void main(String[] args){

        Array<Integer> tArray = new Array<>(4);
        tArray.addFirst(1);
        tArray.addFirst(2);
        tArray.addFirst(3);
        tArray.addFirst(4);
        tArray.add(4,1);
        tArray.add(0,7);
        System.out.println(tArray.toString());
        System.out.println(tArray.size());

    }
}
