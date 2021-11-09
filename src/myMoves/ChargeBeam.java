// ChargeBeam.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50D, 90D);
    }

    @Override
    protected String describe() {
        if (this.luckyChance) {
            return("used SpecialMove \"ChargeBeam\";\n" +
                    "\tAtteker's Special Attack is raised");
        }
        else { return("used SpecialMove \"ChargeBeam\""); }
    }

    // Charge Beam deals damage and has a 70% chance of
    // raising the user's Special Attack by one stage.

    private boolean luckyChance = false;

    @Override
    protected void applySelfEffects(Pokemon att) {
        if (0.7 > Math.random()) {
            this.luckyChance = true;
            att.setMod(Stat.SPECIAL_ATTACK, +1);
        }
    }
}
