package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Command
{
    private static boolean firstCommand = true;
    /**
     * Create the tab with available line command for play
     * getUserChoice() get the Input user
     * look if the command is available
     * else if assigns the default line command
     * @return return the line command
     */
    public final static String tabCommand[] = {"Help","Exit","Create","Delete","Info",
            "Number","Fight"};
    public static  String getUserChoice()
    {
        if(firstCommand == true)
        {
            Dispatch.helpMethod();
            firstCommand = false;
        }
        System.out.println("Make a command");
        Scanner sc = new Scanner(System.in);
        String choice;
        Boolean BOOOOOL = false;
        choice = sc.nextLine();
        for(int i = 0; i < tabCommand.length; i++)
        {
            if(choice.equals(tabCommand[i]))
            {
                BOOOOOL = true;
            }
        }
        if(BOOOOOL == false)
        {
            choice = "Help";
        }
        return choice;
    }
}
