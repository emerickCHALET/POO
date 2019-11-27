package com.company;

import java.util.Scanner;

public class Warrior extends Personnage
{
    private int shield;

    public Warrior(int shield)
    {
        this.shield = shield;
    }

    /**
     * function that returns the damage after the intervention of the shield
     * @param damage damage before the intervention of the shield
     */
    private int getReduceDommage(int damage)
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
     * Return the remaining life points of the character after intervention of the shield
     * @param damage damage before the intervention of the shield
     * return damage after the intervention of shield
     */
    public int hurt(int damage)
    {
        int res = getReduceDommage(damage);
        res = super.hurt(res);
        return res;
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
