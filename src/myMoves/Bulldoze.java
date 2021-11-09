// Bulldoze.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60D, 100D);
    }

    @Override
    protected String describe() {
        return("used PhysicalMove \"Bulldoze\"; defender's speed is lowered");
    }

    // Bulldoze deals damage and lowers the target's Speed by one stage.

    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setMod(Stat.SPEED, -1);
    }
}
