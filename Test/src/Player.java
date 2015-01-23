import java.util.Random;

public class Player implements Character{
    private int health;
    private int strength;
    private int attack;
    private int speed;
    private int def;

    public Player(int h, int s, int sp, int d){
        health = h;
        strength = s;
        attack = (strength+health)/5;
        speed = sp;
        def = d;
    }

    @Override
    public int attack()

    {
        Random random = new Random();
        int a = random.nextInt((int)(((attack*1.5) - 1) + (attack/2)));
        return a;
    }

    @Override
    public int damaged(int damage) {
        int totalDamage = -(def-damage);
        totalDamage = totalDamage <= 0 ? 1 : totalDamage;
        health = health - totalDamage;
        return totalDamage;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getHealth() {
        return health;
    }
}
