package com.game.ability;

/**
 * Created by Maurice on 1/24/2015.
 */
public class Skill extends Attack{
    private String name;
    private String info;
    private int cost;

    public Skill(double  base, int cost, String type,String name, String info) {
        super(base, type);
        this.name = name;
        this.info = info;
        this.cost = cost;
    }

    public int getCost() {
        return cost;

    }
}
