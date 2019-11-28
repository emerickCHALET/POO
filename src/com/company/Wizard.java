package com.company;

import java.util.Scanner;

public class Wizard extends Personnage
{
    private int magicalDamage;
    private int ref;

    public Wizard(Personnage pBasic,int magicalDamage)
    {
        super(pBasic.getName(),pBasic.getHp(),pBasic.getDamage(),pBasic.getInitiative());
        this.magicalDamage = magicalDamage;
        this.ref = this.magicalDamage;
    }

    /**
     * new domage with magical domage
     * @return new domage with magical domage
     */
    public int getDamage()
    {
        int totalMagicalDommage =super.getDamage() + this.magicalDamage;
        if (this.magicalDamage >= 2)
            this.magicalDamage /= 2;
        return totalMagicalDommage;
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

    public void startFight()
    {
        this.magicalDamage = this.ref;
    }
}

