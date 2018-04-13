package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reduce implements SingleLink<Integer>{

    List<Integer> mArrayList;

    public Reduce(List<Integer> arrayList) {
        this.mArrayList = arrayList;
    }

    public int getMaximum() {
        if (mArrayList != null) {
            return Collections.max(mArrayList);
        }
        return 0;
    }

    public double getMinimum() {
        if (mArrayList != null) {
            return Collections.min(mArrayList);
        }
        return 0;
    }

    public double getAverage() {
        if (mArrayList != null) {
            return mArrayList.stream().mapToDouble(Integer :: intValue).average().getAsDouble();
        }
        return 0;
    }

    public double getOrderedMedian() {
        if (mArrayList != null) {
            Collections.sort(mArrayList);
            int size = mArrayList.size();
            if (size % 2 == 0) {
                return (mArrayList.get(size / 2) + mArrayList.get(size / 2 - 1)) / 2.0;
            } else {
                return mArrayList.get(size / 2);
            }
        }
        return -1;
    }

    public int getFirstEven() {
        if (mArrayList != null) {
            for (int i = 0; i < mArrayList.size(); i++) {
                if (mArrayList.get(i) % 2 == 0) {
                    return mArrayList.get(i);
                }
            }
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        if (mArrayList != null) {
            for (int i = 0; i < mArrayList.size(); i++) {
                if (mArrayList.get(i) % 2 == 0) {
                    return i;
                }
            }
        }
        return 0;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (mArrayList != null && arrayList != null && mArrayList.size() == arrayList.size()) {
            for (int i = 0; i < mArrayList.size(); i++) {
                if (mArrayList.get(i) != arrayList.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        if (mArrayList != null && !mArrayList.isEmpty()) {
            Collections.sort(mArrayList);
            int size = size();
            if (size % 2 == 0){
                return ((Integer) getNode(size / 2) + (Integer) getNode(size / 2 + 1)) / 2.0;
            }else{
                return Double.valueOf(mArrayList.get(size / 2));
            }
        }
        return Double.valueOf(0);
    }

    public int getLastOdd() {
        if (mArrayList != null) {
            int result = 0;
            for (int i = 0; i < mArrayList.size(); i++) {
                if (mArrayList.get(i) % 2 == 1) {
                    result = mArrayList.get(i);
                }
            }
            return result;
        }
        return -1;
    }

    public int getIndexOfLastOdd() {
        if (mArrayList != null) {
            int result = 0;
            for (int i = 0; i < mArrayList.size(); i++) {
                if (mArrayList.get(i) % 2 == 1) {
                    result = i;
                }
            }
            return result;
        }
        return -1;
    }

    @Override
    public Integer getHeaderData() {
        if (mArrayList != null) {
            return mArrayList.get(0);
        }
        return 0;
    }

    @Override
    public Integer getTailData() {
        if (mArrayList != null) {
            return mArrayList.get(mArrayList.size() - 1);
        }
        return null;
    }

    @Override
    public int size() {
        if (mArrayList != null) {
            return mArrayList.size();
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if (mArrayList != null) {
            return mArrayList.isEmpty();
        }
        return false;
    }

    @Override
    public boolean deleteFirst() {
        if (mArrayList != null) {
            mArrayList.remove(0);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteLast() {
        if (mArrayList != null) {
            mArrayList.remove(mArrayList.size() - 1);
            return true;
        }
        return false;
    }

    @Override
    public void addHeadPointer(Integer item) {
        if (mArrayList == null) {
            mArrayList = new ArrayList<>();
            mArrayList.add(item);
        } else {
            mArrayList.add(0,item);
        }
    }

    @Override
    public void addTailPointer(Integer item) {
        if (mArrayList == null) {
            mArrayList = new ArrayList<>();
            mArrayList.add(item);
        } else {
            mArrayList.add(item);
        }
    }

    @Override
    public Integer getNode(int index) {
        if (mArrayList != null && index <= mArrayList.size()) {
            return mArrayList.get(index - 1);
        }
        return null;
    }
}
