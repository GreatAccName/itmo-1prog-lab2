// DynamicPunch.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class DynamicPunch extends PhysicalMove {
    public DynamicPunch() {
        super(Type.FIGHTING, 100D, 50D);
    }

    @Override
    protected String describe() {
        return("used PhysicalMove \"DynamicPunch\"; defender is confused");
    }

    // Dynamic Punch deals damage and confuses the target, if it hits
    // (no verification required because it has already been done).

    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect.confuse(def);
        // def.confuse();
    }
}
