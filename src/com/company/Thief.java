package com.company;

import java.util.Random;

public class Thief extends Personnage
{
    private int dodge;
    private int criticalDamage;
    private static String classA = "Thief";

    public Thief (Personnage pBasic,int dodge, int criticalDamage)
    {
        super(pBasic.getName(),pBasic.getHp(),pBasic.getDamage(),pBasic.getInitiative());
        this.dodge = dodge;
        this.criticalDamage = criticalDamage;
    }

    public String getClassA()
    {
        return this.classA;
    }

    public int hurt(int damage)
    {
        int res;

        res = numberRandom();
        if (res >= this.dodge)
            damage = 0;
        return damage;
    }

    private int numberRandom()
    {
        Random r = new Random();
        int n = r.nextInt(101);
        return n;
    }

    public int getDamage()
    {
        int res;

        res = numberRandom();
        if (res >= 80)
            return (getDamage()* 2);
        return(getDamage());
    }
    public int getDodge()
    {
        return this.dodge;
    }

    public int getCriticalDamage()
    {
        return this.criticalDamage;
    }

    /**
     * return of element of character more dodge with critical damage
     * @return element of the character more dodge with critical damage
     */
    public  String toString()
    {
        String classe = "Thief";
        String res = super.toString();
        res += "Dodge = " + this.dodge +"\n" + "Critical Damage =" +this.criticalDamage +"\n" + classA+ "\n";
        return res;
    }
}
