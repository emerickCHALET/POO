package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CreatePersonnage
{

    public static Personnage createPersonnage()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of personnage :");
        String nameCaractere = sc.nextLine();

        Personnage caractere = new Personnage(nameCaractere);
        return caractere;
    }
}