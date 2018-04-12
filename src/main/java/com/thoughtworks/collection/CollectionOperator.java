package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        boolean upSort = left <= right;
        ArrayList<Integer> resultList = new ArrayList<>();
        int min = Math.min(left, right);
        int max = Math.max(left, right);
        for (int i = min; i <= max; i++) {
            resultList.add(i);
        }
        if (!upSort) {
            Collections.reverse(resultList);
        }
        return resultList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        boolean upSort = left <= right;
        ArrayList<Integer> resultList = new ArrayList<>();
        int min = Math.min(left, right);
        int max = Math.max(left, right);
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                resultList.add(i);
            }
        }
        if (!upSort) {
            Collections.reverse(resultList);
        }
        return resultList;
    }

    public List<Integer> popEvenElments(int[] array) {
        if (array != null) {
            ArrayList<Integer> resultList = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    resultList.add(array[i]);
                }
            }
            return resultList;
        }
        return null;
    }

    public int popLastElment(int[] array) {
        if (array != null) {
            return array[array.length - 1];
        }
        return 0;
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> firstList = transformArrayToList(firstArray);
        ArrayList<Integer> secondList = transformArrayToList(secondArray);
        firstList.retainAll(secondList);
        return firstList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = Arrays.asList(firstArray);
        List<Integer> secondList = Arrays.asList(secondArray);
        ArrayList<Integer> first = new ArrayList<>(firstList);
        ArrayList<Integer> second = new ArrayList<>(secondList);
        second.removeAll(first);
        first.addAll(second);
        return first;
    }

    public ArrayList<Integer> transformArrayToList(int[] array){
        if (array != null) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                result.add(array[i]);
            }
            return result;
        }
        return null;
    }
}
