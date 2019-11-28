package com.company;

public class BasicArchetype extends Personnage
{
    /**
     * Constructor of Basic archetype
     * @param pBasic all information of personnage
     */
    public BasicArchetype(Personnage pBasic)
    {
        super(pBasic.getName(),pBasic.getHp(),pBasic.getDamage(),pBasic.getInitiative());
    }
    /** Return of the name of the character*/
    public String getName()
    {
        return (super.getName());
    }
    /** Return of the points of life of the character*/
    public int getHp()
    {
        return (super.getHp());
    }
    /** Return of the points that the character undergoes */
    public int getDamage()
    {
        return super.getDamage();
    }
    /** Return of the points of initiative of the character*/
    public int getInitiative()
    {
        return super.getInitiative();
    }
    /** Return the remaining life points of the character*/
    public int hurt(int damage)
    {
        int res;
        res = super.getHp() - damage;
        return res;
    }

    /**
     * return class of personnage
     * @return null
     */
    public String getClassA()
    {
        return null;
    }

    /**
     * return of element of character
     * @return element of the character
     */
    public String toString()
    {
        return (super.toString());
    }

    /**
     * Method for start the fight
     */
    public static void startFight()
    {

    }
}
