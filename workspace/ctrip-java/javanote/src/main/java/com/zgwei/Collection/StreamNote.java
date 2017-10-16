package com.zgwei.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by zgwei on 2017/8/23.
 */
public class StreamNote {



    public static void main(String[] args){
        String[] strArray = new String[]{"a","b","c"};
        Stream stream = Stream.of(strArray);
        stream.forEach(arg -> System.out.println(arg));

        List<Integer> sortLists = new ArrayList<>();
        sortLists.add(1);
        sortLists.add(4);
        sortLists.add(6);
        sortLists.add(3);
        sortLists.add(2);
        sortLists.add(2);
        List<Integer> afterSortLists = sortLists.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
        System.out.println(afterSortLists);
        System.out.println(sortLists);
        System.out.println(afterSortLists.stream().max(Comparator.comparing(Integer::intValue)));
        List<Integer> distinctList = sortLists.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);
        System.out.println(sortLists.stream().anyMatch(i -> i==2));




    }





}
