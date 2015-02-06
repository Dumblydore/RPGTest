package com.game.ability;

import com.game.character.*;
import com.game.character.Character;

/**
 * Created by Maurice on 2/3/2015.
 */
public class BasicAttack extends Attack {
    public BasicAttack(String type, int strength) {
        super((int)(strength*.8), type);
    }
}
