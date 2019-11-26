package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class Dispatch
{
    /**
     * dispatchCMD call the methods corresponding with the right user command
     * @param userCMD User command
     */
    public static void dispatchCMD(String userCMD,List listCara,List listFighter)
    {
        if(userCMD.equals("Help"))
        {
            helpMethod();
        }
        else if(userCMD.equals("Create"))
        {
            Personnage cara = CreatePersonnage.createPersonnage();
            listCara.add(cara);
        }
        else if(userCMD.equals("Info_Cara"))
        {
            caractereList(listCara);
        }
        else if(userCMD.equals("Number_Of_Cara"))
        {
            numberOfCara(listCara);
        }
        else if(userCMD.equals("Fight"))
        {
            fightingFighter(listCara,listFighter);
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

    /**
     * numberOfCara is for Create the personnages
     * @param listCara is for group the personnages
     */
    public static void numberOfCara(List listCara)
    {
        for(int i = 0; i < listCara.size(); i++)
        {
            Personnage seePersonnage = (Personnage) listCara.get(i);
            System.out.println(i + " Name : " + seePersonnage.getName());
        }
    }

    /**
     * caractereList is the List of all personnages create with attributs
     * @param listCara is for group the personnages
     */
    public static void caractereList(List listCara)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choix du personnage : ");
        int index = sc.nextInt();
        Personnage seePersonnage = listCara.get(index);
        System.out.println("Name : " + seePersonnage.getName());
        System.out.println("Life : " + seePersonnage.getHp());
        System.out.println("Damage : " + seePersonnage.getDamage());
        System.out.println("Initiative : " + seePersonnage.getInitiative());
    }
    public static void fightingFighter(List listCara,List listFighter)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the fighter 1");
        int fighter1 = sc.nextInt();
        System.out.println("Choose the fighter 2");
        int fighter2 = sc.nextInt();
        listFighter.add(listCara.get(fighter1));
        listFighter.add(listCara.get(fighter2));
    }
}
