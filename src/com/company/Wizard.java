package com.company;

import java.util.Scanner;

public class Wizard extends Personnage
{
    private int power;
    public Wizard()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Make the Strongest power");
        power = sc.nextInt();
    }
    public int powerWizard()
    {
        int powerFinal = power + getDamage();
        return powerFinal;
    }
    public String toString()
    {
        String res = super.toString();
        res += "power = " + this.power + "\n";
        return res;
    }
}
