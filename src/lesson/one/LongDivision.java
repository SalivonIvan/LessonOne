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
    private Sta

    public LongDivision(int del1, int del2) {
        this.del1 = del1;
        this.del2 = del2;
    
    }
    public static void main(String[] args) {
        LongDivision ld = new LongDivision(1, 42);
        ld.calculated();
        ld.parseResultToArray(ld.getResult());
        System.out.println(ld.getDel1());
        for (char arg : ld.parseResultToArray(256)) {
            System.out.println(arg);
        }
         
    }
    

    public double getDel1() {
        return del1;
    }

    public double getDel2() {
        return del2;
    }

    void calculated() {
        printOneString();
        result = del1 / del2;
       
        Formatter format = new Formatter();
        format.format("%f", result);
        String s = format.toString();

        System.out.println(result);
    }

    void int calculated1(int a, int b) {
        if (a<b) {
            return;
        }else{
           return a-a%b;
        }

    }

    private Stack<Integer> parseResultToStack(int number) {
        String s = String.valueOf(number);
        Stack<Integer> result = new Stack<>();
        for (int i = 0; i <s.length(); i++) {
           result.push(Integer.valueOf(String.valueOf(s.charAt(i))));
        }
        System.out.println(s);
        
        return result;

    }

    private void print() {
        printOneString();
        for (int i = 0; i < 10; i++) {
            
        }
    }

    private void printOneString() {
        System.out.printf("%.1f | %.1f\n", del1, del2);
    }

    public void setDel1(int del1) {
        this.del1 = del1;
    }

    public void setDel2(int del2) {
        this.del2 = del2;
    }

    public double getResult() {
        return result;
    }

}
