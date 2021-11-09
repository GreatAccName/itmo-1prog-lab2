// StoneEdge.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100D, 80D);
    }

    @Override
    protected String describe() {
        if (this.luckyChance) {
            return("used PhysicalMove \"StoneEdge\"; critical hit applied");
        }
        else { return("used PhysicalMove \"StoneEdge\""); }
    }

    // Stone Edge deals damage
    // and has an increased critical hit ratio (1/8 instead of 1/24).
    // Means x3 increased critical ratio.

    private boolean luckyChance = false;

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        double critHitRatio = 3D * att.getStat(Stat.SPEED) / 512D;
        if (critHitRatio > Math.random()) {
            this.luckyChance = true;
            return 2D;
        }
        else { return 1D; }
    }
}
