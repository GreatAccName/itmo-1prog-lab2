// LeechLife.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class LeechLife extends PhysicalMove {
    public LeechLife() {
        super(Type.BUG, 80D, 100D);
    }

    @Override
    protected String describe() {
        return("used PhysicalMove \"LeechLife\"; attacker recovered HP");
    }

    // Leech Life deals damage and the user will recover 50% of the HP drained.

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) -Math.round(damage * 0.5));
    }
}
