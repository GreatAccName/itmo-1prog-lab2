// DoubleTeam.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0D, 0D);
    }

    @Override
    protected String describe() {
        return("used StatusMove \"DoubleTeam\"; attaker's Evasion is raised");
    }

    // Double Team raises the user's Evasiveness by one stage,
    // thus making the user more difficult to hit.

    @Override
    protected void applySelfEffects(Pokemon att) {
        att.setMod(Stat.EVASION, +1);
    }
}
