package com.company;

public class Dispatch
{
    /**
     * dispatchCMD va appeller les méthodes correspondants aux lignes de commandes saisi par l'utilisateur
     * @param userCMD la commande de l'utilisateur
     * @param listCMD les commandes disponible pour jouer, quitter etc etc ...
     * @return retourne la commande
     */
    public static String dispatchCMD(String userCMD,String[] listCMD)
    {
        if(userCMD.equals("Help"))
        {
            System.out.println("Debug Help");
            for(int i = 0; i < listCMD.length; i++)
            System.out.println(listCMD[i]);
        }
        //la méthode a t'elle vraiment besoin de return ?
        return userCMD;
    }
}
