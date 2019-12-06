package ir.maktab.java32.projects.operationonorderspairs;

import java.util.ArrayList;

public class DeleteInappropriateOrderedPairs {
    public static ArrayList<Integer> deleteFromArrayList(ArrayList<Integer> integerArrayList) {
        int size = integerArrayList.size()+1;
        int leftElement, rightElement;
        ArrayList<Integer> newList = new ArrayList<>();
        if (integerArrayList.size() % 2 != 0)
            size -= 1;
        for (int i = 2; i <= size-1; i += 2) {
            rightElement = i - 1;
            leftElement = i - 2;
            if (integerArrayList.get(leftElement) <= integerArrayList.get(rightElement)) {
                newList.add(integerArrayList.get(leftElement));
                newList.add(integerArrayList.get(rightElement));
            }
        }
        return newList;
    }
}
