package com.game.character;

import com.game.ability.Attack;
import com.game.ability.BasicAttack;

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
        weaknesses = new String[0];

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
        BasicAttack basicAttack = new BasicAttack(Attack.ATTACK_TYPE_PHYSICAL,strength);
        int attack = (int) ((basicAttack.getBase()) + Math.random() * (strength - (basicAttack.getBase()))) * CONSTANT;
        return attack;
    }

    public int damaged(int damage, String type) {
        if(checkWeakness(type))
            damage*=2;
        int totalDamage = damage - def;
        totalDamage = totalDamage <= 0 ? 1 : totalDamage;
        health = health - totalDamage;
        return totalDamage;
    }

    private boolean checkWeakness(String type) {
        for(String weakness : weaknesses) {
            if(weakness.equals(type))
                return true;
        }
        return false;
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
