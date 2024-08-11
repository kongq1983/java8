package com.kq.hash;

public class HashDemo {

    public static int getIndex(int num) {
        return (16-1) & num;
    }

    static final int hash(int h) {
        return h ^ (h >>> 16);
    }

    public static void main(String[] args) {
        String [] strings = {"aa","aaa","abc","aef","bba","bbc","abb"};

        for(String s : strings) {
            int hashcode = s.hashCode();
            int index = getIndex(hashcode);
            int hash = hash(hashcode);
            int index1 = getIndex(hash);
            System.out.println(s+" hashcode="+hashcode+" hash="+hash+" ,index="+index+"  hashmapHashIndex="+index1);
        }

    }

}
