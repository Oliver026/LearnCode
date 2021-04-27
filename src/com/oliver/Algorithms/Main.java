package com.oliver.Algorithms;


import com.oliver.Algorithms.sort.sort;

public class Main {

    public static void main(String[] args) {
        Main res = new Main();
        Integer[] arr  = {2,3,1,7,8,10,3};
//        sort.bubbleSort(arr);
        sort.selectSort(arr);
        System.out.println(res.toString(arr));
    }

    public String toString(Comparable[] arr){

        StringBuilder res = new StringBuilder();
        res.append('[');
        for (int i=0;i<arr.length;i++){
            res.append(arr[i]);
            if (i < arr.length-1)
                res.append(',');
        }

        res.append(']');
        return res.toString();
    }
}
