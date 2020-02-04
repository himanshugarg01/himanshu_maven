package org.example;

public abstract class Sweets implements Comparable<Sweets> {
    String naming;
    int weights;
    int calorie;
    int pricing;

    public Sweets(String name, int weight, int calories,  int price) {
        this.naming = name;
        this.weights = weight;
        this.calorie=calories;
        this.pricing = price;
    }


    public int compareTo(Sweets s1)
    {
        return this.calorie-s1.calorie;
    }
    public String toString()
    {
        return naming;
    }
}
