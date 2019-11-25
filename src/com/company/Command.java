package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Command
{
    /**
     * Create control tab available for play
     * getUserChoice() get the Input user
     * look if the controls is available
     * else if assigns the default control
     * @return return the control
     */
    public static String tabCommand[] = {"Help","Exit","Create","Delete" };
    public static  String getUserChoice()
    {
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

    /**
     * reference()
     * @return Return the table containing the control
     */
    public static String[] reference()
    {
        return tabCommand;
    }
}
