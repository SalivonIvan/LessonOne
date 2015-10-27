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
    private StringBuilder endStr;

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.setBeginStr("           Hello    klkl kl      l;klklk     5456454 ");
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
        endStr = new StringBuilder(getBeginStr().length());
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < getBeginStr().length(); i++) {
            if (getBeginStr().charAt(i) == ' ') {
                str.reverse();
                endStr.append(str);
                endStr.append(getBeginStr().charAt(i));
                str.delete(0, str.length());
            }
            if (getBeginStr().charAt(i) != ' ' && i != getBeginStr().length() - 1) {
                str.append(getBeginStr().charAt(i));

            }
            if (i == getBeginStr().length() - 1 && getBeginStr().charAt(i) != ' ') {
                str.append(getBeginStr().charAt(i));
                str.reverse();
                endStr.append(str);

                str.delete(0, str.length());
            }
        }
    }
}
