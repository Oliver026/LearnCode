package com.oliver;

public class Array<E>{

    private E[] data;
    private int size;

    public Array(int capacity){
        data = (E[] ) new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }


    public Integer size(){
        return size;
    }

    public void add(int index, E target){

        if (index<0 || index>size)
            throw  new IllegalArgumentException("fail,index should >0 or <size");

        if (data.length == size)
            resize(2 * size);

        for (int i = size-1; i>=index;i--){
            data[i+1] = data[i];
        }
        data[index] = target;
        size++;
    }

    public void addFirst(E target){
        this.add(0,target);
    }

    public void addLast(E target){
        this.add(size, target);
    }

    public E remove(int index){

        if (index<0 || index>size)
            throw  new IllegalArgumentException("fail,index should >0 or <size");

        if (index <= data.length/2)
            resize(data.length/2);
        for (int i = index+1;i<size;i++)
            data[i-1] = data[i];
        size --;
        return data[index];
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size-1);
    }

    public void set(int index, E target){
        data[index] = target;
    }

    public void setFist(E target){
        data[0] = target;
    }
    public void setLast(E target){
        data[size-1] = target;
    }
    public E get(int index){
        return data[index-1];
    }
    public E getFirst(){
        return data[0];
    }

    public E getLast(){
        return data[size-1];
    }


    private void resize(int newcapacity){
        E[] newData = (E[]) new Object[newcapacity];
        for (int i=0;i<size;i++)
            newData[i] = data[i];
        data = newData;
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append('[');
        for (int i=0;i<size;i++){
            res.append(data[i]);
            if (i!= size-1)
                res.append(',');
        }
        res.append(']');
        return res.toString();
    }
}
