/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Оля
 */
public class HelloWord {

    private static final String HELP_MSG = "Enter Name or enter 'quit' to exit.";

    public static void main(String[] args) throws IOException {
        System.out.println(HELP_MSG);
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        exit:
        do {
            str = br.readLine();

            if (str.equals("quit")) {
                System.out.println("Goodbye!");
                break exit;
            } else if (str.equals("")) {
                System.out.println(HELP_MSG);
            } else {
                System.out.println("Hello " + str + "!");
            }

        } while (true);

    }

}
