package cursor.rybak.model.race.kind.impl;

import cursor.rybak.model.hero.AbstractAbility;
import cursor.rybak.model.race.AbstractRace;
import cursor.rybak.model.race.kind.Races;

import java.util.Map;

public class Human extends AbstractRace {

    public Human(String heroName) {
        super(Races.Human.getName(), heroName, Races.Human.getCharisma(), Races.Human.getStamina(),
                Races.Human.getIntellect(), Races.Human.getAgility(), Races.Human.getConcentration());
    }

    /**
     * @return int, damage point
     * functionality defined
     * in certain hero
     */
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public Map<String, Map<String, AbstractAbility>> getSpecialAttacks() {
        return null;
    }

    @Override
    public Map<String, int[]> getAttacks() {
        return null;
    }
}
