// PlayNice.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove {
    public PlayNice() {
        super(Type.NORMAL, 0D, 0D);
    }

    @Override
    protected String describe() {
        return("used StatusMove \"PlayNice\"; defender's Attack is lowered");
    }

    // Play Nice lowers the target's Attack by one stage.

    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setMod(Stat.ATTACK, -1);
    }
}
