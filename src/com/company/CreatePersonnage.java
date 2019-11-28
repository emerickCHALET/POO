package com.company;

import java.awt.*;
import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CreatePersonnage
{
    /**
     * create a warrior charactere
     * @return a new Personnage Warrior
     */
    public static Personnage createWarrior()
    {
        Personnage dummy = createPersonnage();
        System.out.println("Enter a number of the shield");
        Scanner sc = new Scanner(System.in);
        int shield = sc.nextInt();
        Warrior war = new Warrior(dummy, shield);
        return war;
    }

    /**
     * create a wizard charactere
     * @return a new Personnage Wizard
     */
    public static Personnage createWizard()
    {
        Personnage camomille = createPersonnage();
        System.out.println("Enter a number of magical damage");
        Scanner sc = new Scanner(System.in);
        int magicalDamage = sc.nextInt();
        Wizard Wiz = new Wizard(camomille, magicalDamage);
        return Wiz;
    }


    /*public static Personnage createBasicPersonnage()
    {
        Personnage caractere = new BasicArchetype();
        return  caractere;
    }*/

    /**
     * create a thief charactere
     * @return a new Personnage thief
     */
    public static Personnage createThief()
    {
        Personnage aliBabba = createPersonnage();
        System.out.println("Enter a number of dodge");
        Scanner sc = new Scanner(System.in);
        int dodge = sc.nextInt();
        System.out.println("Enter a number of criticalDamage");
        int criticalDamage = sc.nextInt();
        Thief thief = new Thief(aliBabba, dodge, criticalDamage);
        return thief;
    }

    /**
     * Create a charactere with all informations
     * @return a new caractere
     */
    public static Personnage createPersonnage()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of personnage :");
        String nameCaractere = sc.nextLine();
        System.out.println("Enter hp :");
        int hp = sc.nextInt();
        System.out.println("Enter damage :");
        int damage = sc.nextInt();
        System.out.println("Enter initiative :");
        int initiative = sc.nextInt();
        Personnage caractere = new Personnage(nameCaractere, hp, damage, initiative);
        return caractere;
    }
}
