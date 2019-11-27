package com.company;

import java.util.ArrayList;
import java.util.List;
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
        List<Personnage> listPersonnage = new ArrayList<>();
        List<Personnage> listFighter = new ArrayList();
        System.out.println("Application has started");
        String ch;
        do {
            ch = Command.getUserChoice();
            Dispatch.dispatchCMD(ch,listPersonnage,listFighter);
        }while(!ch.equals("Exit"));

    }




}
