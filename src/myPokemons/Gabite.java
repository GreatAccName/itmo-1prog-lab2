// Gabite.java
package lib.myPokemons;

import ru.ifmo.se.pokemon.*;
import lib.myMoves.*;

public class Gabite extends Pokemon {
    public Gabite(String myName, int myLvl) {
        super(myName, myLvl);
        //           hp   att  def  spAtt spDef speed
        this.setStats(68D, 90D, 65D, 50D, 55D, 82D);
        this.setType(Type.DRAGON, Type.GROUND);

        this.addMove(new Confusion());
        this.addMove(new ChargeBeam());
        this.addMove(new Swagger());
    }
}
