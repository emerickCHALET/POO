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
        Personnage caractere = new Personnage();
        System.out.println("Enter a number of the shield");
        Scanner sc = new Scanner(System.in);
        int shield = sc.nextInt();
        caractere = new Warrior(shield);
        return caractere;
    }

    public static Personnage createWizard()
    {
        Personnage caractere = new Personnage();
        System.out.println("Enter a number of magical damage");
        Scanner sc = new Scanner(System.in);
        int magicalDamage = sc.nextInt();
        caractere = new Wizard(magicalDamage);
        return caractere;
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
