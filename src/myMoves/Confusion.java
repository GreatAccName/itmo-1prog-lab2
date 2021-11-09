// Confusion.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove {
    public Confusion() {
        super(Type.PSYCHIC, 50D, 100D);
    }

    @Override
    protected String describe() {
        if (this.luckyChance) {
            return("used SpecialMove \"Confusion\"; defender is confused");
        }
        return("used SpecialMove \"Confusion\"");
    }

    // Confusion deals damage and has a 10% chance of confusing the target.

    private boolean luckyChance = false;

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (0.1 > Math.random()) {
            this.luckyChance = true;
            Effect.confuse(def);
            // def.confuse();
        }
    }
}
