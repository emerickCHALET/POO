package com.company;

import java.util.Scanner;

public class Main {

    /**
     * Create main with the main method executing the game
     * @param args
     */
    public static void main(String[] args)
    {
        execution();
    }

    /**
     * execution() is a method executing the game
     * she replaces the main method
     */
    public static void execution()
    {
        System.out.println("Application has started");
        String ch;
        String[] CMD = Command.reference();
        do {
            ch = Command.getUserChoice();
            Dispatch.dispatchCMD(ch,CMD);
        }while(!ch.equals("Exit"));
    }

}
