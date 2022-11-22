package com.Abdiwali.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        list2.add(34);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);

        List<Integer> vector=new Vector<>();
        vector.add(21);
        vector.add(12);
        vector.add(11);
        System.out.println(vector);
    }
}
