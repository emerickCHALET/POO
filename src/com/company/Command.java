package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Command
{
    /**
     * Création du tableau de commande disponible pour jouer
     * getUserChoice() capte la saisie de l'utilisateur
     * et regarde si l'utilisateur à rentré une commande valide
     * sinon elle octroie la commande de Help par defaut
     * @return retourne la ligne de commande valide
     */
    public static String tabCommand[] = {"Help","Exit","Create","Delete" };
    public static  String getUserChoice()
    {
        Scanner sc = new Scanner(System.in);
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
            choice = "Help";
        }
        return choice;
    }

    /**
     * reference()
     * @return retourne la tableau contenant les lignes de commande valide
     */
    public static String[] reference()
    {
        return tabCommand;
    }
}
