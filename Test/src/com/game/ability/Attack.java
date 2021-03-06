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
    public static final String ATTACK_TYPE_AILMENT = "ailment";

    private String type;
    private double base;
    private String ailmentType;

    public Attack(double base, String type){
        this.type = type;
        this.base = base*10;
    }

    public String getType() {
        return type;
    }

    public int attack(int stat) {
        if(type.equals(ATTACK_TYPE_AILMENT))
            return inflictAilment(stat);
        return (int) (base + (Math.random() * ((base*1.5) - (base)))) * stat;
    }

    private int inflictAilment(int stat) { //0 = fail 1 = pass
        return 1;
    }

}
