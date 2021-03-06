package cursor.rybak.model.race.kind.impl;

import cursor.rybak.model.hero.AbstractAbility;
import cursor.rybak.model.race.AbstractRace;
import cursor.rybak.model.race.kind.Races;

import java.util.Map;

public class Elf extends AbstractRace {

    public Elf(String heroName) {
        super(Races.Elf.getName(), heroName, Races.Elf.getCharisma(), Races.Elf.getStamina(),
                Races.Elf.getIntellect(), Races.Elf.getAgility(), Races.Elf.getConcentration());
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
