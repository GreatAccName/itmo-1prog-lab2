// SweetScent.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove {
    public SweetScent() {
        super(Type.NORMAL, 0D, 100D);
    }

    @Override
    protected String describe() {
        return("used StatusMove \"SweetScent\"; defender's Evasion is lowered");
    }

    // Sweet Scent lowers the target's Evasion by one stage.

    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setMod(Stat.EVASION, -1);
    }
}
