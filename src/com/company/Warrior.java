package com.company;

import java.util.Scanner;

public class Warrior extends Personnage
{
    private int shield;

    public Warrior()
    {
        System.out.println("Enter a number of the shield");
        Scanner sc = new Scanner(System.in);
        int shield = sc.nextInt();
        this.shield = shield;
    }

    /**
     * function that returns the damage after the intervention of the shield
     * @param damage damage before the intervention of the shield
     */
    public int getReduceDommage(int damage)
    {
        if (damage > this.shield)
        {
            damage -= this.shield;
        }
        else
            damage = 0;
        return damage;
    }

    /**
     * return of element of character more shield
     * @return element of the character more shield
     */
    public String toString()
    {
        String res = super.toString();
        res += "shield = " + this.shield + "\n";
        return res;
    }
}
