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
public class LongDivision {

    private int del1;
    private int del2;
    private double result;

    public LongDivision(int del1, int del2) {
        this.del1 = del1;
        this.del2 = del2;
    }

    public static void main(String[] args) {
        LongDivision ld = new LongDivision(120, 6);
        ld.calculated();
    }

    void calculated() {
        Integer del1;
        Integer del2;
        int[]arrDel1;
        del1 = this.del1;
        del2 = this.del2;
        String str = del2.toString();
        for (int i = 0; i < del1.toString().length(); i++) {
            Math.
//          int [] ch = str.  
        }
        
        arrDel1 = new int[del1.]
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
