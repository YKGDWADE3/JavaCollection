package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        if (array == null) {
            return null;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            resultList.add(array.get(i) * 3);
        }
        return resultList;
    }

    public List<String> mapLetter() {
        if (array == null) {
            return null;
        }
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            resultList.add(letterList.get((array.get(i)-1) % 26));
        }
        return resultList;
    }

    public List<String> mapLetters() {
        if (array == null) {
            return null;
        }
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            resultList.add(mapLetters(array.get(i)));
        }
        return resultList;
    }

    public List<Integer> sortFromBig() {
        if (array == null) {
            return null;
        }
        ArrayList<Integer> resultList = new ArrayList<>(array);
        Collections.sort(resultList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 >= o2 ? -1 : 1;
            }
        });
        return resultList;
    }

    public List<Integer> sortFromSmall() {
        if (array == null) {
            return null;
        }
        ArrayList<Integer> resultList = new ArrayList<>(array);
        Collections.sort(resultList);
        return resultList;
    }

    public String mapLetters(int number){
        StringBuffer stringBuffer = new StringBuffer();
        int index;
        while (number > 0) {
            stringBuffer.append(letterList.get((--number) % 26));
            number /= 26;
        }
        return stringBuffer.reverse().toString();
    }
}
