package org.example;

import java.util.*;

public class Child {
    String names;
    int years;
    Vector<Gift> g=new Vector<Gift>();

    public Child(String name, int age) {
        this.names = name;
        this.years = age;
    }
    public void give(Gift gift,Child child)
    {
        child.take(gift);
    }
    public void take(Gift gift)
    {
        g.add(gift);
    }
    public void show()
    {
        System.out.print(this.names +"- ");
        for(Gift gift:g)
        {
            System.out.println(gift.v+" Total Weight="+gift.totalWeightOfGift()+"g Message="+gift.mess);
        }
    }
}
