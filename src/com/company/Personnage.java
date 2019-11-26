package com.company;

/**
 * creation of the class Personnage for incorporate the informations
 */

public class Personnage
{
    /** Creation of the name of character*/
    private String name;
    /** Creation of the damage points*/
    private int damage;
    /** Creation of the life of character*/
    private int hp;
    /** Creation of the points of initiative*/
    private int initiative;

    public Personnage(String nameUser)
    {
        name = nameUser;
        damage = 2;
        hp = 3;
        initiative = 10;
    }

    /** Return of the name of the character*/
    public String getName()
    {
        return (this.name);
    }
    /** Return of the points of life of the character*/
    public int getHp()
    {
        return (this.hp);
    }
    /** Return of the points that the character undergoes */
    public int getDamage()
    {
        return this.damage;
    }
    /** Return of the points of initiative of the character*/
    public int getInitiative()
    {
        return this.initiative;
    }
    /** Return the remaining life points of the character*/
    public int hurt(int damage)
    {
        return this.hp -= damage;
    }
    /** display of character information*/
    public void display()
    {
        System.out.println(this.name);
        System.out.println(this.damage);
        System.out.println(this.hp);
        System.out.println(this.initiative);
    }

}
