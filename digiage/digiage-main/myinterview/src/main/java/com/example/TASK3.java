package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */
public class TASK3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int aleatory = (int) (Math.random() * 20);

        for(int i = 0; i < aleatory; i++) {
            list.add(String.valueOf((int)(Math.random() * 20)));
        }
        System.out.println(list);
        List<Object> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList.size());
    }
  
}
