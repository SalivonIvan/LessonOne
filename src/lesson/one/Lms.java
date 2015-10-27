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
public class Lms {

    private int[] arrNum = {1, 2, 1, 2, 6, 56, 10, 10, 56, 5, 56, 5, 5, 1, 10, 2};
    private static final int NUM_REPEAT = 3;

    public static void main(String[] args) {
        LonellyNumber ln = new LonellyNumber();
        System.out.println("Search number - " + ln.searchNum());
        
    }

    int searchNum() {
        System.out.println("dfdf");
        int num = 0;
        int searchNum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < arrNum.length; i++) {
            num = arrNum[i];
            
            if (!arr.isEmpty()) {
                for (Integer arr1 : arr) {
                    System.out.println(arr1);
                }
                for (int j = 0; j < arr.size(); j++) {
                    if (num == arr.get(j)) {
                        break ;
                    }
                }
              continue;  
            }
            
            for (int j = i + 1; j < arrNum.length; j++) {
                
                if (num == arrNum[j]) {
                    arr.add(j);
                    break;
                } else {
                    System.out.println(j);
                    searchNum = num;
                }
            }

        }
        return searchNum;
    }
 }
