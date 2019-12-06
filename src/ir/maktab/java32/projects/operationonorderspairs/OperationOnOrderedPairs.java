package ir.maktab.java32.projects.operationonorderspairs;

import java.util.ArrayList;

public class OperationOnOrderedPairs {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(7);
        integers.add(9);
        integers.add(2);
        integers.add(5);
        integers.add(5);
        integers.add(8);
        integers.add(5);
        integers.add(6);
        integers.add(3);
        integers.add(4);
        integers.add(7);
        integers.add(3);
        integers.add(1);

        integers.forEach(number->System.out.print(number + ","));
        System.out.println("");
        ArrayList<Integer> newList = DeleteInappropriateOrderedPairs.deleteFromArrayList(integers);
        newList.forEach(number->System.out.print(number + ","));

    }
}
