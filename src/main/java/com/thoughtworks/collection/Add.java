package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (rightBorder < leftBorder) {
            rightBorder += leftBorder;
            leftBorder = rightBorder - leftBorder;
            rightBorder = rightBorder - leftBorder;
        }
        return IntStream.range(leftBorder, rightBorder + 1)
                .filter(value -> value % 2 == 0)
                .sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (rightBorder < leftBorder) {
            rightBorder += leftBorder;
            leftBorder = rightBorder - leftBorder;
            rightBorder = rightBorder - leftBorder;
        }
        return IntStream.range(leftBorder, rightBorder + 1)
                .filter(value -> value % 2 == 1)
                .sum();
//        int result = 0;
//        for (int i = leftBorder; i <= rightBorder; i++) {
//            result += (i % 2 ==1) ? i : 0;
//        }
//        return result;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            return arrayList.stream()
                    .map(value -> value * 3 + 2)
                    .mapToInt(value -> Integer.valueOf(value))
                    .sum();
        }
        return 0;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        if (arrayList != null) {
            return arrayList.stream()
                    .map(value -> value % 2 == 0 ? value : value * 3 + 2)
                    .collect(Collectors.toList());

        }
        return null;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        if (arrayList != null) {
            return arrayList.stream()
                    .filter(ykg -> ykg % 2 != 0)
                    .map(ykg -> ykg * 3 + 5)
                    .mapToInt(ykg -> Integer.valueOf(ykg))
                    .sum();
        }
        return 0;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        if (arrayList != null) {
            return arrayList.stream()
                    .filter(ykg -> ykg % 2 == 0)
                    .mapToDouble(ykg -> Double.valueOf(ykg))
                    .average().getAsDouble();
        }
        return 0;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        if (arrayList != null) {
            List<Integer> list = arrayList.stream().filter(ykg -> ykg % 2 == 0).sorted().collect(Collectors.toList());
            return list.size() % 2 == 0 ? list.stream().skip(list.size() / 2 -1).limit(2).mapToInt(ykg -> ykg).average().getAsDouble()
                    : list.stream().skip(list.size() / 2 ).limit(1).mapToInt(ykg -> ykg).sum();
        }
        return 0;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        if (arrayList == null) {
            return arrayList.stream().filter(ykg -> ykg % 2 == 0).anyMatch(integer -> integer == specialElment);
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        if (arrayList != null) {
            return arrayList.stream()
                    .filter(ykg -> ykg % 2 ==0)
                    .distinct()
                    .collect(Collectors.toList());

        }
        return null;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        if (arrayList != null) {
            List<Integer> evenList = arrayList.stream().filter(ykg -> ykg % 2 ==0).sorted().collect(Collectors.toList());
            List<Integer> oddList = arrayList.stream().filter(ykg -> ykg % 2 !=0).sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
            evenList.addAll(oddList);
            return evenList;
        }
        return null;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        if (arrayList != null && arrayList.size() > 1) {
            ArrayList<Integer> result = new ArrayList<>();
            IntStream.range(0, arrayList.size() - 1)
                    .forEach(value -> result.add((arrayList.get(value) + arrayList.get(value + 1))*3));


            return result;
        }
        return null;
    }
}
