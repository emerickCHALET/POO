package com.company;

import java.util.Scanner;

public class Main {

    /**
     * args significate arguments, This table is the mechanism for the system to pass the information to your application
     * @param args
     */
    public static void main(String[] args)
    {
        execution();
    }
    public static void execution()
    {
        System.out.println("Application has started");
        String ch;
        do {
            ch = Command.getUserChoice();

        }while(!ch.equals("Exit"));
    }
    
}
