package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Command
{



    static public String getUserChoice()
    {
        Scanner sc = new Scanner(System.in);
        String tabCommand[] = {"Help","Exit","Create","Delete" };
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
            //help
            System.out.println("DebugError");
            choice = "Help";
        }
        return choice;
    }


}
