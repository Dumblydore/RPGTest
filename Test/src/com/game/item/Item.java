package com.game.item;

/**
 * Created by Maurice on 1/24/2015.
 */
public class Item {
    private String name;
    private String flavorText;
    private String effect;
    private int dmg;
    private int count;
    private int itemCap = 99;

    public static final String ITEM_TYPE_DAMAGE = "damage";
    public static final String ITEM_TYPE_HEAL = "heal";


    public Item(String name, String flavorText,String effect, int dmg, int count) {
        this.name = name;
        this.flavorText = flavorText;
        this.dmg = dmg;
        this.count = count;
        this.effect = effect;
    }

    public void add() throws AddItemCapException{
        if(count + 1 > itemCap)
            throw new AddItemCapException(""+1);
        count++;
    }

    public void add(int c) throws AddItemCapException{
        if(count + c > itemCap)
            throw new AddItemCapException(""+(itemCap-(count+c)));
        count += c;
    }

    public void remove() {
        count--;
    }

    public void remove(int count) {
        this.count-=count;
    }

    public int getCount() {
        return count;
    }

    public String getEffect(){
        return effect;
    }

    public int getDmg() {
        return dmg;
    }

    public class AddItemCapException extends Exception {
        public AddItemCapException(String message) {
            super(message);
        }
    }
}
