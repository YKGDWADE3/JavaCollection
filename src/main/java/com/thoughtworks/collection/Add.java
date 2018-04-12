package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (rightBorder < leftBorder) {
            rightBorder += leftBorder;
            leftBorder = rightBorder - leftBorder;
            rightBorder = rightBorder - leftBorder;
        }
        int result = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            result += (i % 2 ==0) ? i : 0;
        }
        return result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (rightBorder < leftBorder) {
            rightBorder += leftBorder;
            leftBorder = rightBorder - leftBorder;
            rightBorder = rightBorder - leftBorder;
        }
        int result = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            result += (i % 2 ==1) ? i : 0;
        }
        return result;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            int result = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                result += arrayList.get(i) * 3 + 2;
            }
            return result;
        }
        return 0;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        if (arrayList != null) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                int temp = arrayList.get(i);
                result.add((temp % 2 == 0) ? temp : temp * 3 + 2);
            }
            return result;
        }
        return null;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        if (arrayList != null) {
            int result = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                int temp = arrayList.get(i);
                result += (temp % 2 == 1) ? temp * 3 + 5 : 0;
            }
            return result;
        }
        return 0;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        if (arrayList != null) {
            int evenSum = 0;
            int evenNum = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 0) {
                    evenNum++;
                    evenSum += arrayList.get(i);
                }
            }
            return evenNum > 0 ? evenSum / evenNum : 0;
        }
        return 0;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        if (arrayList != null) {
            ArrayList<Integer> evenList = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 0) {
                    evenList.add(arrayList.get(i));
                }
            }
            Collections.sort(evenList);
            double result;
            int length = evenList.size();
            if (length % 2 == 0) {
                result = (evenList.get(length / 2) + evenList.get(length / 2 - 1)) / 2;
            } else {
                result = evenList.get(length / 2);
            }
            return result;
        }
        return 0;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        if (arrayList == null || specialElment % 2 == 1) {
            return false;
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 0 && arrayList.get(i) == specialElment) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        if (arrayList != null) {
            HashSet<Integer> evenSet = new HashSet<>();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 0) {
                    evenSet.add(arrayList.get(i));
                }
            }
            return new ArrayList<>(evenSet);
        }
        return null;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        if (arrayList != null) {
            ArrayList<Integer> evenList = new ArrayList<>();
            ArrayList<Integer> oddList = new ArrayList<>();
            int temp;
            for (int i = 0; i < arrayList.size(); i++) {
                temp = arrayList.get(i);
                if (temp % 2 == 0) {
                    evenList.add(temp);
                } else {
                    oddList.add(temp);
                }
            }
            Collections.sort(evenList);
            Collections.sort(oddList);
            ArrayList<Integer> resultList = new ArrayList<>();
            for (int i = 0; i < evenList.size(); i++) {
                resultList.add(evenList.get(i));
            }
            for (int i = oddList.size() - 1; i >=0 ; i--) {
                resultList.add(oddList.get(i));
            }
            return resultList;
        }
        return null;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        if (arrayList != null && arrayList.size() > 1) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < arrayList.size() - 1; i++) {
                result.add((arrayList.get(i) + arrayList.get(i + 1)) *3);
            }
            return result;
        }
        return null;
    }
}
