package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;
import java.util.ListIterator;



public class Dispatch
{
    /**
     * dispatchCMD call the methods corresponding with the right user command
     * @param userCMD User command
     */
    public static void dispatchCMD(String userCMD)
    {
        if(userCMD.equals("Help"))
        {
            helpMethod();
        }
        else if(userCMD.equals("Create"))
        {
            CreatePersonnage.createPersonnage();
        }
    }

    /**
     * helpMethod is method for print the available line command
     */
    public static void helpMethod()
    {
        String[] listCMD = Command.tabCommand;
        for(int i = 0; i < listCMD.length; i++)
            System.out.println(listCMD[i]);
    }
}
