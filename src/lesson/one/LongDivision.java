/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.one;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Stack;

/**
 *
 * @author Оля
 */
public class LongDivision {

    private int del1;
    private int del2;
    private double result;
    private Stack<Integer> stackDel1;
    private int count;

    public LongDivision(int del1, int del2) {
        this.del1 = del1;
        this.del2 = del2;
        parseIntToStack(this.del1);
        countIteration();
        print();
    }

    public static void main(String[] args) {
        LongDivision ld = new LongDivision(25, 24);

    }

    void countIteration() {
        StringBuilder sb = new StringBuilder(formatResultToStr());
        while (sb.lastIndexOf("0") != -1) {
            sb.deleteCharAt(sb.lastIndexOf("0"));
        }
        count = sb.length() - 2;
    }

    private String formatResultToStr() {
        result = (double) del1 / del2;
        Formatter format = new Formatter();
        format.format("%f", result);
        String s = format.toString();
        return s;
    }

    private int calculatedA(int a, int b) {
        if (a == 0) {
            return 0;
        }
        while (a < b && !stackDel1.empty()) {
            a = combineTwoInt(a, stackDel1.pop());
        }
        while (a < b && stackDel1.empty()) {
            a = combineTwoInt(a, 0);
        }
        return a;

    }

    private int combineTwoInt(int one, int two) {
        String oneStr = String.valueOf(one);
        String twoStr = String.valueOf(two);
        String combination = oneStr + twoStr;
        Integer oneTwo = Integer.parseInt(combination);
        return oneTwo;
    }

    private void parseIntToStack(int number) {
        String s = String.valueOf(number);
        stackDel1 = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            stackDel1.push(Integer.valueOf(String.valueOf(s.charAt(i))));
        }
    }

    private void print() {
        if (del2 == 0) {
            printOneString();
            System.out.println("Division by zero - error!");
            return;
        }
        printOneString();
        String offset = "";
        int a = calculatedA(stackDel1.pop(), del2);
        int c = a - a % del2;
        printTwoString(c, formatResultToStr());
        System.out.println("----");
        for (int i = 1; i <= count; i++) {
            a = a - c;
            a = calculatedA(a, del2);
            c = a - a % del2;
            System.out.println(offset + " " + a);
            System.out.println(offset + "-" + c);
            System.out.println(offset + "----");
            offset += " ";
        }
        System.out.println(offset + " " + (a - c));
    }

    private void printOneString() {
        System.out.printf("  %d | %d\n", del1, del2);
    }

    private void printTwoString(int c, String result) {
        System.out.println("-" + c + " | " + result);
    }
}
