// TeeterDance.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class TeeterDance extends StatusMove {
    public TeeterDance() {
        super(Type.NORMAL, 0D, 100D);
    }

    @Override
    protected String describe() {
        return("used StatusMove \"TeeterDance\"; defender is confused");
    }

    // Teeter Dance causes opponent to become confused.

    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect.confuse(def);
    }
}
