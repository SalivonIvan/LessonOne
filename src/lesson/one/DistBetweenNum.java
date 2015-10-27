/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.one;

import java.util.ArrayList;

/**
 *
 * @author Оля
 */
public class DistBetweenNum {

    private static final int VALUES_IN_ARRAY = 10;
    private static final int MAX_VALUES = 10;
    private int[] arr={1,2,3,4,1,2,3,4};

    private Integer min1;
    private Integer min2;
    private ArrayList<Integer> numMin1 = new ArrayList();
    private ArrayList<Integer> numMin2 = new ArrayList();

    public static void main(String[] args) {
        DistBetweenNum var = new DistBetweenNum();
//        var.createArray();
        var.readArray(var.getArr());
        var.calculateMinNum();
        System.out.println(var.getMin1());
        System.out.println(var.getMin2());
    }

    public void createArray() {
        int[] arr = new int[VALUES_IN_ARRAY];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.round(Math.random() * MAX_VALUES));
        }
        this.arr = arr;
    }

    public void readArray(int[] arr) {
        System.out.print("Have array {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public int[] getArr() {
        return arr;
    }

    public void calculateMinNum() {

        calculateMin1Num();
        calculateMin2Num();
        outResultDist();
    }

    public Integer getMin1() {
        return min1;
    }

    public Integer getMin2() {
        return min2;
    }

    private void calculateMin1Num() {
        min1 = arr[0];
        numMin1.add(0);
        for (int i = 1; i < arr.length; i++) {
            if (min1 == arr[i]) {
                numMin1.add(i);
            }
            if (min1 > arr[i]) {
                min1 = arr[i];
                numMin1.clear();
                numMin1.add(i);
            }
        }
    }

    private void calculateMin2Num() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min1 && (min2 == null || arr[i] < min2)) {
                min2 = arr[i];
            }
        }
        if (min2 != null) {
            for (int i = 0; i < arr.length; i++) {
                if (min2 == arr[i]) {
                    numMin2.add(i);
                }
            }
        }
    }

    private void outResultDist() {
        if (arr.length == 1 || min2 == null) {
            System.out.println("Distance does not exist!");
            return;
        }

        for (int i = 0; i < numMin1.size(); i++) {
            for (int j = 0; j < numMin2.size(); j++) {
                int distance = Math.abs(numMin1.get(i) - numMin2.get(j));
                String str = "Distance between min1(" + min1 + "|" + numMin1.get(i) + ") and min2(" + min2 + "|" + numMin2.get(j) + ")";
                System.out.println(str + " = " + distance);
            }
        }
    }
}
