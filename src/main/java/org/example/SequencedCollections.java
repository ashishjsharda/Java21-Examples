package org.example;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollections {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        //New Features
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
