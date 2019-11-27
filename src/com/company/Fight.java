package com.company;
import java.util.List;

public class Fight
{
    public static void letsFight(List<Personnage> listFighter)
    {
        int rounds = 0;
        Personnage p1Attack;
        Personnage p2Deff;
        Personnage p3T;
        if(listFighter.get(0).getInitiative() < listFighter.get(1).getInitiative())
        {
            p1Attack = listFighter.get(1);
            p2Deff = listFighter.get(0);
        }
        else
        {
            p1Attack = listFighter.get(0);
            p2Deff = listFighter.get(1);
        }
        do{
            rounds++;
            System.out.println("Rounds " + rounds);
            p1Attack.getDamage();
            System.out.println( p1Attack.getName() + " Make " + p1Attack.getDamage() + " Damage !");
            p2Deff.hurt(p1Attack.getDamage());
            p3T = p1Attack;
            p1Attack = p2Deff;
            p2Deff = p3T;
        }while(p1Attack.getHp() >= 0);
        if(p1Attack.getHp() <= 0)
        {
            System.out.println(p1Attack.getName() + " Is death !");
        }
        else
        {
            System.out.println(p2Deff.getName() + " Is Death !");
        }
    }
}
