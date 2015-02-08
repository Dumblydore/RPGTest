package unitTests.character;

import java.util.Random;

import static org.junit.Assert.*;

import com.game.ability.Attack;
import com.game.ability.Magic;
import com.game.ability.Skill;
import org.junit.Ignore;
import org.junit.Test;

public class Character {

    @Test
    public void attack() {
        com.game.character.Character character = new com.game.character.Character(0,100,10,10,10,10);
        int expectedMinimum = 120;
        int expectedMaximum = 150;
        for(int i = 0; i == 100; i++) {
            int actual = character.attack();
            assertTrue(expectedMinimum < actual && actual < expectedMaximum);
        }
    }

    @Test
    public void damaged() {
        com.game.character.Character character = new com.game.character.Character(0,100,10,10,10,10);
        Skill attack = new Skill(1,10, Attack.ATTACK_TYPE_PHYSICAL, "Test Skill", "Test Skill");
        int actualDamage = character.damaged(100,attack);
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
        Magic attack = new Magic(1, 10, Attack.ATTACK_TYPE_FIRE, "Test Magic", "Test Magic attack");
        com.game.character.Character character = new com.game.character.Character(0,100,10,10,10,10,10,weaknesses);
        int expected = 190;
        int actual = character.damaged(100,attack);
        assertEquals(expected,actual);
    }

    @Test
    public void useSkill() {
        String[] weaknesses = new String[1];
        weaknesses[0] = Attack.ATTACK_TYPE_FIRE;
        com.game.character.Character character = new com.game.character.Character(0, 100, 10, 10, 10, 10, 10, weaknesses);
        Skill skill = new Skill(1.5,10, Attack.ATTACK_TYPE_PHYSICAL, "Test Skill", "Attack to test the skill algorithm");
        int expectedMinimum = 180;
        int expectedMaximum = 225;
        for (int i = 0; i != 1000; i++) {
            int actual = character.attack(skill);
            assertTrue(expectedMinimum <= actual || actual <= expectedMaximum);
        }
    }

    @Test
    public void useMagic() {
        String[] weaknesses = new String[1];
        weaknesses[0] = Attack.ATTACK_TYPE_FIRE;
        com.game.character.Character character = new com.game.character.Character(0, 100, 10, 10, 10, 10, 10, weaknesses);
        Magic magic = new Magic(1.2, 10, Attack.ATTACK_TYPE_FIRE, "Test magic", "Attack to test the magic class");
        int expectedMinimum = 144;
        int expectedMaximum = 180;
        for (int i = 0; i != 1000; i++) {
            int actual = character.attack(magic);
            assertTrue(expectedMinimum <= actual || actual <= expectedMaximum);
        }
    }

    @Test
    public void MpDrain() {
        com.game.character.Character character = new com.game.character.Character(0, 100, 10, 10, 10, 10, 10, null);
        int expected = 40;
        Magic magic = new Magic(1.2, 10, Attack.ATTACK_TYPE_FIRE, "Test magic", "Attack to test the magic class");
        character.attack(magic);
        int actual = character.getMagicPoints();
        assertEquals(expected,actual);
    }
}
