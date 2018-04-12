package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        if (array == null) {
            return null;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                resultList.add(array.get(i));
            }
        }
        return resultList;
    }

    public List<Integer> filterMultipleOfThree() {
        if (array == null) {
            return null;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 3 == 0) {
                resultList.add(array.get(i));
            }
        }
        return resultList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        if (firstList == null || secondList == null) {
            return null;
        }
        ArrayList<Integer> resultList = new ArrayList<>(firstList);
        ArrayList<Integer> secondArrayList = new ArrayList<>(secondList);
        resultList.retainAll(secondArrayList);
        return resultList;
    }

    public List<Integer> getDifferentElements() {
        if (array == null) {
            return null;
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(array);
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(linkedHashSet);
        return result;
    }
}