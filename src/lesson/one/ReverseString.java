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
public class ReverseString {

    private String beginStr;
    private StringBuffer endStr;

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.setBeginStr("HelloWord");
        rs.reverseStr();
        rs.printResult();
    }

    public void setBeginStr(String beginStr) {
        this.beginStr = beginStr;
    }

    public String getBeginStr() {
        return beginStr;
    }

    void printResult() {
        System.out.println("Initial String - " + getBeginStr());
        System.out.println("End String - " + endStr);
    }

    void reverseStr() {
        endStr = new StringBuffer();
        for (int i = getBeginStr().length() - 1; i >= 0; i--) {
            endStr.append(getBeginStr().charAt(i));
        }
    }
}
