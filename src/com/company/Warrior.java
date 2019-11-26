package com.company;

public class Warrior extends Personnage
{
    private int shield = 5 ;

    public Warrior()
    {
    }

    /**
     * function that returns the damage after the intervention of the shield
     * @param damage damage before the intervention of the shield
     */
    public int shield(int damage)
    {
        if (damage > this.shield)
        {
            damage -= this.shield;
        }
        else
            damage = 0;
        return damage;
    }
}
