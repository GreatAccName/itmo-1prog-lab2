// Swagger.java
package lib.myMoves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0D, 85D);
    }

    @Override
    protected String describe() {
        return("used StatusMove \"Swagger\";\n" +
                "\tDefender is confused and his Attack is raised");
    }

    // Swagger confuses the target and raises its Attack by two stages.

    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect.confuse(def);
        def.setMod(Stat.ATTACK, +2);
    }
}
