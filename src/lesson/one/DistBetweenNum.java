/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.one;

import go.it.main.MinDistanse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Оля
 */
public class DistBetweenNum extends MinDistanse {

    private List<Integer> arr;

    private Integer min1;
    private Integer min2;
    private ArrayList<Integer> numMin1 = new ArrayList();
    private ArrayList<Integer> numMin2 = new ArrayList();

    public static void main(String[] args) {
        DistBetweenNum dbn = new DistBetweenNum();
        System.out.println(dbn.calculateDistances(Arrays.asList(0,1,1,1,2,3,12)));
    }

    public List<Integer> getArr() {
        return arr;
    }

    private void readArray(List<Integer> arr) {
        System.out.print("Have array {");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i != arr.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public void calculateMinNum() {
        if (arr.size() != 0) {
            calculateMin1Num();
            calculateMin2Num();
        }

        outResultDist();
    }

    private void calculateMin1Num() {
        min1 = arr.get(0);
        numMin1.add(0);
        for (int i = 1; i < arr.size(); i++) {
            if (min1 == arr.get(i)) {
                numMin1.add(i);
            }
            if (min1 > arr.get(i)) {
                min1 = arr.get(i);
                numMin1.clear();
                numMin1.add(i);
            }
        }
    }

    private void calculateMin2Num() {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > min1 && (min2 == null || arr.get(i) < min2)) {
                min2 = arr.get(i);
            }
        }
        if (min2 != null) {
            for (int i = 0; i < arr.size(); i++) {
                if (min2 == arr.get(i)) {
                    numMin2.add(i);
                }
            }
        }
    }

    private Map<String, Integer> outResultDist() {
        Map<String, Integer> outText = new HashMap<>();
        if ((arr.size() == 1 || min2 == null) || arr.size() == 0) {
            outText.put("Distance does not exist!", 0);
            return outText;
        }

        for (int i = 0; i < numMin1.size(); i++) {
            for (int j = 0; j < numMin2.size(); j++) {
                int distance = Math.abs(numMin1.get(i) - numMin2.get(j));
                String str = "\n" + "Distance between min1(" + min1 + "|" + numMin1.get(i) + ") and min2(" + min2 + "|" + numMin2.get(j) + ")";
                outText.put(str, distance);
            }
        }
        return outText;
    }

    @Override
    public Map<String, Integer> calculateDistances(List<Integer> array) {
        arr = array;
        readArray(array);
        calculateMinNum();
        return outResultDist();
    }
}
