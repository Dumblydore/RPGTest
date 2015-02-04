package com.game.ability;

/**
 * Created by Maurice on 2/3/2015.
 */
public class Attack {
    /*Types*/
    public static final String ATTACK_TYPE_PHYSICAL = "physical";
    public static final String ATTACK_TYPE_FIRE = "fire";
    public static final String ATTACK_TYPE_ELECTRIC = "electric";
    public static final String ATTACK_TYPE_WATER = "water";
    public static final String ATTACK_TYPE_WIND = "wind";
    public static final String ATTACK_TYPE_DARK = "dark";
    public static final String ATTACK_TYPE_LIGHT = "light";

    private String type;
    private double base;

    public Attack(int base, String type){
        this.type = type;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public String getType() {
        return type;
    }


}
