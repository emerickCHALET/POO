package com.company;

/**
 * creation of the class Personnage for incorporate the informations
 */

public class Personnage
{
    private String name;
    /** Creation of the name of character*/
    private int damage;
    /** Creation of the damage points*/
    private int hp;
    /** Creation of the life of character*/
    private int initiative;
    /** Creation of the points of initiative*/

    public String getName()
    {
        return (this.name);
    }
    /** Return of the name of the character*/
    public int getHp()
    {
        return (this.hp);
    }
    /** Return of the points of life of the character*/
    public int getDamage()
    {
        return this.damage;
    }
    /** Return of the points that the character undergoes */
    public int getInitiative()
    {
        return this.initiative;
    }
    /** Return of the points of initiative of the character*/
    public int hurt(int damage)
    {
        return this.hp -= damage;
    }
    /** Return the remaining life points of the character*/
    public void display()
    {
        System.out.println(this.name);
        System.out.println(this.damage);
        System.out.println(this.hp);
        System.out.println(this.initiative);
    }
    /** display of character information*/
}
