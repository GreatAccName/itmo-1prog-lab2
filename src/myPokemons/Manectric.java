// Manectric.java
package lib.myPokemons;

import ru.ifmo.se.pokemon.*;
import lib.myMoves.*;

public class Manectric extends Pokemon {
    public Manectric(String myName, int myLvl) {
        super(myName, myLvl);
        //           hp   att  def  spAtt spDef speed
        this.setStats(70D, 75D, 60D, 105D, 60D, 105D);
        this.setType(Type.ELECTRIC);

        this.addMove(new Confusion());
        this.addMove(new ChargeBeam());
        this.addMove(new Swagger());
        this.addMove(new ShadowBall());
    }
}
