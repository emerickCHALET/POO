package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;


public class Dispatch
{
    public final static String archeClasse[] = {"Warrior","Wizard","Thief"};
    /**
     * dispatchCMD call the methods corresponding with the right user command
     * @param userCMD User command
     */
    public static void dispatchCMD(String userCMD,List<Personnage> listCara,List listFighter)
    {
        if(userCMD.equals("Help"))
        {
            helpMethod();
        }
        else if(userCMD.equals("Create"))
        {
            archeTopic(listCara);
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
            Personnage.startFight();
            fightingFighter(listCara,listFighter);
            Fight.letsFight(listFighter);
        }
        else if (userCMD.equals("CreateWarrior"))
        {
            Personnage cara = CreatePersonnage.createWarrior();
            listCara.add(cara);
        }
        else if (userCMD.equals("CreateWizard")) {
            Personnage cara = CreatePersonnage.createWizard();
            listCara.add(cara);
        }
        else if(userCMD.equals("Delete"))
        {
            deleteThis(listCara);
        }
        else if (userCMD.equals("CreateWarrior"))
        {
            Personnage cara = CreatePersonnage.createWarrior();
            listCara.add(cara);
        }
    }
    /**
     * helpMethod is method for print the available line command
     */

    public static void helpMethod()
    {
        String[] listCMD = Command.tabCommand;
        System.out.println("-----------------");
        for(int i = 0; i < listCMD.length; i++)
        {
            System.out.println("| " + listCMD[i]);
        }
        System.out.println("-----------------");
    }

    /**
     * numberOfCara is for Create the personnages
     * @param listCara is for group the personnages
     */
    public static void numberOfCara(List<Personnage> listCara)
    {
        for(int i = 0; i < listCara.size(); i++)
        {
            Personnage seePersonnage = listCara.get(i);
            System.out.println(i + " Name : " + seePersonnage.getName());
        }
    }

    /**
     * caractereList is the List of all personnages create with attributs
     * @param listCara is for group the personnages
     */
    public static void caractereList(List <Personnage> listCara)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choix du personnage : ");
        int index = sc.nextInt();
        Personnage seePersonnage = listCara.get(index);
        System.out.println(seePersonnage.toString());
    }
    public static void fightingFighter(List<Personnage> listCara,List<Personnage> listFighter)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the fighter 1");
        int fighter1 = sc.nextInt();
        System.out.println("Choose the fighter 2");
        int fighter2 = sc.nextInt();
        listFighter.add(listCara.get(fighter1));
        listFighter.add(listCara.get(fighter2));
    }
    public static void deleteThis(List<Personnage> listCara)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Need to delete ? but who ?");
        int index =  sc.nextInt();
        String sur = areYouSure();
        if(sur.equals("Yes"))
        {
            System.out.println("AHHHHHHHH");
            listCara.remove(index);
        }
        else
        {
            System.out.println("Ok ! I don't delete him");
        }
    }
    public static String areYouSure()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you sur About that'? ");
        String yesOrNot = sc.nextLine();
        return  yesOrNot;
    }
    public static void archeTopic(List<Personnage> listCara)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < archeClasse.length; i++)
        {
            System.out.println(i + " " + archeClasse[i]);
        }
        System.out.println("Make your class");
        int index = sc.nextInt();
        if(index == 0)
        {
            Personnage cara = CreatePersonnage.createWarrior();
            listCara.add(cara);
        }
        else if(index == 1)
        {
            Personnage cara = CreatePersonnage.createWizard();
            listCara.add(cara);
            System.out.println("Wizzzzzzzzarrrrrrrd");
        }
        else if (index == 2)
        {
            System.out.println("TTTTTTTTTHHHHHHHIIIIEEEEEVVVVVV");
        }
    }
}