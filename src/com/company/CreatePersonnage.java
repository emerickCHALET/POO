package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CreatePersonnage
{
    public Scanner sc = new Scanner(System.in);

    public  Personnage createWarrior()
    {
        Personnage caractere = new Personnage();
        System.out.println("Enter a number of the shield");
        Scanner sc = new Scanner(System.in);
        int shield = sc.nextInt();
        caractere = new Warrior(shield);
        }
        return caractere
    }

    public Personnage createPersonnage()
    {
        System.out.println("Enter name of personnage :");
        String nameCaractere = sc.nextLine();
        Personnage caractere = new Personnage(nameCaractere);
        return caractere;
    }
}
