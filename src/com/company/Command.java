package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Command
{
    public static Scanner sc = new Scanner(System.in);
    public static void getUserChoice()
    {
        String tabCommand[] = {"Help","Exit","Create","Delete" };
        do {
            String choice = sc.nextLine();
            if(choice.equals("Help"))
            {
                System.out.println(tabCommand);

            }
            if(choice.equals("Exit"))
            {
                System.out.println("Bye bye");
                System.exit(0);
            }
            else
            {
                System.out.println("Error");
                System.out.println(tabCommand);
            }
        }while(true);
    }
}
