// ShadowBall.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80D, 100D);
    }

    @Override
    protected String describe() {
        if (this.luckyChance) {
            return("used SpecialMove \"ShadowBall\";\n" +
                    "\tDefender's Special Defence is lowered");
        }
        else { return("used SpecialMove \"ShadowBall\""); }
    }

    // Shadow Ball deals damage and has a 20% chance
    // of lowering the target's Special Defense by one stage.

    private boolean luckyChance = false;

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (0.2 > Math.random()) {
            this.luckyChance = true;
            def.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
}
