package com.company;

import java.util.Scanner;

public class Wizard extends Personnage
{
    private int magicalDamage;

    public Wizard(int magicalDamage){ this.magicalDamage = magicalDamage;}

    /**
     * new domage with magical domage
     * @return new domage with magical domage
     */
    private int getMagicalDamage()
    {
        int TotalMagicalDommage =super.getDamage() + this.magicalDamage;
        if (this.magicalDamage >= 2)
            this.magicalDamage /= 2;
        return this.magicalDamage;
    }

    /**
     * function that returns the damage after the intervention of the magical power
     * @param damage damage before the intervention of the magical power
     */
    public int hurt()
    {
        int res = getMagicalDamage();
        res = super.hurt(res);
        return res;
    }

    /**
     * return of element of character more magical power
     * @return element of the character more magical power
     */
    public  String toString()
    {
        String res = super.toString();
        res += "magical damage" + this.magicalDamage +"\n";
        return res;
    }
}

