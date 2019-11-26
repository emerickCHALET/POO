package com.company;

import java.util.Scanner;

public class Main
{
    public static Command gameCommand = new Command();
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
        do {
            ch = Command.getUserChoice();
            Dispatch.dispatchCMD(ch);
        }while(!ch.equals("Exit"));
    }




}
