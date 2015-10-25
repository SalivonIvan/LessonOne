/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.one;

/**
 *
 * @author Оля
 */
public class LonellyNumber {

    private int[] arrNum = {1,52, 1, 2, 6,52, 6, 10, 8, 5, 52, 5, 14, 7, 17, 56, 2};
    private static final int NUM_REPEAT = 3;

    public static void main(String[] args) {
        LonellyNumber ln = new LonellyNumber();
        System.out.println("Search number - "+ln.searchNum());
    }

    int searchNum() {
        int num = 0;
        int numRepeat = 0;
        begin:
        for (int i = 0; i <= arrNum.length - 1; i++) {
            num = arrNum[i];
            numRepeat = 1;
            for (int j = i + 1; j <= arrNum.length - 1; j++) {

                if (num == arrNum[j]) {
                    numRepeat++;
                    if (numRepeat == NUM_REPEAT) {
                        break begin;
                    }
                }
            }

        }
        return num;
    }

}
