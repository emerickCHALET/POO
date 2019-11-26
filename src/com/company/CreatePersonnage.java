package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CreatePersonnage
{

    public static void createPersonnage()
    {
        Scanner sc = new Scanner(System.in);
        List<Personnage> listPersonnage = new ArrayList();

        System.out.println("Enter name of personnage :");
        String nameCaractere = sc.nextLine();

        Personnage caractere = new Personnage(nameCaractere);
        listPersonnage.add(caractere);
    }

    public static List<Personnage> displayCaractere()
    {


    }
}
