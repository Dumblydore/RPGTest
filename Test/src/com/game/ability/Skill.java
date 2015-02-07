package com.game.ability;

/**
 * Created by Maurice on 1/24/2015.
 */
public class Skill extends Attack{
    private String name;
    private String info;

    public Skill(double base, String type,String name, String info) {
        super(base, type);
        this.name = name;
        this.info = info;
    }
}
