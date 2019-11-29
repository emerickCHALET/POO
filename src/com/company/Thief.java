package com.company;

import java.util.Random;

public class Thief extends Personnage
{
    private int dodge;
    private int criticalDamage;
    private static String classA = "Thief";
    private int DGTS = super.getDamage();

    /**
     * constructor of thief class
     * @param pBasic all information of character
     * @param dodge percent of dodge
     * @param criticalDamage percent of critical damage
     */
    public Thief (Personnage pBasic,int dodge, int criticalDamage)
    {
        super(pBasic.getName(),pBasic.getHp(),pBasic.getDamage(),pBasic.getInitiative());
        this.dodge = dodge;
        this.criticalDamage = criticalDamage;
    }

    /**
     * return the class of personnage
     * @return class
     */
    public String getClassA()
    {
        return this.classA;
    }

    /**
     * Method receive damage
     * @param damage before dodge
     * @return damage suffer
     */
    public int hurt(int damage)
    {
        System.out.println("se prends damage avant lancé de dé"+ damage);
        int res;
        res = numberRandom();
        if (res <= this.dodge)
        {

            damage = 0;
            System.out.println(damage + " reset ?");
        }
        System.out.println("n'est pas passé ou pas et renvoie" + damage);
        return damage;
    }

    /**
     * Method of random number
     * @return random number
     */
    private int numberRandom()
    {
        Random r = new Random();
        int n = r.nextInt(101);
        return n;
    }

    /**
     * Method give damage
     * @return damage before critical damage
     */
    public int getDamage()
    {
        int res;
        res = numberRandom();
        if (res <= criticalDamage)
        {
            System.out.println("Debug Critique");
            return (DGTS * 2);
        }
        return DGTS;
    }

    /**
     * Method for display dodge
     * @return dodge
     */
    public int getDodge()
    {
        return this.dodge;
    }

    /**
     * Method for display critical damage
     * @return critical damage
     */
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
        res += "Dodge = " + this.dodge +"\n" + "Critical Damage = " +this.criticalDamage +"\n" + classA+ "\n";
        return res;
    }
}
