package com.company;

import java.util.Scanner;

public class Main {

    /**
     * Création du main avec la méthode principale qui execute le jeu de rôle
     * @param args
     */
    public static void main(String[] args)
    {
        execution();
    }

    /**
     * execution() est une méthode
     * qui sert à executer le jeu
     * elle remplace le main pour ne pas "charger" le main avec autre chose que des appels de méthodes
     */
    public static void execution()
    {
        System.out.println("Application has started");
        String ch;
        String[] CMD = Command.reference();
        do {
            ch = Command.getUserChoice();
            Dispatch.dispatchCMD(ch,CMD);
        }while(!ch.equals("Exit"));
    }

}
