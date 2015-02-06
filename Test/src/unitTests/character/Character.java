package unitTests.character;

import java.util.Random;

import static org.junit.Assert.*;

import com.game.ability.Attack;
import org.junit.Ignore;
import org.junit.Test;

public class Character {

    @Test
    public void attack() {
        com.game.character.Character character = new com.game.character.Character(0,100,10,10,10,10,10);
        int expectedMinimum = 120;
        int expectedMaximum = 150;
        for(int i = 0; i == 100; i++) {
            int actual = character.attack();
            assertTrue(expectedMinimum < actual && actual < expectedMaximum);
        }
    }

    @Test
    public void damaged() {
        com.game.character.Character character = new com.game.character.Character(0,100,10,10,10,10,10);
        int actualDamage = character.damaged(100,Attack.ATTACK_TYPE_PHYSICAL);
        int expectedDamage = 90;
        int expectedHealth = 10;
        int actualHealth = character.getHealth();
        assertEquals(expectedDamage,actualDamage);
        assertEquals(expectedHealth,actualHealth);
    }

    @Test
    public void damagedWeakness() {
        String[] weaknesses = new String[1];
        weaknesses[0] = Attack.ATTACK_TYPE_FIRE;
        com.game.character.Character character = new com.game.character.Character(0,100,10,10,10,10,10,weaknesses);
        int expected = 190;
        int actual = character.damaged(100,Attack.ATTACK_TYPE_FIRE);
        assertEquals(expected,actual);
    }
}
