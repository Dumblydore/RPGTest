package com.game.character;

import com.game.ability.Attack;

import java.util.Random;

public class Character {
    private final int CONSTANT = 15;

    private int level;
    private int health;
    private int magic;
    private int speed;
    private int strength;
    private int def;
    private int magicDef;
    private Attack[] skills;
    private String[] weaknesses;

    public Character(int level, int health, int magic, int speed, int strength, int def, int magicDef) {
        this.level = level;
        this.health = health*(level+1);
        this.magic = magic*(level+1);
        this.speed = speed*(level+1);
        this.strength = strength*(level+1);
        this.def = def*(level+1);
        this.magicDef = magicDef*(level+1);
        
        skills = new Attack[10];

    }

    public Character(int level, int health, int magic, int speed, int strength, int def, int magicDef, String[] weaknesses) {
        this.level = level;
        this.health = health*(level+1);
        this.magic = magic*(level+1);
        this.speed = speed*(level+1);
        this.strength = strength*(level+1);
        this.def = def*(level+1);
        this.magicDef = magicDef*(level+1);
        skills = new Attack[10];
        this.weaknesses = weaknesses;

    }

    public int attack() {
        int attack = (int) ((strength * .8) + Math.random() * (strength - (strength * .8))) * CONSTANT;
        return attack;
    }

    public int damaged(int damage) {
        int totalDamage = damage - def;
        totalDamage = totalDamage <= 0 ? 1 : totalDamage;
        health = health - totalDamage;
        return totalDamage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level+1;
    }
}
