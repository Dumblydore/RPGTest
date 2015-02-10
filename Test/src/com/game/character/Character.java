package com.game.character;

import com.game.ability.Attack;
import com.game.ability.BasicAttack;
import com.game.ability.Magic;
import com.game.ability.Skill;

import java.util.Random;

public class Character {

    public static final String STATUS_POISON = "poison";
    public static final String STATUS_STUN = "stun";
    public static final String STATUS_SLEEP = "sleep";


    private int level;
    private int health;
    private int magicPoints;
    private int magic;
    private int speed;
    private int strength;
    private int def;
    private int magicDef;
    private String status;
    private Attack[] skills;
    private String[] weaknesses;

    public Character(int level, int health, int magic, int speed, int strength, int def) {
        this.level = level;
        this.health = health*(level+1);
        this.magic = magic*(level+1);
        this.speed = speed*(level+1);
        this.strength = strength*(level+1);
        this.def = def*(level+1);
        magicDef = magic/2*(level+1);
        magicPoints = (magic*5)*(level+1);
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
        magicPoints = (magic*5)*(level+1);
        skills = new Attack[10];
        this.weaknesses = weaknesses;

    }

    public int attack() {
        BasicAttack basicAttack = new BasicAttack(Attack.ATTACK_TYPE_PHYSICAL,strength);
        return basicAttack.attack(strength);
    }

    public int attack(Attack attack){
        int stat = strength;
        if((attack instanceof Magic)){
            stat = magic;
            magicPoints -= ((Magic)(attack)).getCost();
        } else if((attack instanceof Skill)){
            stat = magic;
            magicPoints -= ((Skill)(attack)).getCost();
        }
        return attack.attack(stat);
    }

    public int damaged(int damage, Attack attack) {
        int totalDamage;
        if(checkWeakness(attack.getType()))
            damage*=2;
        if(!(attack instanceof Magic))
            totalDamage = damage - def;
        else
            totalDamage = damage - magicDef;
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

    public int getStrength() {
        return strength;
    }

    public int getMagicPoints() {return magicPoints; }

    public String getStatus() {
        return status;
    }

    public void setStatus(String s, int chance) {
        if (chance == 1)
            status = s;
    }

    public void removeStatus() {
        status = "";
    }
}
