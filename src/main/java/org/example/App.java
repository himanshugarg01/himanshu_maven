package org.example;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the age");
        int years=sc.nextInt();
        Child child1=new Child(name,years);
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("Enter the age");
        years=sc.nextInt();
        Child child2=new Child(name,years);

        System.out.println("Enter the name of chocolate liked by the child");
        String chocon=sc.next();
        System.out.println("Enter the weight of chocolate liked by the child");
        int choco=sc.nextInt();
        System.out.println("Enter the calories in chocolate liked by the child");
        int choco1=sc.nextInt();
        System.out.println("Enter the price of chocolate liked by the child");
        int chocop=sc.nextInt();
        Sweets chocolate1=new Choco(chocon,choco,choco1,chocop);

        System.out.println("Enter the name of chocolate liked by the child");
        chocon=sc.next();
        System.out.println("Enter the weight of chocolate liked by the child");
        choco=sc.nextInt();
        System.out.println("Enter the calories in chocolate liked by the child");
        choco1=sc.nextInt();
        System.out.println("Enter the price of chocolate liked by the child");
        chocop=sc.nextInt();
        Sweets chocolate2=new Choco(chocon,choco,choco1,chocop);

        System.out.println("Enter the name of cake liked by the child");
        String cakename=sc.next();
        System.out.println("Enter the weight of cake liked by the child");
        int cakeweight=sc.nextInt();
        System.out.println("Enter the calories in cake liked by the child");
        int cakecal=sc.nextInt();
        System.out.println("Enter the price of cake liked by the child");
        int cakeprice=sc.nextInt();
        Sweets cake=new Cake(cakename,cakeweight,cakecal,cakeprice);

        System.out.println("Enter the name of cake liked by the child");
        cakename=sc.next();
        System.out.println("Enter the weight of cake liked by the child");
        cakeweight=sc.nextInt();
        System.out.println("Enter the calories in cake liked by the child");
        cakecal=sc.nextInt();
        System.out.println("Enter the price of cake liked by the child");
        cakeprice=sc.nextInt();
        Sweets cake1=new Cake(cakename,cakeweight,cakecal,cakeprice);

        System.out.println("Enter the name of candy liked by the child");
        String candyname=sc.next();
        System.out.println("Enter the weight of candy liked by the child");
        int candyweight=sc.nextInt();
        System.out.println("Enter the calories in candy liked by the child");
        int candycal=sc.nextInt();
        System.out.println("Enter the price of candy liked by the child");
        int candyprice=sc.nextInt();
        Sweets candy=new Candy(candyname,candyweight,candycal,candyprice);

        System.out.println("Enter the name of candy liked by the child");
        candyname=sc.next();
        System.out.println("Enter the weight of candy liked by the child");
        candyweight=sc.nextInt();
        System.out.println("Enter the calories in candy liked by the child");
        candycal=sc.nextInt();
        System.out.println("Enter the price of candy liked by the child");
        candyprice=sc.nextInt();
        Sweets candy1=new Candy(candyname,candyweight,candycal,candyprice);


        Vector<Sweets> a1=new Vector<Sweets>();
        a1.add(chocolate1);
        a1.add(cake);
        a1.add(candy);
        Vector<Sweets> a2=new Vector<Sweets>();
        a2.add(chocolate2);
        a2.add(cake1);
        a2.add(candy1);
        Gift gift1=new Gift(a1,"Happy New Year to children");
        Gift gift2=new Gift(a2,"lots of wishes to children");
        child1.give(gift1,child1);
        child2.give(gift2,child2);
        child1.show();
        child2.show();
    }
}
