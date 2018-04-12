package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int temp;
        while (true) {
            temp = random.nextInt(3);
            number -= temp;
            if (number > 0) {
                resultList.add(number);
            } else {
                break;
            }
        }
        return resultList;
    }
}
