package com.company;
import java.util.List;

public class Fight
{
    /**
     * Make A fight With the Player One and the Player Two
     * He take the Player with the most Initiative
     * He count the Rounds and print the dommage
     * He alternates the Player for the match rotation
     * He print who is dead
     * @param listFighter
     */
    public static void letsFight(List<Personnage> listFighter)
    {
        int rounds = 0;
        Personnage p1Attack;
        Personnage p2Deff;
        Personnage p3T;
        int attack;
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
            attack = p1Attack.getDamage();
            System.out.println( p1Attack.getName() + " Make " + attack + " Damage !");
            p2Deff.hurt(attack);
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
