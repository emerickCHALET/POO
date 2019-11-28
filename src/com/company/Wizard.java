package com.company;

import java.util.Scanner;

public class Wizard extends Personnage
{
    private static int magicalDamage;
    private static int ref;
    private static String classA = "Wizard";
    static boolean first = true;

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
        int totalMagicalDommage = super.getDamage() + this.magicalDamage;
        if (first == false) {
            this.magicalDamage /= 2;
        }
        first = false;
        System.out.println("MagicalDamage = "+ this.magicalDamage);
        return totalMagicalDommage;
    }

    public String getClassA()
    {
        return this.classA;
    }

    /**
     * return of element of character more magical power
     * @return element of the character more magical power
     */
    public  String toString()
    {
        String classe = "Wizard";
        String res = super.toString();
        res += "magical damage = " + this.magicalDamage +"\n" + classA + "\n";
        return res;
    }

    public static void startFight()
    {
        first = true;
        magicalDamage = ref;
    }
}

