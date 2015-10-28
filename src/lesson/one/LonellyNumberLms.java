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
public class LonellyNumberLms {

    private int[] arrNum = {5, 10, 10, 10, 2, 2, 6, 56, 56, 56, 5, 5, 2};

    public static void main(String[] args) {
        LonellyNumberLms ln = new LonellyNumberLms();
        System.out.println("Search number - " + ln.searchNum());

    }

    int searchNum() {
        int num = 0;
        int searchNum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        out:
        for (int i = 0; i < arrNum.length; i++) {

            num = arrNum[i];

            if (!arr.isEmpty()) {
                for (int j = 0; j < arr.size(); j++) {
                    if (num == arr.get(j)) {
                        continue out;
                    }
                }
            }
            if (i == arrNum.length - 1) {
                searchNum = arrNum[i];
            }
            for (int j = i + 1; j < arrNum.length; j++) {

                if (num == arrNum[j]) {
                    arr.add(arrNum[j]);
                    break;
                } else {
                    searchNum = num;
                }
                if (j == arrNum.length - 1) {
                    break out;
                }
            }

        }
        return searchNum;
    }
}
