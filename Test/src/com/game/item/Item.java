package com.game.item;

/**
 * Created by Maurice on 1/24/2015.
 */
public class Item {
    private String name;
    private int type;
    private String flavorText;
    private int dmg;
    private int count;

    public Item(String name, int type, String flavorText, int dmg, int count) {
        this.name = name;
        this.type = type;
        this.flavorText = flavorText;
        this.dmg = dmg;
        this.count = count;
    }

    public void use(Character character) {

    }
}
