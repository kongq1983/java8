package com.kq.sort;

public class MySortTest {

    public static void main(String[] args) {
        int[] array = {8,2,30,16,9,1,28,18,22,9,5,15};


        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i]>array[j]) {
                    swap(array,i,j);
                }
            }
        }

        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }

    }

    static void swap(int[] array,int p1,int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

}
