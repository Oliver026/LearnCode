package com.oliver.Algorithms.sort;

public class sort {

    private sort(){}

    /*
       冒泡排序，选择排序的外层循环都是为了给每一次内层排序循环固定起始位置
     */

    /**
     * 冒泡排序
     *   每趟循环从中找出相邻元素最大（最小），两两交换位置，将最大（最小）下沉到最下面
     *   起始点右边为有序部分，左边为需要排序，即冒泡的部分
     * @param arr
     */

    public static void bubbleSort(Comparable[] arr){

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j].compareTo(arr[j+1])>0)
                    swap(arr, j, j+1);
            }
        }

    }

    /**
     * 选择排序
     * 以每一轮循环的第一个元素作为分界，左边为有序，右边为需要排序
     *           从每一趟的循环中找到该趟中的最小元素的索引，
     *           将最小位置索引和循环的第一个元素交换位置
     *           如此循环到最后一个元素
     * @param arr
     */
    public static void selectSort(Comparable[] arr){

        for (int i=0;i<arr.length;i++){
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j].compareTo(arr[minIndex])<0)
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }

    }

    private static void swap(Comparable[] tar, int i, int j){
        Comparable tmp = tar[i];
        tar[i] = tar[j];
        tar[j] = tmp;
    }


}

