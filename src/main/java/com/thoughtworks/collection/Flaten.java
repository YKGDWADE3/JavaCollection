package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        if (array == null) {
            return null;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultList.add(array[i][j]);
            }
        }
        return resultList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        ArrayList<Integer> oneDimList = (ArrayList<Integer>) transformToOneDimesional();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(oneDimList);
        oneDimList.clear();
        oneDimList.addAll(linkedHashSet);
        return oneDimList;
    }
}
